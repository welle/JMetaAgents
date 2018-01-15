package aka.jmetaagents.main.jallocine;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.util.logging.Level;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jhttprequest.main.HTTPManager;
import aka.jhttprequest.main.common.HTTPRequestData;
import aka.jhttprequest.main.common.HTTPResponseBufferedImage;
import aka.jhttprequest.main.common.HTTPResponseString;
import aka.jhttprequest.main.exceptions.HTTPException;
import aka.jmetaagents.main.AbstractAgent;
import aka.jmetaagents.main.jallocine.constants.JAllocineConstants;
import aka.jmetaagents.main.jallocine.exceptions.JAllocineException;
import aka.jmetaagents.main.jallocine.pojo.jfilmography.JFilmography;
import aka.jmetaagents.main.jallocine.pojo.jfilmography.JFilmographyJacksonMapper;
import aka.jmetaagents.main.jallocine.pojo.jmovie.JMovie;
import aka.jmetaagents.main.jallocine.pojo.jmovie.JMovieJacksonMapper;
import aka.jmetaagents.main.jallocine.pojo.jmoviesearch.JMovieSearch;
import aka.jmetaagents.main.jallocine.pojo.jmoviesearch.JMovieSearchJacksonMapper;
import aka.jmetaagents.main.jallocine.pojo.jperson.JPerson;
import aka.jmetaagents.main.jallocine.pojo.jperson.JPersonJacksonMapper;
import aka.jmetaagents.main.jallocine.pojo.jpersonsearch.JPersonSearch;
import aka.jmetaagents.main.jallocine.pojo.jpersonsearch.JPersonSearchJacksonMapper;
import aka.jmetaagents.main.jallocine.pojo.jtvshow.JTVShow;
import aka.jmetaagents.main.jallocine.pojo.jtvshow.JTVShowJacksonMapper;
import aka.jmetaagents.main.jallocine.pojo.jtvshowepisode.JTVShowEpisode;
import aka.jmetaagents.main.jallocine.pojo.jtvshowepisode.JTVShowEpisodeJacksonMapper;
import aka.jmetaagents.main.jallocine.pojo.jtvshowseason.JTVShowSeason;
import aka.jmetaagents.main.jallocine.pojo.jtvshowseason.JTVShowSeasonJacksonMapper;
import aka.jmetaagents.main.jallocine.pojo.jtvshowssearch.JTVShowsSearch;
import aka.jmetaagents.main.jallocine.pojo.jtvshowssearch.JTVShowsSearchJacksonMapper;

/**
 * JAllocine.
 *
 * @author Charlotte
 */
public final class JAllocine extends AbstractAgent {

    @NonNull
    private final HTTPManager httpManager;
    private @NonNull final String partner;

    /**
     * Constructor
     *
     * @param partner API KEY
     */
    public JAllocine(@NonNull final String partner) {
        super();

        this.partner = partner;
        this.httpManager = new HTTPManager();
    }

