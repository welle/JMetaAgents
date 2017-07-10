package aka.jmetaagents.main.jtmdb;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.util.Locale;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jhttprequest.main.HTTPManager;
import aka.jhttprequest.main.common.HTTPRequestData;
import aka.jhttprequest.main.common.HTTPResponseBufferedImage;
import aka.jhttprequest.main.common.HTTPResponseString;
import aka.jhttprequest.main.exceptions.HTTPException;
import aka.jmetaagents.main.AbstractAgent;
import aka.jmetaagents.main.jtmdb.constants.JTMDBConstants;
import aka.jmetaagents.main.jtmdb.exceptions.JTMDBException;
import aka.jmetaagents.main.jtmdb.pojo.collection.jcollection.JCollection;
import aka.jmetaagents.main.jtmdb.pojo.collection.jcollection.JCollectionJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.collection.jcollectionimage.JCollectionImage;
import aka.jmetaagents.main.jtmdb.pojo.collection.jcollectionimage.JCollectionImageJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.collection.jcollectionsearch.JCollectionSearch;
import aka.jmetaagents.main.jtmdb.pojo.collection.jcollectionsearch.JCollectionSearchJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovie.JMovie;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovie.JMovieJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviealternativetitle.JMovieAlternativeTitle;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviealternativetitle.JMovieAlternativeTitleJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviecast.JMovieCast;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviecast.JMovieCastJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovieimage.JMovieImage;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovieimage.JMovieImageJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviepopular.JMoviePopular;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviepopular.JMoviePopularJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovierelease.JMovieRelease;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovierelease.JMovieReleaseJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviesearch.JMovieSearch;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviesearch.JMovieSearchJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviesimilar.JMovieSimilar;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmoviesimilar.JMovieSimilarJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovietoprated.JMovieTopRated;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovietoprated.JMovieTopRatedJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovietrailer.JMovieTrailer;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovietrailer.JMovieTrailerJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovievideo.JMovieVideo;
import aka.jmetaagents.main.jtmdb.pojo.movie.jmovievideo.JMovieVideoJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.person.jperson.JPerson;
import aka.jmetaagents.main.jtmdb.pojo.person.jperson.JPersonJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.person.jpersoncredits.JPersonCredits;
import aka.jmetaagents.main.jtmdb.pojo.person.jpersoncredits.JPersonCreditsJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.person.jpersonimage.JPersonImage;
import aka.jmetaagents.main.jtmdb.pojo.person.jpersonimage.JPersonImageJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.person.jpersonsearch.JPersonSearch;
import aka.jmetaagents.main.jtmdb.pojo.person.jpersonsearch.JPersonSearchJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshow.JTVShow;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshow.JTVShowJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowalternativetitle.JTVShowAlternativeTitle;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowalternativetitle.JTVShowAlternativeTitleJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowcredits.JTVShowCredits;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowcredits.JTVShowCreditsJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisode.JTVShowEpisode;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisode.JTVShowEpisodeJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodecredits.JTVShowEpisodeCredits;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodecredits.JTVShowEpisodeCreditsJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodeimage.JTVShowEpisodeImage;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodeimage.JTVShowEpisodeImageJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodevideo.JTVShowEpisodeVideo;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowepisodevideo.JTVShowEpisodeVideoJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowimage.JTVShowImage;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowimage.JTVShowImageJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowpopular.JTVShowPopular;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowpopular.JTVShowPopularJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowsearch.JTVShowSearch;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowsearch.JTVShowSearchJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseason.JTVShowSeason;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseason.JTVShowSeasonJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseasonimage.JTVShowSeasonImage;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseasonimage.JTVShowSeasonImageJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseasonvideo.JTVShowSeasonVideo;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseasonvideo.JTVShowSeasonVideoJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowsimilar.JTVShowSimilar;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowsimilar.JTVShowSimilarJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowtoprated.JTVShowTopRated;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowtoprated.JTVShowTopRatedJacksonMapper;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowvideo.JTVShowVideo;
import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowvideo.JTVShowVideoJacksonMapper;
import aka.swissknife.data.TextUtils;

