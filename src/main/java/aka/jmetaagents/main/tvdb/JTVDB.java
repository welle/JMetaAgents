package aka.jmetaagents.main.tvdb;

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
import aka.jmetaagents.main.tvdb.exceptions.JtvdbException;
import aka.jmetaagents.main.tvdb.authentication.login.JLoginQuestion;
import aka.jmetaagents.main.tvdb.authentication.login.JLoginQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.authentication.login.JLoginResponse;
import aka.jmetaagents.main.tvdb.authentication.login.JLoginResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.authentication.refreshtoken.JRefreshtokenResponse;
import aka.jmetaagents.main.tvdb.authentication.refreshtoken.JRefreshtokenResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.episodes.episodesid.JEpisodesidQuestion;
import aka.jmetaagents.main.tvdb.episodes.episodesid.JEpisodesidQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.episodes.episodesid.JEpisodesidResponse;
import aka.jmetaagents.main.tvdb.episodes.episodesid.JEpisodesidResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.languages.languages.JLanguagesResponse;
import aka.jmetaagents.main.tvdb.languages.languages.JLanguagesResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.languages.languagesid.JLanguagesidQuestion;
import aka.jmetaagents.main.tvdb.languages.languagesid.JLanguagesidQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.languages.languagesid.JLanguagesidResponse;
import aka.jmetaagents.main.tvdb.languages.languagesid.JLanguagesidResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.search.searchseries.JSearchseriesQuestion;
import aka.jmetaagents.main.tvdb.search.searchseries.JSearchseriesQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.search.searchseries.JSearchseriesResponse;
import aka.jmetaagents.main.tvdb.search.searchseries.JSearchseriesResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.search.searchseriesparams.JSearchseriesparamsResponse;
import aka.jmetaagents.main.tvdb.search.searchseriesparams.JSearchseriesparamsResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesid.JSeriesidQuestion;
import aka.jmetaagents.main.tvdb.series.seriesid.JSeriesidQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesid.JSeriesidResponse;
import aka.jmetaagents.main.tvdb.series.seriesid.JSeriesidResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidactors.JSeriesidactorsQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidactors.JSeriesidactorsQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidactors.JSeriesidactorsResponse;
import aka.jmetaagents.main.tvdb.series.seriesidactors.JSeriesidactorsResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidepisodes.JSeriesidepisodesQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidepisodes.JSeriesidepisodesQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidepisodes.JSeriesidepisodesResponse;
import aka.jmetaagents.main.tvdb.series.seriesidepisodes.JSeriesidepisodesResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesquery.JSeriesidepisodesqueryQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesquery.JSeriesidepisodesqueryQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesquery.JSeriesidepisodesqueryResponse;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesquery.JSeriesidepisodesqueryResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesqueryparams.JSeriesidepisodesqueryparamsQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesqueryparams.JSeriesidepisodesqueryparamsQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesqueryparams.JSeriesidepisodesqueryparamsResponse;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesqueryparams.JSeriesidepisodesqueryparamsResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidepisodessummary.JSeriesidepisodessummaryQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidepisodessummary.JSeriesidepisodessummaryQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidepisodessummary.JSeriesidepisodessummaryResponse;
import aka.jmetaagents.main.tvdb.series.seriesidepisodessummary.JSeriesidepisodessummaryResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidfilter.JSeriesidfilterQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidfilter.JSeriesidfilterQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidfilter.JSeriesidfilterResponse;
import aka.jmetaagents.main.tvdb.series.seriesidfilter.JSeriesidfilterResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidfilterparams.JSeriesidfilterparamsQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidfilterparams.JSeriesidfilterparamsQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidfilterparams.JSeriesidfilterparamsResponse;
import aka.jmetaagents.main.tvdb.series.seriesidfilterparams.JSeriesidfilterparamsResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidimages.JSeriesidimagesQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidimages.JSeriesidimagesQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidimages.JSeriesidimagesResponse;
import aka.jmetaagents.main.tvdb.series.seriesidimages.JSeriesidimagesResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidimagesquery.JSeriesidimagesqueryQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidimagesquery.JSeriesidimagesqueryQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidimagesquery.JSeriesidimagesqueryResponse;
import aka.jmetaagents.main.tvdb.series.seriesidimagesquery.JSeriesidimagesqueryResponseJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidimagesqueryparams.JSeriesidimagesqueryparamsQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidimagesqueryparams.JSeriesidimagesqueryparamsQuestionJacksonMapper;
import aka.jmetaagents.main.tvdb.series.seriesidimagesqueryparams.JSeriesidimagesqueryparamsResponse;
import aka.jmetaagents.main.tvdb.series.seriesidimagesqueryparams.JSeriesidimagesqueryparamsResponseJacksonMapper;

