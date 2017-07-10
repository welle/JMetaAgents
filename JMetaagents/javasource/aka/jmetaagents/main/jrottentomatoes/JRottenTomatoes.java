package aka.jmetaagents.main.jrottentomatoes;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jhttprequest.main.HTTPManager;
import aka.jhttprequest.main.common.HTTPRequestData;
import aka.jhttprequest.main.common.HTTPResponseBufferedImage;
import aka.jhttprequest.main.common.HTTPResponseString;
import aka.jhttprequest.main.exceptions.HTTPException;
import aka.jmetaagents.main.AbstractAgent;
import aka.jmetaagents.main.jrottentomatoes.constants.JRottenTomatoesConstants;
import aka.jmetaagents.main.jrottentomatoes.exceptions.JRottenTomatoesException;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmovie.JMovie;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmovie.JMovieJacksonMapper;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviealias.JMovieAlias;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviealias.JMovieAliasJacksonMapper;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviecast.JMovieCast;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviecast.JMovieCastJacksonMapper;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesearch.JMovieSearch;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesearch.JMovieSearchJacksonMapper;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesimilar.JMovieSimilar;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesimilar.JMovieSimilarJacksonMapper;
import aka.swissknife.data.TextUtils;

/**
 * JRottenTomatoes.
 *
 * @author Charlotte
 */
public final class JRottenTomatoes extends AbstractAgent {

    @NonNull
    private final HTTPManager httpManager;
    private @NonNull final String apiKey;

    /**
     * Constructor.
     *
     * @param apiKey API key
     */
    public JRottenTomatoes(@NonNull final String apiKey) {
        super();

        this.apiKey = apiKey;
        this.httpManager = new HTTPManager();
    }

    /**
     * Get all movie details
     *
     * @param id code id of the movie
     * @return Movie object containing result, null if not found
     * @throws JRottenTomatoesException
     * @see JMovie
     */
    @Nullable
    public final JMovie getMovie(@NonNull final String id) throws JRottenTomatoesException {
        JMovie result = null;

        try {
            final String url = TextUtils.pack(JRottenTomatoesConstants.MOVIE_URL, id, ".json?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JRottenTomatoesConstants.API_KEY, this.apiKey);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JRottenTomatoesException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get all movie details of the given IMDB movie id.
     *
     * @param id code id of the movie on the IMDB
     * @return Movie object containing result, null if not found
     * @throws JRottenTomatoesException
     * @see JMovieAlias
     */
    @Nullable
    public final JMovieAlias getMovieByIMDBId(@NonNull final String id) throws JRottenTomatoesException {
        JMovieAlias result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JRottenTomatoesConstants.MOVIE_ALIAS_URL);
            httpRequestData.addParams(JRottenTomatoesConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JRottenTomatoesConstants.TYPE, JRottenTomatoesConstants.TYPE_VALUE);
            final String imdbId = id.replace(JRottenTomatoesConstants.TT, "");
            httpRequestData.addParams(JRottenTomatoesConstants.ID, imdbId);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieAliasJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JRottenTomatoesException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search movie.
     *
     * @param name to search
     * @param count number of result to return (30 if null)
     * @param page page number of results to display (1 if null)
     * @return result of the search
     * @throws JRottenTomatoesException
     * @see JMovieSearch
     */
    @Nullable
    public final JMovieSearch searchMovie(@NonNull final String name, @Nullable final Integer count, @Nullable final Integer page) throws JRottenTomatoesException {
        JMovieSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JRottenTomatoesConstants.SEARCH_MOVIE_URL);
            httpRequestData.addParams(JRottenTomatoesConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JRottenTomatoesConstants.QUERY, name);
            httpRequestData.addParams(JRottenTomatoesConstants.PAGE_LIMIT, getCount(count, 30, 1000));
            httpRequestData.addParams(JRottenTomatoesConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JRottenTomatoesException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie similar.
     *
     * @param id movie id
     * @param limit Limit the number of similar movies to show (if null: 5, max: 5)
     * @return Movie similar result
     * @throws JRottenTomatoesException
     * @see JMovieSimilar
     */
    @Nullable
    public final JMovieSimilar getMovieSimilar(@NonNull final String id, @Nullable final Integer limit) throws JRottenTomatoesException {
        JMovieSimilar result = null;

        try {
            final String url = TextUtils.pack(JRottenTomatoesConstants.MOVIE_URL, id, "/similar.json?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JRottenTomatoesConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JRottenTomatoesConstants.LIMIT, getCount(limit, 5, 5));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSimilarJacksonMapper.class, jsonString);
        } catch (

        final HTTPException | MalformedURLException e) {
            throw new JRottenTomatoesException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie cast.
     *
     * @param id movie id
     * @return movie cast result
     * @throws JRottenTomatoesException
     * @see JMovieCast
     */
    @Nullable
    public final JMovieCast getMovieCast(@NonNull final String id) throws JRottenTomatoesException {
        JMovieCast result = null;

        try {
            final String url = TextUtils.pack(JRottenTomatoesConstants.MOVIE_URL, id, "/cast.json?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JRottenTomatoesConstants.API_KEY, this.apiKey);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieCastJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JRottenTomatoesException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * The URL must be absolute.
     *
     * @param url
     * @return image from the URL
     * @throws JRottenTomatoesException
     * @see BufferedImage
     */
    @Nullable
    public final BufferedImage getImage(@NonNull final String url) throws JRottenTomatoesException {
        BufferedImage result = null;
        try {
            HTTPRequestData httpRequestData;
            if (url.toLowerCase().contains("http")) {
                httpRequestData = new HTTPRequestData(url);
                final HTTPResponseBufferedImage response = (HTTPResponseBufferedImage) this.httpManager.sendGetRequest(httpRequestData);
                result = response.getContent();
            }

        } catch (final HTTPException | MalformedURLException e) {
            throw new JRottenTomatoesException(e.getMessage(), e.getCause());
        }

        return result;
    }
}
