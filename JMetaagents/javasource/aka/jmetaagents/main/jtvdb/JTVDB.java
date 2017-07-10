package aka.jmetaagents.main.jtvdb;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Locale;

import org.apache.http.entity.StringEntity;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jhttprequest.main.HTTPManager;
import aka.jhttprequest.main.common.HTTPRequestData;
import aka.jhttprequest.main.common.HTTPResponseBufferedImage;
import aka.jhttprequest.main.common.HTTPResponseString;
import aka.jhttprequest.main.constants.MimeTypeConstants;
import aka.jhttprequest.main.exceptions.HTTPException;
import aka.jmetaagents.main.AbstractAgent;
import aka.jmetaagents.main.jtvdb.constants.JTVDBConstants;
import aka.jmetaagents.main.jtvdb.constants.KEY_TYPE;
import aka.jmetaagents.main.jtvdb.exceptions.JTVDBException;
import aka.jmetaagents.main.jtvdb.login.JTVDBLogin;
import aka.jmetaagents.main.jtvdb.login.JTVDBLoginJacksonMapper;
import aka.jmetaagents.main.jtvdb.login.JTVDBResponseLogin;
import aka.jmetaagents.main.jtvdb.login.JTVDBResponseLoginJacksonMapper;
import aka.jmetaagents.main.jtvdb.pojo.jtvshow.JTVShow;
import aka.jmetaagents.main.jtvdb.pojo.jtvshow.JTVShowJacksonMapper;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowactor.JTVShowActor;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowactor.JTVShowActorJacksonMapper;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowepisode.JTVShowEpisode;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowepisode.JTVShowEpisodeJacksonMapper;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowimage.JTVShowImage;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowimage.JTVShowImageJacksonMapper;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowsearch.JTVShowSearch;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowsearch.JTVShowSearchJacksonMapper;
import aka.swissknife.data.TextUtils;

/**
 * JTVDB.
 *
 * @author Charlotte
 */
public final class JTVDB extends AbstractAgent {

    @NonNull
    private final HTTPManager httpManager;
    private @NonNull final String token;

    /**
     * Constructor.
     *
     * @param apikey API key
     * @param userName user name
     * @param userkey user key
     * @throws JTVDBException
     */
    public JTVDB(@NonNull final String apikey, @NonNull final String userName, @NonNull final String userkey) throws JTVDBException {
        super();

        this.httpManager = new HTTPManager();
        final String currentToken = getAPIKey(apikey, userName, userkey);
        if (currentToken == null) {
            throw new JTVDBException("Could not retrieve token.");
        }
        this.token = currentToken;
    }

