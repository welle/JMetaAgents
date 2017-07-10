package aka.jmetaagents.main.jimdb;

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
import aka.jmetaagents.main.jimdb.constants.JIMDBConstants;
import aka.jmetaagents.main.jimdb.exceptions.JIMDBException;
import aka.jmetaagents.main.jimdb.pojo.jmovie.JMovie;
import aka.jmetaagents.main.jimdb.pojo.jmovie.JMovieJacksonMapper;
import aka.jmetaagents.main.jimdb.pojo.jmoviesearch.JMovieSearch;
import aka.jmetaagents.main.jimdb.pojo.jmoviesearch.JMovieSearchJacksonMapper;

/**
 * JIMDB.
 *
 * @author Charlotte
 */
public final class JIMDB extends AbstractAgent {

    @NonNull
    private final HTTPManager httpManager;
    private @NonNull final String imdbApiIDValue;
    private @NonNull final String imdbApiValue;
    private @NonNull final String imdbDeviceValue;
    private @NonNull final String imdbSigValue;

    /**
     * Constructor.
     *
     * @param imdbApiIDValue IMDB API ID value
     * @param imdbApiValue IMDB API value
     * @param imdbDeviceValue IMDB Device value
     * @param imdbSigValue IMDB Sig value
     */
    public JIMDB(@NonNull final String imdbApiIDValue, @NonNull final String imdbApiValue, @NonNull final String imdbDeviceValue, @NonNull final String imdbSigValue) {
        super();
        this.imdbApiIDValue = imdbApiIDValue;
        this.imdbApiValue = imdbApiValue;
        this.imdbDeviceValue = imdbDeviceValue;
        this.imdbSigValue = imdbSigValue;

        this.httpManager = new HTTPManager();
    }

    /**
     * Get all movie details
     *
     * @param id code id of the movie
     * @return Movie object containing result
     * @throws JIMDBException
     * @see JMovie
     */
    @Nullable
    public final JMovie getMovie(@NonNull final String id) throws JIMDBException {
        JMovie result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JIMDBConstants.MOVIE_URL);
            httpRequestData.addParams(JIMDBConstants.API, this.imdbApiValue);
            httpRequestData.addParams(JIMDBConstants.API_ID, this.imdbApiIDValue);
            httpRequestData.addParams(JIMDBConstants.SIG, this.imdbSigValue);
            httpRequestData.addParams(JIMDBConstants.TCONST, id);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JIMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * @param name
     * @return result of the search
     * @throws JIMDBException
     * @see JMovieSearch
     */
    @Nullable
    public final JMovieSearch searchMovie(@NonNull final String name) throws JIMDBException {
        JMovieSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JIMDBConstants.SEARCH_MOVIE_URL);
            httpRequestData.addParams(JIMDBConstants.API, this.imdbApiValue);
            httpRequestData.addParams(JIMDBConstants.API_ID, this.imdbApiIDValue);
            httpRequestData.addParams(JIMDBConstants.SIG, this.imdbSigValue);
            httpRequestData.addParams(JIMDBConstants.DEVICE, this.imdbDeviceValue);
            httpRequestData.addParams(JIMDBConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JIMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * @param name
     * @param count number of result to return
     * @return result of the search
     * @throws JIMDBException
     * @see JMovieSearch
     */
    @Nullable
    public final JMovieSearch searchMovie(@NonNull final String name, final int count) throws JIMDBException {
        JMovieSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JIMDBConstants.SEARCH_MOVIE_URL);
            httpRequestData.addParams(JIMDBConstants.API, this.imdbApiValue);
            httpRequestData.addParams(JIMDBConstants.API_ID, this.imdbApiIDValue);
            httpRequestData.addParams(JIMDBConstants.SIG, this.imdbSigValue);
            httpRequestData.addParams(JIMDBConstants.DEVICE, this.imdbDeviceValue);
            httpRequestData.addParams(JIMDBConstants.COUNT, Integer.valueOf(count));
            httpRequestData.addParams(JIMDBConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JIMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * @param name
     * @param count number of result to return
     * @param page page number of results to display (page 10 results by default)
     * @return result of the search
     * @throws JIMDBException
     * @see JMovieSearch
     */
    @Nullable
    public final JMovieSearch searchMovie(@NonNull final String name, final int count, final int page) throws JIMDBException {
        JMovieSearch result = null;
        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JIMDBConstants.SEARCH_MOVIE_URL);
            httpRequestData.addParams(JIMDBConstants.API, this.imdbApiValue);
            httpRequestData.addParams(JIMDBConstants.API_ID, this.imdbApiIDValue);
            httpRequestData.addParams(JIMDBConstants.SIG, this.imdbSigValue);
            httpRequestData.addParams(JIMDBConstants.DEVICE, this.imdbDeviceValue);
            httpRequestData.addParams(JIMDBConstants.COUNT, Integer.valueOf(count));
            httpRequestData.addParams(JIMDBConstants.PAGE, Integer.valueOf(page));
            httpRequestData.addParams(JIMDBConstants.QUERY, name);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JIMDBException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get image from the given URL.
     *
     * @param url must be absolute
     * @return image from the URL
     * @throws JIMDBException
     * @see BufferedImage
     */
    @Nullable
    public final BufferedImage getImage(@NonNull final String url) throws JIMDBException {
        BufferedImage result = null;

        try {
            if (url.toLowerCase().contains("http")) {
                final HTTPRequestData httpRequestData = new HTTPRequestData(url);
                final HTTPResponseBufferedImage response = (HTTPResponseBufferedImage) this.httpManager.sendGetRequest(httpRequestData);
                result = response.getContent();
            }
        } catch (final HTTPException | MalformedURLException e) {
            throw new JIMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

}
