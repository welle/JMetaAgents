package aka.jmetaagents.main.omdb;

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
import aka.jmetaagents.main.omdb.exceptions.JomdbException;
import aka.jmetaagents.main.omdb.episode.episodebyidimdb.JEpisodebyidimdbQuestion;
import aka.jmetaagents.main.omdb.episode.episodebyidimdb.JEpisodebyidimdbQuestionJacksonMapper;
import aka.jmetaagents.main.omdb.episode.episodebyidimdb.JEpisodebyidimdbResponse;
import aka.jmetaagents.main.omdb.episode.episodebyidimdb.JEpisodebyidimdbResponseJacksonMapper;
import aka.jmetaagents.main.omdb.episode.episodebysearch.JEpisodebysearchQuestion;
import aka.jmetaagents.main.omdb.episode.episodebysearch.JEpisodebysearchQuestionJacksonMapper;
import aka.jmetaagents.main.omdb.episode.episodebysearch.JEpisodebysearchResponse;
import aka.jmetaagents.main.omdb.episode.episodebysearch.JEpisodebysearchResponseJacksonMapper;
import aka.jmetaagents.main.omdb.episode.episodebytitle.JEpisodebytitleQuestion;
import aka.jmetaagents.main.omdb.episode.episodebytitle.JEpisodebytitleQuestionJacksonMapper;
import aka.jmetaagents.main.omdb.episode.episodebytitle.JEpisodebytitleResponse;
import aka.jmetaagents.main.omdb.episode.episodebytitle.JEpisodebytitleResponseJacksonMapper;
import aka.jmetaagents.main.omdb.movie.moviebyidimdb.JMoviebyidimdbQuestion;
import aka.jmetaagents.main.omdb.movie.moviebyidimdb.JMoviebyidimdbQuestionJacksonMapper;
import aka.jmetaagents.main.omdb.movie.moviebyidimdb.JMoviebyidimdbResponse;
import aka.jmetaagents.main.omdb.movie.moviebyidimdb.JMoviebyidimdbResponseJacksonMapper;
import aka.jmetaagents.main.omdb.movie.moviebysearch.JMoviebysearchQuestion;
import aka.jmetaagents.main.omdb.movie.moviebysearch.JMoviebysearchQuestionJacksonMapper;
import aka.jmetaagents.main.omdb.movie.moviebysearch.JMoviebysearchResponse;
import aka.jmetaagents.main.omdb.movie.moviebysearch.JMoviebysearchResponseJacksonMapper;
import aka.jmetaagents.main.omdb.movie.moviebytitle.JMoviebytitleQuestion;
import aka.jmetaagents.main.omdb.movie.moviebytitle.JMoviebytitleQuestionJacksonMapper;
import aka.jmetaagents.main.omdb.movie.moviebytitle.JMoviebytitleResponse;
import aka.jmetaagents.main.omdb.movie.moviebytitle.JMoviebytitleResponseJacksonMapper;
import aka.jmetaagents.main.omdb.series.seriesbyidimdb.JSeriesbyidimdbQuestion;
import aka.jmetaagents.main.omdb.series.seriesbyidimdb.JSeriesbyidimdbQuestionJacksonMapper;
import aka.jmetaagents.main.omdb.series.seriesbyidimdb.JSeriesbyidimdbResponse;
import aka.jmetaagents.main.omdb.series.seriesbyidimdb.JSeriesbyidimdbResponseJacksonMapper;
import aka.jmetaagents.main.omdb.series.seriesbysearch.JSeriesbysearchQuestion;
import aka.jmetaagents.main.omdb.series.seriesbysearch.JSeriesbysearchQuestionJacksonMapper;
import aka.jmetaagents.main.omdb.series.seriesbysearch.JSeriesbysearchResponse;
import aka.jmetaagents.main.omdb.series.seriesbysearch.JSeriesbysearchResponseJacksonMapper;
import aka.jmetaagents.main.omdb.series.seriesbytitle.JSeriesbytitleQuestion;
import aka.jmetaagents.main.omdb.series.seriesbytitle.JSeriesbytitleQuestionJacksonMapper;
import aka.jmetaagents.main.omdb.series.seriesbytitle.JSeriesbytitleResponse;
import aka.jmetaagents.main.omdb.series.seriesbytitle.JSeriesbytitleResponseJacksonMapper;

/**
 * Generated JOMDB.
 */
public final class JOMDB extends AbstractAgent {

    private @NonNull final HTTPManager httpManager;
    private @NonNull final String apiKey;

    /**
     * Constructor.
     *
     * @param apiKey the API key.
     */
    public JOMDB(@NonNull final String apiKey) {
        super();

        this.httpManager = new HTTPManager();
        final String currentToken = apiKey;
        this.apiKey = currentToken;
    }