    /**
     * Get token.
     *
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    @Nullable
    private String getAPIKey(@NonNull final String apikey, @NonNull final String userName, @NonNull final String userkey) throws JTVDBException {
        String result = null;

        try {
            final String url = TextUtils.pack(JTVDBConstants.LOGIN_URL);
            final JTVDBLogin jtvdbLogin = new JTVDBLogin(apikey, userName, userkey);
            final String json = JTVDBLoginJacksonMapper.writeValue(jtvdbLogin);
            assert json != null;

            final HTTPRequestData httpRequestData = new HTTPRequestData(url, new StringEntity(json));
            httpRequestData.addHeader("Accept", MimeTypeConstants.APPLICATION_JSON);
            httpRequestData.addHeader("Content-Type", MimeTypeConstants.APPLICATION_JSON);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendPostRequest(httpRequestData);
            final String jsonString = response.getContent();

            @Nullable
            final JTVDBResponseLogin jtvdbResponseLogin = readValue(JTVDBResponseLoginJacksonMapper.class, jsonString);
            if (jtvdbResponseLogin != null) {
                result = jtvdbResponseLogin.getToken();
            }
        } catch (final HTTPException | IOException e) {
            throw new JTVDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show details.
     *
     * @param id code id of the TV show
     * @param locale Locale
     * @return object containing result
     * @throws JTVDBException
     * @see JTVShow
     */
    @Nullable
    public final JTVShow getTVShow(@NonNull final String id, @Nullable final Locale locale) throws JTVDBException {
        JTVShow result = null;

        try {
            final String url = TextUtils.pack(JTVDBConstants.TV_SHOW_URL, id);

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Accept", MimeTypeConstants.APPLICATION_JSON);
            httpRequestData.addHeader("Accept-Language", getLanguage(locale));
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTVDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show episode details.
     *
     * @param id code id of the TV show episode
     * @param locale Locale
     * @return object containing result
     * @throws JTVDBException
     * @see JTVShowEpisode
     */
    @Nullable
    public final JTVShowEpisode getTVShowEpisode(@NonNull final String id, @Nullable final Locale locale) throws JTVDBException {
        JTVShowEpisode result = null;

        try {
            final String url = TextUtils.pack(JTVDBConstants.TV_SHOW_EPISODE_URL, id);

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Accept", MimeTypeConstants.APPLICATION_JSON);
            httpRequestData.addHeader("Accept-Language", getLanguage(locale));
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowEpisodeJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTVDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search TV shows.
     *
     * @param query The query param is your search text
     * @param locale (optional)
     * @return TV shows search object containing result
     * @throws JTVDBException
     * @see JTVShowSearch
     */
    @Nullable
    public final JTVShowSearch searchTVShows(@NonNull final String query, @Nullable final Locale locale) throws JTVDBException {
        JTVShowSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTVDBConstants.SEARCH_TV_SHOWS_URL);
            httpRequestData.addHeader("Accept", MimeTypeConstants.APPLICATION_JSON);
            httpRequestData.addHeader("Accept-Language", getLanguage(locale));
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);

            httpRequestData.addParams(JTVDBConstants.NAME, query);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTVDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search TV show details by IMDB id.
     *
     * @param id IMDB id of the TV show
     * @param locale (optional).
     * @return object containing result
     * @throws JTVDBException
     * @see JTVShowSearch
     */
    @Nullable
    public final JTVShowSearch searchTVShowByIMDBid(@NonNull final String id, @Nullable final Locale locale) throws JTVDBException {
        JTVShowSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTVDBConstants.SEARCH_TV_SHOWS_URL);
            httpRequestData.addHeader("Accept", MimeTypeConstants.APPLICATION_JSON);
            httpRequestData.addHeader("Accept-Language", getLanguage(locale));
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);

            httpRequestData.addParams(JTVDBConstants.IMDB_ID, id);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTVDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show actors.
     *
     * @param id code id of the TV show
     * @param season season number (0 for special)
     * @param locale
     * @return object containing result
     * @throws JTVDBException
     * @see JTVShowActor
     */
    @Nullable
    public final JTVShowSearch getTVShowSeason(@NonNull final String id, @NonNull final String season, @Nullable final Locale locale) throws JTVDBException {
        JTVShowSearch result = null;

        try {
            final String url = TextUtils.pack(JTVDBConstants.TV_SHOW_URL, id, "/episodes/query?");

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Accept", MimeTypeConstants.APPLICATION_JSON);
            httpRequestData.addHeader("Accept-Language", getLanguage(locale));
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);

            httpRequestData.addParams("airedSeason", season);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTVDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show actors.
     *
     * @param id code id of the TV show
     * @return object containing result
     * @throws JTVDBException
     * @see JTVShowActor
     */
    @Nullable
    public final JTVShowActor getTVShowActors(@NonNull final String id) throws JTVDBException {
        JTVShowActor result = null;

        try {
            final String url = TextUtils.pack(JTVDBConstants.TV_SHOW_URL, id, "/actors");

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Accept", MimeTypeConstants.APPLICATION_JSON);
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowActorJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTVDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show images.
     *
     * @param id code id of the TV show
     * @param keyType type of image
     * @param locale
     * @return object containing result
     * @throws JTVDBException
     * @see JTVShowImage
     * @see KEY_TYPE
     */
    @Nullable
    public final JTVShowImage getTVShowImages(@NonNull final String id, @NonNull final KEY_TYPE keyType, @Nullable final Locale locale) throws JTVDBException {
        JTVShowImage result = null;

        try {
            final String url = TextUtils.pack(JTVDBConstants.TV_SHOW_URL, id, "/images/query?");

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Accept", MimeTypeConstants.APPLICATION_JSON);
            httpRequestData.addHeader("Accept-Language", getLanguage(locale));
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);

            httpRequestData.addParams("keyType", keyType.getValue());

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowImageJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTVDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * This method does not matter if the URL is absolute or relative.
     *
     * @param url
     * @return image from the URL
     * @throws JTVDBException
     * @see BufferedImage
     */
    @Nullable
    public final BufferedImage getImage(@NonNull final String url) throws JTVDBException {
        BufferedImage result = null;

        try {
            HTTPRequestData httpRequestData;
            if (url.toLowerCase().contains("http")) {
                httpRequestData = new HTTPRequestData(url);
            } else {
                final StringBuilder sb = new StringBuilder();
                sb.append(JTVDBConstants.IMAGE_URL);
                sb.append(url);
                final String newURL = sb.toString();
                httpRequestData = new HTTPRequestData(newURL);
            }

            final HTTPResponseBufferedImage response = (HTTPResponseBufferedImage) this.httpManager.sendGetRequest(httpRequestData);
            result = response.getContent();
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTVDBException(e.getMessage(), e.getCause());
        }

        return result;
    }
}