/**
 * Generated JTVDB.
 */
public final class JTVDB extends AbstractAgent {

    private @NonNull final HTTPManager httpManager;
    private @NonNull final String token;

    /**
     * Constructor.
     *
     * @param jLoginQuestion the object required to login in the API.
     * @throws JtvdbException
     */
    public JTVDB(@NonNull final JLoginQuestion jLoginQuestion) throws JtvdbException {
        super();

        this.httpManager = new HTTPManager();
        final String currentToken = getAPIKey(jLoginQuestion);
        if (currentToken == null) {
            throw new JtvdbException("Could not retrieve token.");
        }
        this.token = currentToken;
    }

    /**
     * Get token.
     *
     * @return token
     */
    @NonNull
    public String getToken() {
        return this.token;
    }

    @Nullable
    private String getAPIKey(@NonNull final JLoginQuestion jLoginQuestion) throws JtvdbException {
        String result = null;

        try {
            final String url = "https://api.thetvdb.com/login";
            final String json = JLoginQuestionJacksonMapper.writeValue(jLoginQuestion);
            assert json != null;
            final HTTPRequestData httpRequestData = new HTTPRequestData(url, new StringEntity(json));
            httpRequestData.addHeader("Content-Type", "application/json");
            httpRequestData.addHeader("Accept", "application/json");

        	final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendPostRequest(httpRequestData);  
            final String jsonString = response.getContent();

            @Nullable
            final JLoginResponse jLoginResponse = readValue(JLoginResponseJacksonMapper.class, jsonString);
            if (jLoginResponse != null) {
                result = jLoginResponse.getToken();
            }
        } catch (final HTTPException | IOException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get JRefreshtoken.<br/>
     * Refreshes your current, valid JWT token and returns a new token.
     *
     * @return JRefreshtokenResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JRefreshtokenResponse getJRefreshtoken() throws JtvdbException {
        JRefreshtokenResponse result = null;
        
        try {
            final String url = "https://api.thetvdb.com/refresh_token";

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JRefreshtokenResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JEpisodesid.<br/>
     * Returns the full information for a given episode id.
     *
     * @param jEpisodesidQuestion the query
     * @return JEpisodesidResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JEpisodesidResponse getJEpisodesid(@NonNull JEpisodesidQuestion jEpisodesidQuestion) throws JtvdbException {
        JEpisodesidResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/episodes/{id}";
			final Integer id = jEpisodesidQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
			final String acceptLanguage = jEpisodesidQuestion.getAcceptLanguage();
			if (acceptLanguage != null) {
                httpRequestData.addHeader("Accept-Language", acceptLanguage);
			}
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JEpisodesidResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JLanguages.<br/>
     * All available languages.
     *
     * @return JLanguagesResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JLanguagesResponse getJLanguages() throws JtvdbException {
        JLanguagesResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/languages";

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JLanguagesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JLanguagesid.<br/>
     * Information about a particular language, given the language ID.
     *
     * @param jLanguagesidQuestion the query
     * @return JLanguagesidResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JLanguagesidResponse getJLanguagesid(@NonNull JLanguagesidQuestion jLanguagesidQuestion) throws JtvdbException {
        JLanguagesidResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/languages/{id}";
			final Integer id = jLanguagesidQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JLanguagesidResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSearchseries.<br/>
     * Allows the user to search for a series based on the following parameters.
     *
     * @param jSearchseriesQuestion the query
     * @return JSearchseriesResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSearchseriesResponse getJSearchseries(@NonNull JSearchseriesQuestion jSearchseriesQuestion) throws JtvdbException {
        JSearchseriesResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/search/series";

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
			final String acceptLanguage = jSearchseriesQuestion.getAcceptLanguage();
			if (acceptLanguage != null) {
                httpRequestData.addHeader("Accept-Language", acceptLanguage);
			}
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSearchseriesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSearchseriesparams.<br/>
     * Returns an array of parameters to query by in the /search/series route.
     *
     * @return JSearchseriesparamsResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSearchseriesparamsResponse getJSearchseriesparams() throws JtvdbException {
        JSearchseriesparamsResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/search/series/params";

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSearchseriesparamsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesid.<br/>
     * Returns a series records that contains all information known about a particular series id.
     *
     * @param jSeriesidQuestion the query
     * @return JSeriesidResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidResponse getJSeriesid(@NonNull JSeriesidQuestion jSeriesidQuestion) throws JtvdbException {
        JSeriesidResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}";
			final Integer id = jSeriesidQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
			final String acceptLanguage = jSeriesidQuestion.getAcceptLanguage();
			if (acceptLanguage != null) {
                httpRequestData.addHeader("Accept-Language", acceptLanguage);
			}
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidactors.<br/>
     * Returns actors for the given series id
     *
     * @param jSeriesidactorsQuestion the query
     * @return JSeriesidactorsResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidactorsResponse getJSeriesidactors(@NonNull JSeriesidactorsQuestion jSeriesidactorsQuestion) throws JtvdbException {
        JSeriesidactorsResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/actors";
			final Integer id = jSeriesidactorsQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidactorsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidepisodes.<br/>
     * All episodes for a given series. Paginated with 100 results per page.
     *
     * @param jSeriesidepisodesQuestion the query
     * @return JSeriesidepisodesResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidepisodesResponse getJSeriesidepisodes(@NonNull JSeriesidepisodesQuestion jSeriesidepisodesQuestion) throws JtvdbException {
        JSeriesidepisodesResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/episodes";
			final Integer id = jSeriesidepisodesQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidepisodesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidepisodesquery.<br/>
     * This route allows the user to query against episodes for the given series. The response is a paginated array of episode records that have been filtered down to basic information.
     *
     * @param jSeriesidepisodesqueryQuestion the query
     * @return JSeriesidepisodesqueryResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidepisodesqueryResponse getJSeriesidepisodesquery(@NonNull JSeriesidepisodesqueryQuestion jSeriesidepisodesqueryQuestion) throws JtvdbException {
        JSeriesidepisodesqueryResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/episodes/query";
			final Integer id = jSeriesidepisodesqueryQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
			final String acceptLanguage = jSeriesidepisodesqueryQuestion.getAcceptLanguage();
			if (acceptLanguage != null) {
                httpRequestData.addHeader("Accept-Language", acceptLanguage);
			}
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidepisodesqueryResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidepisodesqueryparams.<br/>
     * Returns the allowed query keys for the /series/{id}/episodes/query route.
     *
     * @param jSeriesidepisodesqueryparamsQuestion the query
     * @return JSeriesidepisodesqueryparamsResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidepisodesqueryparamsResponse getJSeriesidepisodesqueryparams(@NonNull JSeriesidepisodesqueryparamsQuestion jSeriesidepisodesqueryparamsQuestion) throws JtvdbException {
        JSeriesidepisodesqueryparamsResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/episodes/query/params";
			final Integer id = jSeriesidepisodesqueryparamsQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidepisodesqueryparamsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidepisodessummary.<br/>
     * 
Returns a summary of the episodes and seasons available for the series.
     *
     * @param jSeriesidepisodessummaryQuestion the query
     * @return JSeriesidepisodessummaryResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidepisodessummaryResponse getJSeriesidepisodessummary(@NonNull JSeriesidepisodessummaryQuestion jSeriesidepisodessummaryQuestion) throws JtvdbException {
        JSeriesidepisodessummaryResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/episodes/summary";
			final Integer id = jSeriesidepisodessummaryQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidepisodessummaryResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidfilter.<br/>
     * Returns a series records, filtered by the supplied comma-separated list of keys. Query keys can be found at the /series/{id}/filter/params route.
     *
     * @param jSeriesidfilterQuestion the query
     * @return JSeriesidfilterResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidfilterResponse getJSeriesidfilter(@NonNull JSeriesidfilterQuestion jSeriesidfilterQuestion) throws JtvdbException {
        JSeriesidfilterResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/filter";
			final Integer id = jSeriesidfilterQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
			final String acceptLanguage = jSeriesidfilterQuestion.getAcceptLanguage();
			if (acceptLanguage != null) {
                httpRequestData.addHeader("Accept-Language", acceptLanguage);
			}
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidfilterResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidfilterparams.<br/>
     * Returns the list of keys available for the /series/{id}/filter route.
     *
     * @param jSeriesidfilterparamsQuestion the query
     * @return JSeriesidfilterparamsResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidfilterparamsResponse getJSeriesidfilterparams(@NonNull JSeriesidfilterparamsQuestion jSeriesidfilterparamsQuestion) throws JtvdbException {
        JSeriesidfilterparamsResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/filter/params";
			final Integer id = jSeriesidfilterparamsQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
			final String acceptLanguage = jSeriesidfilterparamsQuestion.getAcceptLanguage();
			if (acceptLanguage != null) {
                httpRequestData.addHeader("Accept-Language", acceptLanguage);
			}
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidfilterparamsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidimages.<br/>
     * Returns a summary of the images for a particular series
     *
     * @param jSeriesidimagesQuestion the query
     * @return JSeriesidimagesResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidimagesResponse getJSeriesidimages(@NonNull JSeriesidimagesQuestion jSeriesidimagesQuestion) throws JtvdbException {
        JSeriesidimagesResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/images";
			final Integer id = jSeriesidimagesQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
			final String acceptLanguage = jSeriesidimagesQuestion.getAcceptLanguage();
			if (acceptLanguage != null) {
                httpRequestData.addHeader("Accept-Language", acceptLanguage);
			}
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidimagesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidimagesquery.<br/>
     * Query images for the given series ID.
     *
     * @param jSeriesidimagesqueryQuestion the query
     * @return JSeriesidimagesqueryResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidimagesqueryResponse getJSeriesidimagesquery(@NonNull JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion) throws JtvdbException {
        JSeriesidimagesqueryResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/images/query";
			final Integer id = jSeriesidimagesqueryQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
			final String acceptLanguage = jSeriesidimagesqueryQuestion.getAcceptLanguage();
			if (acceptLanguage != null) {
                httpRequestData.addHeader("Accept-Language", acceptLanguage);
			}
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidimagesqueryResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesidimagesqueryparams.<br/>
     * Returns the allowed query keys for the /series/{id}/images/query route. Contains a parameter record for each unique keyType, listing values that will return results.
     *
     * @param jSeriesidimagesqueryparamsQuestion the query
     * @return JSeriesidimagesqueryparamsResponse
     * @throws JtvdbException
     */
    @Nullable
    public final JSeriesidimagesqueryparamsResponse getJSeriesidimagesqueryparams(@NonNull JSeriesidimagesqueryparamsQuestion jSeriesidimagesqueryparamsQuestion) throws JtvdbException {
        JSeriesidimagesqueryparamsResponse result = null;
        
        try {
            String url = "https://api.thetvdb.com/series/{id}/images/query/params";
			final Integer id = jSeriesidimagesqueryparamsQuestion.getId();
			if (id != null) {
                url = url.replace("{id}", id.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
			final String acceptLanguage = jSeriesidimagesqueryparamsQuestion.getAcceptLanguage();
			if (acceptLanguage != null) {
                httpRequestData.addHeader("Accept-Language", acceptLanguage);
			}
            httpRequestData.addHeader("Authorization", "Bearer " + this.token);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesidimagesqueryparamsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * This method does not matter if the URL is absolute or relative.
     *
     * @param url
     * @return image from the URL
     * @throws JtvdbException
     */
    @Nullable
    public final BufferedImage getImage(@NonNull final String url) throws JtvdbException {
        BufferedImage result = null;

        try {
            HTTPRequestData httpRequestData;
            if (url.toLowerCase().contains("http")) {
                httpRequestData = new HTTPRequestData(url);
            } else {
                final StringBuilder sb = new StringBuilder();
                sb.append("http://thetvdb.com/banners/");
                sb.append(url);
                final String newURL = sb.toString();
                httpRequestData = new HTTPRequestData(newURL);
            }

            final HTTPResponseBufferedImage response = (HTTPResponseBufferedImage) this.httpManager.sendGetRequest(httpRequestData);
            result = response.getContent();
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtvdbException(e.getMessage(), e.getCause());
        }

        return result;
    }

}