    /**
     * Get all movie details.
     *
     * @param id code id of the movie
     * @return Movie object containing result, null if not found
     * @throws JAllocineException
     * @see JMovie
     */
    @Nullable
    public final JMovie getMovie(final int id) throws JAllocineException {
        JMovie result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.MOVIE_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.PROFILE, JAllocineConstants.PROFILE_VALUE);
            httpRequestData.addParams(JAllocineConstants.CODE, Integer.valueOf(id));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            getLogger().logp(Level.SEVERE, "JAllocine", "getMovie", e.getMessage(), e);
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get all person info.
     *
     * @param id code id of the person
     * @return Person object containing result, null if not found
     * @throws JAllocineException
     * @see JPerson
     */
    @Nullable
    public final JPerson getPerson(final int id) throws JAllocineException {
        JPerson result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.PERSON_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.PROFILE, JAllocineConstants.PROFILE_VALUE);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_MOVIE);
            httpRequestData.addParams(JAllocineConstants.MEDIAFMT, JAllocineConstants.MEDIAFMT_VALUE);
            httpRequestData.addParams(JAllocineConstants.CODE, Integer.valueOf(id));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JPersonJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get all filmography person info.
     *
     * @param id code id of the person
     * @return Person object containing result, null if not found
     * @throws JAllocineException
     * @see JFilmography
     */
    @Nullable
    public final JFilmography getFilmography(final int id) throws JAllocineException {
        JFilmography result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.FILMO_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.PROFILE, JAllocineConstants.PROFILE_VALUE);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_MOVIE);
            httpRequestData.addParams(JAllocineConstants.CODE, Integer.valueOf(id));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JFilmographyJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show info.
     *
     * @param id code id of the TV show
     * @return Person object containing result, null if not found
     * @throws JAllocineException
     * @see JTVShow
     */
    @Nullable
    public final JTVShow getTVShow(final int id) throws JAllocineException {
        JTVShow result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.TV_SHOW_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.PROFILE, JAllocineConstants.PROFILE_VALUE);
            httpRequestData.addParams(JAllocineConstants.CODE, Integer.valueOf(id));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show season info.
     *
     * @param id code id of the tv show season
     * @return Person object containing result, null if not found
     * @throws JAllocineException
     * @see JTVShowSeason
     */
    @Nullable
    public final JTVShowSeason getTVShowSeason(final int id) throws JAllocineException {
        JTVShowSeason result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.TV_SHOW_SEASON_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.PROFILE, JAllocineConstants.PROFILE_VALUE);
            httpRequestData.addParams(JAllocineConstants.CODE, Integer.valueOf(id));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowSeasonJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show episode info.
     *
     * @param id code id of the tv show episode
     * @return Person object containing result, null if not found
     * @throws JAllocineException
     * @see JTVShowEpisode
     */
    @Nullable
    public final JTVShowEpisode getTVShowEpisode(final int id) throws JAllocineException {
        JTVShowEpisode result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.TV_SHOW_EPISODE_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.PROFILE, JAllocineConstants.PROFILE_VALUE);
            httpRequestData.addParams(JAllocineConstants.CODE, Integer.valueOf(id));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowEpisodeJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search movie with the given name.
     *
     * @param name of the movie
     * @return result of the search
     * @throws JAllocineException
     * @see JMovieSearch
     */
    @Nullable
    public final JMovieSearch searchMovie(@NonNull final String name) throws JAllocineException {
        JMovieSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.SEARCH_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_MOVIE);
            httpRequestData.addParams(JAllocineConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search person with the given name.
     *
     * @param name of the person
     * @return result of the search
     * @throws JAllocineException
     * @see JPersonSearch
     */
    @Nullable
    public final JPersonSearch searchPerson(@NonNull final String name) throws JAllocineException {
        JPersonSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.SEARCH_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_PERSON);
            httpRequestData.addParams(JAllocineConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JPersonSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search TV Series with the given name.
     *
     * @param name of the TV series
     * @return result of the search
     * @throws JAllocineException
     * @see JTVShowsSearch
     */
    @Nullable
    public final JTVShowsSearch searchTVSeries(@NonNull final String name) throws JAllocineException {
        JTVShowsSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.SEARCH_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_TV_SHOW);
            httpRequestData.addParams(JAllocineConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowsSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search movie with the given name with a maximum of count.
     *
     * @param name of the movie
     * @param count number of result to return
     * @return result of the search
     * @throws JAllocineException
     * @see JMovieSearch
     */
    @Nullable
    public final JMovieSearch searchMovie(@NonNull final String name, final int count) throws JAllocineException {
        JMovieSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.SEARCH_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_MOVIE);
            httpRequestData.addParams(JAllocineConstants.COUNT, Integer.valueOf(count));
            httpRequestData.addParams(JAllocineConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search person with the given name with a maximum of count.
     *
     * @param name of the person
     * @param count number of result to return
     * @return result of the search
     * @throws JAllocineException
     * @see JPersonSearch
     */
    @Nullable
    public final JPersonSearch searchPerson(@NonNull final String name, final int count) throws JAllocineException {
        JPersonSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.SEARCH_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_PERSON);
            httpRequestData.addParams(JAllocineConstants.COUNT, Integer.valueOf(count));
            httpRequestData.addParams(JAllocineConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JPersonSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search TV series with the given name with a maximum of count.
     *
     * @param name of the TV series
     * @param count number of result to return
     * @return result of the search
     * @throws JAllocineException
     * @see JTVShowsSearch
     */
    @Nullable
    public final JTVShowsSearch searchTVSeries(@NonNull final String name, final int count) throws JAllocineException {
        JTVShowsSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.SEARCH_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_TV_SHOW);
            httpRequestData.addParams(JAllocineConstants.COUNT, Integer.valueOf(count));
            httpRequestData.addParams(JAllocineConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowsSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search movie with the given name with a maximum of count at given page.
     *
     * @param name of the movie
     * @param count number of result to return
     * @param page page number of results to display (page 10 results by default)
     * @return result of the search
     * @throws JAllocineException
     * @see JMovieSearch
     */
    @Nullable
    public final JMovieSearch searchMovie(@NonNull final String name, final int count, final int page) throws JAllocineException {
        JMovieSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.SEARCH_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_MOVIE);
            httpRequestData.addParams(JAllocineConstants.COUNT, Integer.valueOf(count));
            httpRequestData.addParams(JAllocineConstants.PAGE, Integer.valueOf(page));
            httpRequestData.addParams(JAllocineConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search person with the given name with a maximum of count at given page.
     *
     * @param name of the person
     * @param count number of result to return
     * @param page page number of results to display (page 10 results by default)
     * @return result of the search
     * @throws JAllocineException
     * @see JPersonSearch
     */
    @Nullable
    public final JPersonSearch searchPerson(@NonNull final String name, final int count, final int page) throws JAllocineException {
        JPersonSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.SEARCH_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_PERSON);
            httpRequestData.addParams(JAllocineConstants.COUNT, Integer.valueOf(count));
            httpRequestData.addParams(JAllocineConstants.PAGE, Integer.valueOf(page));
            httpRequestData.addParams(JAllocineConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JPersonSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search TV series with the given name with a maximum of count at given page.
     *
     * @param name of the TV series
     * @param count number of result to return
     * @param page page number of results to display (page 10 results by default)
     * @return result of the search
     * @throws JAllocineException
     * @see JTVShowsSearch
     */
    @Nullable
    public final JTVShowsSearch searchTVSeries(@NonNull final String name, final int count, final int page) throws JAllocineException {
        JTVShowsSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JAllocineConstants.SEARCH_URL);
            httpRequestData.addParams(JAllocineConstants.FORMAT, JAllocineConstants.FORMAT_VALUE);
            httpRequestData.addParams(JAllocineConstants.PARTNER, this.partner);
            httpRequestData.addParams(JAllocineConstants.FILTER, JAllocineConstants.FILTER_TV_SHOW);
            httpRequestData.addParams(JAllocineConstants.COUNT, Integer.valueOf(count));
            httpRequestData.addParams(JAllocineConstants.PAGE, Integer.valueOf(page));
            httpRequestData.addParams(JAllocineConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowsSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * This method does not matter if the url is absolute or relative.
     *
     * @param url
     * @return image from the URL
     * @throws JAllocineException
     * @see BufferedImage
     */
    @NonNull
    public final BufferedImage getImage(@NonNull final String url) throws JAllocineException {
        BufferedImage result = null;

        try {
            HTTPRequestData httpRequestData;
            if (url.toLowerCase().contains("http")) {
                httpRequestData = new HTTPRequestData(url);
            } else {
                final StringBuilder sb = new StringBuilder();
                sb.append(JAllocineConstants.IMAGE_URL);
                sb.append(url);
                final String newURL = sb.toString();
                httpRequestData = new HTTPRequestData(newURL);
            }

            final HTTPResponseBufferedImage response = (HTTPResponseBufferedImage) this.httpManager.sendGetRequest(httpRequestData);
            result = response.getContent();
        } catch (final HTTPException | MalformedURLException e) {
            throw new JAllocineException(e.getMessage(), e.getCause());
        }

        return result;
    }
}