/**
 * JTMDB.
 *
 * @author Charlotte
 */
public final class JTMDB extends AbstractAgent {

    @NonNull
    private final HTTPManager httpManager;
    private @NonNull final String apiKey;

    /**
     * Constructor.
     *
     * @param apiKey API Key
     */
    public JTMDB(@NonNull final String apiKey) {
        super();

        this.httpManager = new HTTPManager();
        this.apiKey = apiKey;
    }

    /**
     * Get collection details.
     *
     * @param id code id of the collection
     * @param locale Locale
     * @return Collection object containing result
     * @throws JTMDBException
     * @see JCollection
     */
    @Nullable
    public final JCollection getCollection(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JCollection result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.COLLECTION_URL, id, "?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCollectionJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show details.
     *
     * @param id code id of the TV show
     * @param locale Locale
     * @return TV show object containing result
     * @throws JTMDBException
     * @see JTVShow
     */
    @Nullable
    public final JTVShow getTVShow(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JTVShow result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show videos.
     *
     * @param id code id of the TV show
     * @param locale Locale
     * @return TV show videos object containing result
     * @throws JTMDBException
     * @see JTVShowVideo
     */
    @Nullable
    public final JTVShowVideo getTVShowVideos(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JTVShowVideo result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/videos?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowVideoJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get collection images.
     *
     * @param id code id of the collection
     * @param locale (optional)
     * @return Collection image object containing result
     * @throws JTMDBException
     * @see JCollectionImage
     */
    @Nullable
    public final JCollectionImage getCollectionImage(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JCollectionImage result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.COLLECTION_URL, id, "/images?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCollectionImageJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show images.
     *
     * @param id code id of the TV show
     * @param locale (optional)
     * @return TV show image object containing result
     * @throws JTMDBException
     * @see JTVShowImage
     */
    @Nullable
    public final JTVShowImage getTVShowImage(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JTVShowImage result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/images?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowImageJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie details.
     *
     * @param id code id of the movie
     * @param locale (optional)
     * @return Movie object containing result
     * @throws JTMDBException
     * @see JMovie
     */
    @Nullable
    public final JMovie getMovie(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JMovie result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.MOVIE_URL, id, "?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie details by IMDB id.
     *
     * @param id IMDB id of the movie
     * @param locale (optional).
     * @return Movie object containing result
     * @throws JTMDBException
     * @see JMovie
     */
    @Nullable
    public final JMovie getMovieByIMDBid(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        return getMovie(id, locale);
    }

    /**
     * Get movie alternate titles.
     *
     * @param id code id of the movie
     * @param locale (optional) country.
     * @return JMovieAlternativeTitle object containing result
     * @throws JTMDBException
     * @see JMovieAlternativeTitle
     */
    @Nullable
    public final JMovieAlternativeTitle getMovieAltTitles(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JMovieAlternativeTitle result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.MOVIE_URL, id, "/alternative_titles?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.COUNTRY, getCountry(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieAlternativeTitleJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show alternate titles.
     *
     * @param id code id of the TV show
     * @param locale (optional) country.
     * @return JTVShowAlternativeTitle object containing result
     * @throws JTMDBException
     * @see JTVShowAlternativeTitle
     */
    @Nullable
    public final JTVShowAlternativeTitle getTVShowAltTitles(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JTVShowAlternativeTitle result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/alternative_titles?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.COUNTRY, getCountry(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowAlternativeTitleJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie cast.
     *
     * @param id code id of the movie
     * @return JMovieCast object containing result
     * @throws JTMDBException
     * @see JMovieCast
     */
    @Nullable
    public final JMovieCast getMovieCast(@NonNull final String id) throws JTMDBException {
        JMovieCast result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.MOVIE_URL, id, "/casts?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieCastJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie images.
     *
     * @param id code id of the movie
     * @param locale (optional)
     * @return Movie image object containing result
     * @throws JTMDBException
     * @see JMovieImage
     */
    @Nullable
    public final JMovieImage getMovieImage(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JMovieImage result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.MOVIE_URL, id, "/images?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieImageJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie videos.
     *
     * @param id code id of the movie
     * @param locale (optional)
     * @return Movie video object containing result
     * @throws JTMDBException
     * @see JMovieVideo
     */
    @Nullable
    public final JMovieVideo getMovieVideos(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JMovieVideo result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.MOVIE_URL, id, "/videos?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieVideoJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show season.
     *
     * @param id code id of the TV show
     * @param season season number
     * @param locale (optional)
     * @return TV show season object containing result
     * @throws JTMDBException
     * @see JTVShowSeason
     */
    @Nullable
    public final JTVShowSeason getTVShowSeason(@NonNull final String id, @NonNull final String season, @Nullable final Locale locale) throws JTMDBException {
        JTVShowSeason result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/season/", season, "?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowSeasonJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show episode.
     *
     * @param id code id of the TV show
     * @param season season number
     * @param episode episode number
     * @param locale (optional)
     * @return TV show episode object containing result
     * @throws JTMDBException
     * @see JTVShowEpisode
     */
    @Nullable
    public final JTVShowEpisode getTVShowEpisode(@NonNull final String id, @NonNull final String season, @NonNull final String episode, @Nullable final Locale locale) throws JTMDBException {
        JTVShowEpisode result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/season/", season, "/episode/", episode, "?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowEpisodeJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show episode videos.
     *
     * @param id code id of the TV show
     * @param season season number
     * @param episode episode number
     * @param locale (optional)
     * @return TV show episode videos object containing result
     * @throws JTMDBException
     * @see JTVShowEpisodeVideo
     */
    @Nullable
    public final JTVShowEpisodeVideo getTVShowEpisodeVideo(@NonNull final String id, @NonNull final String season, @NonNull final String episode, @Nullable final Locale locale) throws JTMDBException {
        JTVShowEpisodeVideo result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/season/", season, "/episode/", episode, "/videos?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowEpisodeVideoJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show episode credits.
     *
     * @param id code id of the TV show
     * @param season season number
     * @param episode episode number
     * @return TV show episode credits object containing result
     * @throws JTMDBException
     * @see JTVShowEpisodeCredits
     */
    @Nullable
    public final JTVShowEpisodeCredits getTVShowEpisodeCredits(@NonNull final String id, @NonNull final String season, @NonNull final String episode) throws JTMDBException {
        JTVShowEpisodeCredits result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/season/", season, "/episode/", episode, "/credits?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowEpisodeCreditsJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show episode images.
     *
     * @param id code id of the TV show
     * @param season season number
     * @param episode episode number
     * @return TV show episode images object containing result
     * @throws JTMDBException
     * @see JTVShowEpisodeImage
     */
    @Nullable
    public final JTVShowEpisodeImage getTVShowEpisodeImage(@NonNull final String id, @NonNull final String season, @NonNull final String episode) throws JTMDBException {
        JTVShowEpisodeImage result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/season/", season, "/episode/", episode, "/images?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowEpisodeImageJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show season images.
     *
     * @param id code id of the TV show
     * @param season season number
     * @return TV show season image object containing result
     * @throws JTMDBException
     * @see JTVShowSeasonImage
     */
    @Nullable
    public final JTVShowSeasonImage getTVShowSeasonImage(@NonNull final String id, @NonNull final String season) throws JTMDBException {
        JTVShowSeasonImage result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/season/", season, "?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowSeasonImageJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show season videos.
     *
     * @param id code id of the TV show
     * @param season season number
     * @param locale
     * @return TV show season video object containing result
     * @throws JTMDBException
     * @see JTVShowSeasonVideo
     */
    @Nullable
    public final JTVShowSeasonVideo getTVShowSeasonVideo(@NonNull final String id, @NonNull final String season, @Nullable final Locale locale) throws JTMDBException {
        JTVShowSeasonVideo result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/season/", season, "/videos?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowSeasonVideoJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie release informations.
     *
     * @param id code id of the movie
     * @return JMovieRelease object containing result
     * @throws JTMDBException
     * @see JMovieRelease
     */
    @Nullable
    public final JMovieRelease getMovieReleaseInfo(@NonNull final String id) throws JTMDBException {
        JMovieRelease result = null;
        try {
            final String url = TextUtils.pack(JTMDBConstants.MOVIE_URL, id, "/releases?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieReleaseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie trailers.
     *
     * @param id code id of the movie
     * @param locale (optional)
     * @return Movie trailers object containing result
     * @throws JTMDBException
     * @see JMovieTrailer
     */
    @Nullable
    public final JMovieTrailer getMovieTrailer(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JMovieTrailer result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.MOVIE_URL, id, "/trailers?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieTrailerJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get movie similar.
     *
     * @param id code id of the movie
     * @param locale (optional)
     * @param page number
     * @return Movie similar object containing result
     * @throws JTMDBException
     * @see JMovieSimilar
     */
    @Nullable
    public final JMovieSimilar getMovieSimilar(@NonNull final String id, @Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JMovieSimilar result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.MOVIE_URL, id, "/similar_movies?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSimilarJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV Show similar.
     *
     * @param id code id of the TV show
     * @param locale (optional)
     * @param page number
     * @return TV show similar object containing result
     * @throws JTMDBException
     * @see JTVShowSimilar
     */
    @Nullable
    public final JTVShowSimilar getTVShowSimilar(@NonNull final String id, @Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JTVShowSimilar result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/similar?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowSimilarJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get popular movies.
     *
     * @param locale (optional)
     * @param page number
     * @return Movie popular object containing result
     * @throws JTMDBException
     * @see JMoviePopular
     */
    @Nullable
    public final JMoviePopular getMoviesPopular(@Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JMoviePopular result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTMDBConstants.MOVIE_POPULAR_URL);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviePopularJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get popular TV show.
     *
     * @param locale (optional)
     * @param page number
     * @return TV show popular object containing result
     * @throws JTMDBException
     * @see JTVShowPopular
     */
    @Nullable
    public final JTVShowPopular getTVShowsPopular(@Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JTVShowPopular result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTMDBConstants.TV_SHOW_POPULAR_URL);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowPopularJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get top rated movies.
     *
     * @param locale (optional)
     * @param page number
     * @return Movie top rated object containing result
     * @throws JTMDBException
     * @see JMovieTopRated
     */
    @Nullable
    public final JMovieTopRated getMoviesTopRated(@Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JMovieTopRated result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTMDBConstants.MOVIE_TOP_RATED_URL);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieTopRatedJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get top rated TV shows.
     *
     * @param locale (optional)
     * @param page number
     * @return TV shows top rated object containing result
     * @throws JTMDBException
     * @see JTVShowTopRated
     */
    @Nullable
    public final JTVShowTopRated getTVShowsTopRated(@Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JTVShowTopRated result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTMDBConstants.TV_SHOW_TOP_RATED_URL);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowTopRatedJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get person details.
     *
     * @param id code id of the person
     * @return Person object containing result
     * @throws JTMDBException
     * @see JPerson
     */
    @Nullable
    public final JPerson getPerson(@NonNull final String id) throws JTMDBException {
        JPerson result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.PERSON_URL, id, "?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JPersonJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get person credits.
     *
     * @param id code id of the person
     * @param locale (optional)
     * @return Person credits object containing result
     * @throws JTMDBException
     * @see JPersonCredits
     */
    @Nullable
    public final JPersonCredits getPersonCredits(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JPersonCredits result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.PERSON_URL, id, "/credits?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JPersonCreditsJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get TV show credits.
     *
     * @param id code id of the TV show
     * @param locale (optional)
     * @return TV show credits object containing result
     * @throws JTMDBException
     * @see JTVShowCredits
     */
    @Nullable
    public final JTVShowCredits getTVShowCredits(@NonNull final String id, @Nullable final Locale locale) throws JTMDBException {
        JTVShowCredits result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.TV_SHOW_URL, id, "/credits?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowCreditsJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get person images.
     *
     * @param id code id of the person
     * @return Person image object containing result
     * @throws JTMDBException
     * @see JPersonImage
     */
    @Nullable
    public final JPersonImage getPersonImages(@NonNull final String id) throws JTMDBException {
        JPersonImage result = null;

        try {
            final String url = TextUtils.pack(JTMDBConstants.PERSON_URL, id, "/images?");
            final HTTPRequestData httpRequestData = new HTTPRequestData(url);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JPersonImageJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search movies.
     *
     * @param query The query param is your search text
     * @param locale (optional)
     * @param page page number
     * @return movie search object containing result
     * @throws JTMDBException
     * @see JMovieSearch
     */
    @Nullable
    public final JMovieSearch searchMovies(@NonNull final String query, @Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JMovieSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTMDBConstants.SEARCH_MOVIE);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.QUERY, query);
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMovieSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search persons.
     *
     * @param query The query param is your search text
     * @param locale (optional)
     * @param page page number
     * @return people search object containing result
     * @throws JTMDBException
     * @see JPersonSearch
     */
    @Nullable
    public final JPersonSearch searchPerson(@NonNull final String query, @Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JPersonSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTMDBConstants.SEARCH_PERSON);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.QUERY, query);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JPersonSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search collections.
     *
     * @param query The query param is your search text
     * @param locale (optional)
     * @param page page number
     * @return collection search object containing result
     * @throws JTMDBException
     * @see JCollectionSearch
     */
    @Nullable
    public final JCollectionSearch searchCollections(@NonNull final String query, @Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JCollectionSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTMDBConstants.SEARCH_COLLECTION);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.QUERY, query);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCollectionSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Search TV shows.
     *
     * @param query The query param is your search text
     * @param locale (optional)
     * @param page page number
     * @return TV shows search object containing result
     * @throws JTMDBException
     * @see JTVShowSearch
     */
    @Nullable
    public final JTVShowSearch searchTVShows(@NonNull final String query, @Nullable final Locale locale, @Nullable final Integer page) throws JTMDBException {
        JTVShowSearch result = null;

        try {
            final HTTPRequestData httpRequestData = new HTTPRequestData(JTMDBConstants.SEARCH_TV_SHOWS);
            httpRequestData.addParams(JTMDBConstants.API_KEY, this.apiKey);
            httpRequestData.addParams(JTMDBConstants.QUERY, query);
            httpRequestData.addParams(JTMDBConstants.LANGUAGE, getLanguage(locale));
            httpRequestData.addParams(JTMDBConstants.PAGE, getPage(page));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTVShowSearchJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * This method does not matter if the URL is absolute or relative.
     *
     * @param url
     * @return image from the URL
     * @throws JTMDBException
     * @see BufferedImage
     */
    @Nullable
    public final BufferedImage getImage(@NonNull final String url) throws JTMDBException {
        BufferedImage result = null;

        try {
            HTTPRequestData httpRequestData;
            if (url.toLowerCase().contains("http")) {
                httpRequestData = new HTTPRequestData(url);
            } else {
                final StringBuilder sb = new StringBuilder();
                sb.append(JTMDBConstants.IMAGE_URL);
                sb.append(url);
                final String newURL = sb.toString();
                httpRequestData = new HTTPRequestData(newURL);
            }

            final HTTPResponseBufferedImage response = (HTTPResponseBufferedImage) this.httpManager.sendGetRequest(httpRequestData);
            result = response.getContent();
        } catch (final HTTPException | MalformedURLException e) {
            throw new JTMDBException(e.getMessage(), e.getCause());
        }

        return result;
    }
}