    /**
     * Get JEpisodebyidimdb.<br/>
     * Get movie details by its IMDB id.
     *
     * @param jEpisodebyidimdbQuestion the query
     * @return JEpisodebyidimdbResponse
     * @throws JomdbException
     */
    @Nullable
    public final JEpisodebyidimdbResponse getJEpisodebyidimdb(@NonNull JEpisodebyidimdbQuestion jEpisodebyidimdbQuestion) throws JomdbException {
        JEpisodebyidimdbResponse result = null;
        
        try {
            String url = "http://www.omdbapi.com/?apikey={api_key}&i={imdbid}&type=episode&plot=full&r=json&v=1";
            url = url.replace("{api_key}", this.apiKey);
			final Integer imdbid = jEpisodebyidimdbQuestion.getImdbid();
			if (imdbid != null) {
				url = url.replace("{imdbid}", imdbid.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);

			final Integer y = jEpisodebyidimdbQuestion.getY();
			if (y != null) {
                httpRequestData.addParams("y", y);
			}

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JEpisodebyidimdbResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JEpisodebysearch.<br/>
     * Get movie details by its IMDB id.
     *
     * @param jEpisodebysearchQuestion the query
     * @return JEpisodebysearchResponse
     * @throws JomdbException
     */
    @Nullable
    public final JEpisodebysearchResponse getJEpisodebysearch(@NonNull JEpisodebysearchQuestion jEpisodebysearchQuestion) throws JomdbException {
        JEpisodebysearchResponse result = null;
        
        try {
            String url = "http://www.omdbapi.com/?apikey={api_key}&s={title}&type=episode&plot=full&r=json&v=1";
            url = url.replace("{api_key}", this.apiKey);
			final String title = jEpisodebysearchQuestion.getTitle();
			if (title != null) {
				url = url.replace("{title}", title.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);

			final Integer y = jEpisodebysearchQuestion.getY();
			if (y != null) {
                httpRequestData.addParams("y", y);
			}
			final Integer page = jEpisodebysearchQuestion.getPage();
			if (page != null) {
                httpRequestData.addParams("page", page);
			}

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JEpisodebysearchResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JEpisodebytitle.<br/>
     * Get movie details by its IMDB id.
     *
     * @param jEpisodebytitleQuestion the query
     * @return JEpisodebytitleResponse
     * @throws JomdbException
     */
    @Nullable
    public final JEpisodebytitleResponse getJEpisodebytitle(@NonNull JEpisodebytitleQuestion jEpisodebytitleQuestion) throws JomdbException {
        JEpisodebytitleResponse result = null;
        
        try {
            String url = "http://www.omdbapi.com/?apikey={api_key}&t={title}&type=episode&plot=full&r=json&v=1";
            url = url.replace("{api_key}", this.apiKey);
			final String title = jEpisodebytitleQuestion.getTitle();
			if (title != null) {
				url = url.replace("{title}", title.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);

			final Integer y = jEpisodebytitleQuestion.getY();
			if (y != null) {
                httpRequestData.addParams("y", y);
			}

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JEpisodebytitleResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviebyidimdb.<br/>
     * Get movie details by its IMDB id.
     *
     * @param jMoviebyidimdbQuestion the query
     * @return JMoviebyidimdbResponse
     * @throws JomdbException
     */
    @Nullable
    public final JMoviebyidimdbResponse getJMoviebyidimdb(@NonNull JMoviebyidimdbQuestion jMoviebyidimdbQuestion) throws JomdbException {
        JMoviebyidimdbResponse result = null;
        
        try {
            String url = "http://www.omdbapi.com/?apikey={api_key}&i={imdbid}&type=movie&plot=full&r=json&v=1";
            url = url.replace("{api_key}", this.apiKey);
			final Integer imdbid = jMoviebyidimdbQuestion.getImdbid();
			if (imdbid != null) {
				url = url.replace("{imdbid}", imdbid.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);

			final Integer y = jMoviebyidimdbQuestion.getY();
			if (y != null) {
                httpRequestData.addParams("y", y);
			}

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviebyidimdbResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviebysearch.<br/>
     * Get movie details by its IMDB id.
     *
     * @param jMoviebysearchQuestion the query
     * @return JMoviebysearchResponse
     * @throws JomdbException
     */
    @Nullable
    public final JMoviebysearchResponse getJMoviebysearch(@NonNull JMoviebysearchQuestion jMoviebysearchQuestion) throws JomdbException {
        JMoviebysearchResponse result = null;
        
        try {
            String url = "http://www.omdbapi.com/?apikey={api_key}&s={title}&type=movie&plot=full&r=json&v=1";
            url = url.replace("{api_key}", this.apiKey);
			final String title = jMoviebysearchQuestion.getTitle();
			if (title != null) {
				url = url.replace("{title}", title.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);

			final Integer y = jMoviebysearchQuestion.getY();
			if (y != null) {
                httpRequestData.addParams("y", y);
			}
			final Integer page = jMoviebysearchQuestion.getPage();
			if (page != null) {
                httpRequestData.addParams("page", page);
			}

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviebysearchResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviebytitle.<br/>
     * Get movie details by its IMDB id.
     *
     * @param jMoviebytitleQuestion the query
     * @return JMoviebytitleResponse
     * @throws JomdbException
     */
    @Nullable
    public final JMoviebytitleResponse getJMoviebytitle(@NonNull JMoviebytitleQuestion jMoviebytitleQuestion) throws JomdbException {
        JMoviebytitleResponse result = null;
        
        try {
            String url = "http://www.omdbapi.com/?apikey={api_key}&t={title}&type=movie&plot=full&r=json&v=1";
            url = url.replace("{api_key}", this.apiKey);
			final String title = jMoviebytitleQuestion.getTitle();
			if (title != null) {
				url = url.replace("{title}", title.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);

			final Integer y = jMoviebytitleQuestion.getY();
			if (y != null) {
                httpRequestData.addParams("y", y);
			}

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviebytitleResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesbyidimdb.<br/>
     * Get movie details by its IMDB id.
     *
     * @param jSeriesbyidimdbQuestion the query
     * @return JSeriesbyidimdbResponse
     * @throws JomdbException
     */
    @Nullable
    public final JSeriesbyidimdbResponse getJSeriesbyidimdb(@NonNull JSeriesbyidimdbQuestion jSeriesbyidimdbQuestion) throws JomdbException {
        JSeriesbyidimdbResponse result = null;
        
        try {
            String url = "http://www.omdbapi.com/?apikey={api_key}&i={imdbid}&type=series&plot=full&r=json&v=1";
            url = url.replace("{api_key}", this.apiKey);
			final Integer imdbid = jSeriesbyidimdbQuestion.getImdbid();
			if (imdbid != null) {
				url = url.replace("{imdbid}", imdbid.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);

			final Integer y = jSeriesbyidimdbQuestion.getY();
			if (y != null) {
                httpRequestData.addParams("y", y);
			}

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesbyidimdbResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesbysearch.<br/>
     * Get movie details by its IMDB id.
     *
     * @param jSeriesbysearchQuestion the query
     * @return JSeriesbysearchResponse
     * @throws JomdbException
     */
    @Nullable
    public final JSeriesbysearchResponse getJSeriesbysearch(@NonNull JSeriesbysearchQuestion jSeriesbysearchQuestion) throws JomdbException {
        JSeriesbysearchResponse result = null;
        
        try {
            String url = "http://www.omdbapi.com/?apikey={api_key}&s={title}&type=series&plot=full&r=json&v=1";
            url = url.replace("{api_key}", this.apiKey);
			final String title = jSeriesbysearchQuestion.getTitle();
			if (title != null) {
				url = url.replace("{title}", title.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);

			final Integer y = jSeriesbysearchQuestion.getY();
			if (y != null) {
                httpRequestData.addParams("y", y);
			}
			final Integer page = jSeriesbysearchQuestion.getPage();
			if (page != null) {
                httpRequestData.addParams("page", page);
			}

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesbysearchResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JSeriesbytitle.<br/>
     * Get movie details by its IMDB id.
     *
     * @param jSeriesbytitleQuestion the query
     * @return JSeriesbytitleResponse
     * @throws JomdbException
     */
    @Nullable
    public final JSeriesbytitleResponse getJSeriesbytitle(@NonNull JSeriesbytitleQuestion jSeriesbytitleQuestion) throws JomdbException {
        JSeriesbytitleResponse result = null;
        
        try {
            String url = "http://www.omdbapi.com/?apikey={api_key}&t={title}&type=series&plot=full&r=json&v=1";
            url = url.replace("{api_key}", this.apiKey);
			final String title = jSeriesbytitleQuestion.getTitle();
			if (title != null) {
				url = url.replace("{title}", title.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);

			final Integer y = jSeriesbytitleQuestion.getY();
			if (y != null) {
                httpRequestData.addParams("y", y);
			}

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JSeriesbytitleResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * This method does not matter if the URL is absolute or relative.
     *
     * @param url
     * @return image from the URL
     * @throws JomdbException
     * @see BufferedImage
     */
    @Nullable
    public final BufferedImage getImage(@NonNull final String url) throws JomdbException {
        BufferedImage result = null;

        try {
            HTTPRequestData httpRequestData;
            if (url.toLowerCase().contains("http")) {
                httpRequestData = new HTTPRequestData(url);
            } else {
                final StringBuilder sb = new StringBuilder();
                sb.append("http://cf2.imgobject.com/t/p/original");
                sb.append(url);
                final String newURL = sb.toString();
                httpRequestData = new HTTPRequestData(newURL);
            }

            final HTTPResponseBufferedImage response = (HTTPResponseBufferedImage) this.httpManager.sendGetRequest(httpRequestData);
            result = response.getContent();
        } catch (final HTTPException | MalformedURLException e) {
            throw new JomdbException(e.getMessage(), e.getCause());
        }

        return result;
    }

}
