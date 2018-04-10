package aka.jmetaagents.main.tmdb;

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
import aka.jmetaagents.main.tmdb.exceptions.JtmdbException;
import aka.jmetaagents.main.tmdb.authentification.guest.JGuestQuestion;
import aka.jmetaagents.main.tmdb.authentification.guest.JGuestQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.authentification.guest.JGuestResponse;
import aka.jmetaagents.main.tmdb.authentification.guest.JGuestResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.collections.collectionsdetails.JCollectionsdetailsQuestion;
import aka.jmetaagents.main.tmdb.collections.collectionsdetails.JCollectionsdetailsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.collections.collectionsdetails.JCollectionsdetailsResponse;
import aka.jmetaagents.main.tmdb.collections.collectionsdetails.JCollectionsdetailsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.collections.collectionsimages.JCollectionsimagesQuestion;
import aka.jmetaagents.main.tmdb.collections.collectionsimages.JCollectionsimagesQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.collections.collectionsimages.JCollectionsimagesResponse;
import aka.jmetaagents.main.tmdb.collections.collectionsimages.JCollectionsimagesResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.collections.collectionstranslations.JCollectionstranslationsQuestion;
import aka.jmetaagents.main.tmdb.collections.collectionstranslations.JCollectionstranslationsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.collections.collectionstranslations.JCollectionstranslationsResponse;
import aka.jmetaagents.main.tmdb.collections.collectionstranslations.JCollectionstranslationsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.companies.companiesalternatename.JCompaniesalternatenameQuestion;
import aka.jmetaagents.main.tmdb.companies.companiesalternatename.JCompaniesalternatenameQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.companies.companiesalternatename.JCompaniesalternatenameResponse;
import aka.jmetaagents.main.tmdb.companies.companiesalternatename.JCompaniesalternatenameResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.companies.companiesdetails.JCompaniesdetailsQuestion;
import aka.jmetaagents.main.tmdb.companies.companiesdetails.JCompaniesdetailsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.companies.companiesdetails.JCompaniesdetailsResponse;
import aka.jmetaagents.main.tmdb.companies.companiesdetails.JCompaniesdetailsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.companies.companiesimages.JCompaniesimagesQuestion;
import aka.jmetaagents.main.tmdb.companies.companiesimages.JCompaniesimagesQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.companies.companiesimages.JCompaniesimagesResponse;
import aka.jmetaagents.main.tmdb.companies.companiesimages.JCompaniesimagesResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.credits.creditsdetails.JCreditsdetailsQuestion;
import aka.jmetaagents.main.tmdb.credits.creditsdetails.JCreditsdetailsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.credits.creditsdetails.JCreditsdetailsResponse;
import aka.jmetaagents.main.tmdb.credits.creditsdetails.JCreditsdetailsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.find.findbyimdbid.JFindbyimdbidQuestion;
import aka.jmetaagents.main.tmdb.find.findbyimdbid.JFindbyimdbidQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.find.findbyimdbid.JFindbyimdbidResponse;
import aka.jmetaagents.main.tmdb.find.findbyimdbid.JFindbyimdbidResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.find.findbytvdbid.JFindbytvdbidQuestion;
import aka.jmetaagents.main.tmdb.find.findbytvdbid.JFindbytvdbidQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.find.findbytvdbid.JFindbytvdbidResponse;
import aka.jmetaagents.main.tmdb.find.findbytvdbid.JFindbytvdbidResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.genres.genresgetmovielist.JGenresgetmovielistQuestion;
import aka.jmetaagents.main.tmdb.genres.genresgetmovielist.JGenresgetmovielistQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.genres.genresgetmovielist.JGenresgetmovielistResponse;
import aka.jmetaagents.main.tmdb.genres.genresgetmovielist.JGenresgetmovielistResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistQuestion;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistResponse;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesalternativetitles.JMoviesalternativetitlesQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesalternativetitles.JMoviesalternativetitlesQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesalternativetitles.JMoviesalternativetitlesResponse;
import aka.jmetaagents.main.tmdb.movies.moviesalternativetitles.JMoviesalternativetitlesResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviescredits.JMoviescreditsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviescredits.JMoviescreditsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviescredits.JMoviescreditsResponse;
import aka.jmetaagents.main.tmdb.movies.moviescredits.JMoviescreditsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesdetails.JMoviesdetailsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesdetails.JMoviesdetailsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesdetails.JMoviesdetailsResponse;
import aka.jmetaagents.main.tmdb.movies.moviesdetails.JMoviesdetailsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesexternalids.JMoviesexternalidsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesexternalids.JMoviesexternalidsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesexternalids.JMoviesexternalidsResponse;
import aka.jmetaagents.main.tmdb.movies.moviesexternalids.JMoviesexternalidsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesimages.JMoviesimagesQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesimages.JMoviesimagesQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesimages.JMoviesimagesResponse;
import aka.jmetaagents.main.tmdb.movies.moviesimages.JMoviesimagesResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesrecommandations.JMoviesrecommandationsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesrecommandations.JMoviesrecommandationsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesrecommandations.JMoviesrecommandationsResponse;
import aka.jmetaagents.main.tmdb.movies.moviesrecommandations.JMoviesrecommandationsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviessimilar.JMoviessimilarQuestion;
import aka.jmetaagents.main.tmdb.movies.moviessimilar.JMoviessimilarQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviessimilar.JMoviessimilarResponse;
import aka.jmetaagents.main.tmdb.movies.moviessimilar.JMoviessimilarResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviestranslations.JMoviestranslationsQuestion;
import aka.jmetaagents.main.tmdb.movies.moviestranslations.JMoviestranslationsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviestranslations.JMoviestranslationsResponse;
import aka.jmetaagents.main.tmdb.movies.moviestranslations.JMoviestranslationsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesvideos.JMoviesvideosQuestion;
import aka.jmetaagents.main.tmdb.movies.moviesvideos.JMoviesvideosQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.movies.moviesvideos.JMoviesvideosResponse;
import aka.jmetaagents.main.tmdb.movies.moviesvideos.JMoviesvideosResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits.JTvepisodecreditsQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits.JTvepisodecreditsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits.JTvepisodecreditsResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits.JTvepisodecreditsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodedetails.JTvepisodedetailsQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodedetails.JTvepisodedetailsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodedetails.JTvepisodedetailsResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodedetails.JTvepisodedetailsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeexternalids.JTvepisodeexternalidsQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeexternalids.JTvepisodeexternalidsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeexternalids.JTvepisodeexternalidsResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeexternalids.JTvepisodeexternalidsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages.JTvepisodeimagesQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages.JTvepisodeimagesQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages.JTvepisodeimagesResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages.JTvepisodeimagesResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodevideos.JTvepisodevideosQuestion;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodevideos.JTvepisodevideosQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodevideos.JTvepisodevideosResponse;
import aka.jmetaagents.main.tmdb.tv.episode.tvepisodevideos.JTvepisodevideosResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasoncredits.JTvseasoncreditsQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasoncredits.JTvseasoncreditsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasoncredits.JTvseasoncreditsResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasoncredits.JTvseasoncreditsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasondetails.JTvseasondetailsQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasondetails.JTvseasondetailsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasondetails.JTvseasondetailsResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasondetails.JTvseasondetailsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonexternalids.JTvseasonexternalidsQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonexternalids.JTvseasonexternalidsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonexternalids.JTvseasonexternalidsResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonexternalids.JTvseasonexternalidsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonimages.JTvseasonimagesQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonimages.JTvseasonimagesQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonimages.JTvseasonimagesResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonimages.JTvseasonimagesResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonvideos.JTvseasonvideosQuestion;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonvideos.JTvseasonvideosQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonvideos.JTvseasonvideosResponse;
import aka.jmetaagents.main.tmdb.tv.season.tvseasonvideos.JTvseasonvideosResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvalternativetitles.JTvalternativetitlesQuestion;
import aka.jmetaagents.main.tmdb.tv.tvalternativetitles.JTvalternativetitlesQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvalternativetitles.JTvalternativetitlesResponse;
import aka.jmetaagents.main.tmdb.tv.tvalternativetitles.JTvalternativetitlesResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvcredits.JTvcreditsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvcredits.JTvcreditsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvcredits.JTvcreditsResponse;
import aka.jmetaagents.main.tmdb.tv.tvcredits.JTvcreditsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvdetails.JTvdetailsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvdetails.JTvdetailsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvdetails.JTvdetailsResponse;
import aka.jmetaagents.main.tmdb.tv.tvdetails.JTvdetailsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvexternalids.JTvexternalidsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvexternalids.JTvexternalidsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvexternalids.JTvexternalidsResponse;
import aka.jmetaagents.main.tmdb.tv.tvexternalids.JTvexternalidsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvimages.JTvimagesQuestion;
import aka.jmetaagents.main.tmdb.tv.tvimages.JTvimagesQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvimages.JTvimagesResponse;
import aka.jmetaagents.main.tmdb.tv.tvimages.JTvimagesResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvrecommandations.JTvrecommandationsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvrecommandations.JTvrecommandationsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvrecommandations.JTvrecommandationsResponse;
import aka.jmetaagents.main.tmdb.tv.tvrecommandations.JTvrecommandationsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvsimilar.JTvsimilarQuestion;
import aka.jmetaagents.main.tmdb.tv.tvsimilar.JTvsimilarQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvsimilar.JTvsimilarResponse;
import aka.jmetaagents.main.tmdb.tv.tvsimilar.JTvsimilarResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvtranslations.JTvtranslationsQuestion;
import aka.jmetaagents.main.tmdb.tv.tvtranslations.JTvtranslationsQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvtranslations.JTvtranslationsResponse;
import aka.jmetaagents.main.tmdb.tv.tvtranslations.JTvtranslationsResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvvideos.JTvvideosQuestion;
import aka.jmetaagents.main.tmdb.tv.tvvideos.JTvvideosQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.tv.tvvideos.JTvvideosResponse;
import aka.jmetaagents.main.tmdb.tv.tvvideos.JTvvideosResponseJacksonMapper;

/**
 * Generated JTMDB.
 */
public final class JTMDB extends AbstractAgent {

    private @NonNull final HTTPManager httpManager;
    private @NonNull final String apiKey;

    /**
     * Constructor.
     *
     * @param jGuestQuestion the object required to login in the API.
     * @throws JtmdbException
     */
    public JTMDB(@NonNull final JGuestQuestion jGuestQuestion) throws JtmdbException {
        super();

        this.httpManager = new HTTPManager();
        final String currentToken = jGuestQuestion.getApikey();
        if (currentToken == null) {
            throw new JtmdbException("Could not retrieve token.");
        }
        this.apiKey = currentToken;
    }

    /**
     * Get Guest Token.
     *
     * @param jGuestQuestion the query
     * @return token
     * @throws JtmdbException
     */
    @Nullable
    public String getGuestToken(@NonNull final JGuestQuestion jGuestQuestion) throws JtmdbException {
        String result = null;

        try {
            String url = "https://api.themoviedb.org/3/authentication/guest_session/new?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
            final String json = JGuestQuestionJacksonMapper.writeValue(jGuestQuestion);
            assert json != null;
            final HTTPRequestData httpRequestData = new HTTPRequestData(url, new StringEntity(json));

            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();

            @Nullable
            final JGuestResponse jGuestResponse = readValue(JGuestResponseJacksonMapper.class, jsonString);
            if (jGuestResponse != null) {
                result = jGuestResponse.getGuestSessionId();
            }
        } catch (final HTTPException | IOException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }

        return result;
    }

    /**
     * Get JCollectionsdetails.<br/>
     * Get collection details by id.
     *
     * @param jCollectionsdetailsQuestion the query
     * @return JCollectionsdetailsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JCollectionsdetailsResponse getJCollectionsdetails(@NonNull JCollectionsdetailsQuestion jCollectionsdetailsQuestion) throws JtmdbException {
        JCollectionsdetailsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/collection/{collection_id}?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer collectionId = jCollectionsdetailsQuestion.getCollectionId();
			if (collectionId != null) {
				url = url.replace("{collection_id}", collectionId.toString());
			}
			final String language = jCollectionsdetailsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCollectionsdetailsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JCollectionsimages.<br/>
     * Get the images for a collection by id.
     *
     * @param jCollectionsimagesQuestion the query
     * @return JCollectionsimagesResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JCollectionsimagesResponse getJCollectionsimages(@NonNull JCollectionsimagesQuestion jCollectionsimagesQuestion) throws JtmdbException {
        JCollectionsimagesResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/collection/{collection_id}/images?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer collectionId = jCollectionsimagesQuestion.getCollectionId();
			if (collectionId != null) {
				url = url.replace("{collection_id}", collectionId.toString());
			}
			final String language = jCollectionsimagesQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCollectionsimagesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JCollectionstranslations.<br/>
     * Get the list translations for a collection by id.
     *
     * @param jCollectionstranslationsQuestion the query
     * @return JCollectionstranslationsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JCollectionstranslationsResponse getJCollectionstranslations(@NonNull JCollectionstranslationsQuestion jCollectionstranslationsQuestion) throws JtmdbException {
        JCollectionstranslationsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/collection/{collection_id}/translations?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer collectionId = jCollectionstranslationsQuestion.getCollectionId();
			if (collectionId != null) {
				url = url.replace("{collection_id}", collectionId.toString());
			}
			final String language = jCollectionstranslationsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCollectionstranslationsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JCompaniesalternatename.<br/>
     * Get the alternative names of a company.
     *
     * @param jCompaniesalternatenameQuestion the query
     * @return JCompaniesalternatenameResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JCompaniesalternatenameResponse getJCompaniesalternatename(@NonNull JCompaniesalternatenameQuestion jCompaniesalternatenameQuestion) throws JtmdbException {
        JCompaniesalternatenameResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/company/{company_id}/alternative_names?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer companyId = jCompaniesalternatenameQuestion.getCompanyId();
			if (companyId != null) {
				url = url.replace("{company_id}", companyId.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCompaniesalternatenameResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JCompaniesdetails.<br/>
     * Get a companies details by id.
     *
     * @param jCompaniesdetailsQuestion the query
     * @return JCompaniesdetailsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JCompaniesdetailsResponse getJCompaniesdetails(@NonNull JCompaniesdetailsQuestion jCompaniesdetailsQuestion) throws JtmdbException {
        JCompaniesdetailsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/company/{company_id}?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer companyId = jCompaniesdetailsQuestion.getCompanyId();
			if (companyId != null) {
				url = url.replace("{company_id}", companyId.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCompaniesdetailsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JCompaniesimages.<br/>
     * There are two image formats that are supported for companies, PNG's and SVG's.
     *
     * @param jCompaniesimagesQuestion the query
     * @return JCompaniesimagesResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JCompaniesimagesResponse getJCompaniesimages(@NonNull JCompaniesimagesQuestion jCompaniesimagesQuestion) throws JtmdbException {
        JCompaniesimagesResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/company/{company_id}?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer companyId = jCompaniesimagesQuestion.getCompanyId();
			if (companyId != null) {
				url = url.replace("{company_id}", companyId.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCompaniesimagesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JCreditsdetails.<br/>
     * Get a movie or TV credit details by id.
     *
     * @param jCreditsdetailsQuestion the query
     * @return JCreditsdetailsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JCreditsdetailsResponse getJCreditsdetails(@NonNull JCreditsdetailsQuestion jCreditsdetailsQuestion) throws JtmdbException {
        JCreditsdetailsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/credit/{credit_id}?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer creditId = jCreditsdetailsQuestion.getCreditId();
			if (creditId != null) {
				url = url.replace("{credit_id}", creditId.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JCreditsdetailsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JFindbyimdbid.<br/>
     * The find method makes it easy to search for objects in our database by an IMDB id.
     *
     * @param jFindbyimdbidQuestion the query
     * @return JFindbyimdbidResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JFindbyimdbidResponse getJFindbyimdbid(@NonNull JFindbyimdbidQuestion jFindbyimdbidQuestion) throws JtmdbException {
        JFindbyimdbidResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/find/{external_id}?api_key={api_key}&language={language}&external_source=imdb_id";
            url = url.replace("{api_key}", this.apiKey);
			final String language = jFindbyimdbidQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}
			final Integer externalId = jFindbyimdbidQuestion.getExternalId();
			if (externalId != null) {
				url = url.replace("{external_id}", externalId.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JFindbyimdbidResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JFindbytvdbid.<br/>
     * The find method makes it easy to search for objects in our database by an TVDB id.
     *
     * @param jFindbytvdbidQuestion the query
     * @return JFindbytvdbidResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JFindbytvdbidResponse getJFindbytvdbid(@NonNull JFindbytvdbidQuestion jFindbytvdbidQuestion) throws JtmdbException {
        JFindbytvdbidResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/find/{external_id}?api_key={api_key}&language={language}&external_source=tvdb_id";
            url = url.replace("{api_key}", this.apiKey);
			final String language = jFindbytvdbidQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}
			final Integer externalId = jFindbytvdbidQuestion.getExternalId();
			if (externalId != null) {
				url = url.replace("{external_id}", externalId.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JFindbytvdbidResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JGenresgetmovielist.<br/>
     * Get the list of official genres for movies.
     *
     * @param jGenresgetmovielistQuestion the query
     * @return JGenresgetmovielistResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JGenresgetmovielistResponse getJGenresgetmovielist(@NonNull JGenresgetmovielistQuestion jGenresgetmovielistQuestion) throws JtmdbException {
        JGenresgetmovielistResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/genre/movie/list?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final String language = jGenresgetmovielistQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JGenresgetmovielistResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JGenresgettvlist.<br/>
     * Get the list of official genres for TV shows.
     *
     * @param jGenresgettvlistQuestion the query
     * @return JGenresgettvlistResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JGenresgettvlistResponse getJGenresgettvlist(@NonNull JGenresgettvlistQuestion jGenresgettvlistQuestion) throws JtmdbException {
        JGenresgettvlistResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/genre/tv/list?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final String language = jGenresgettvlistQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JGenresgettvlistResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviesalternativetitles.<br/>
     * Get all of the alternative titles for a movie.
     *
     * @param jMoviesalternativetitlesQuestion the query
     * @return JMoviesalternativetitlesResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JMoviesalternativetitlesResponse getJMoviesalternativetitles(@NonNull JMoviesalternativetitlesQuestion jMoviesalternativetitlesQuestion) throws JtmdbException {
        JMoviesalternativetitlesResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/movie/{movie_id}/alternative_titles?api_key={api_key}&country={country}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer movieId = jMoviesalternativetitlesQuestion.getMovieId();
			if (movieId != null) {
				url = url.replace("{movie_id}", movieId.toString());
			}
			final String country = jMoviesalternativetitlesQuestion.getCountry();
			if (country != null) {
				url = url.replace("{country}", country.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviesalternativetitlesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviescredits.<br/>
     * Get the cast and crew for a movie.
     *
     * @param jMoviescreditsQuestion the query
     * @return JMoviescreditsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JMoviescreditsResponse getJMoviescredits(@NonNull JMoviescreditsQuestion jMoviescreditsQuestion) throws JtmdbException {
        JMoviescreditsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/movie/{movie_id}/credits?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer movieId = jMoviescreditsQuestion.getMovieId();
			if (movieId != null) {
				url = url.replace("{movie_id}", movieId.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviescreditsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviesdetails.<br/>
     * Get the primary information about a movie.
     *
     * @param jMoviesdetailsQuestion the query
     * @return JMoviesdetailsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JMoviesdetailsResponse getJMoviesdetails(@NonNull JMoviesdetailsQuestion jMoviesdetailsQuestion) throws JtmdbException {
        JMoviesdetailsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/movie/{movie_id}?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer movieId = jMoviesdetailsQuestion.getMovieId();
			if (movieId != null) {
				url = url.replace("{movie_id}", movieId.toString());
			}
			final String language = jMoviesdetailsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviesdetailsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviesexternalids.<br/>
     * Get the external ids for a movie.
     *
     * @param jMoviesexternalidsQuestion the query
     * @return JMoviesexternalidsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JMoviesexternalidsResponse getJMoviesexternalids(@NonNull JMoviesexternalidsQuestion jMoviesexternalidsQuestion) throws JtmdbException {
        JMoviesexternalidsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/movie/{movie_id}/external_ids?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer movieId = jMoviesexternalidsQuestion.getMovieId();
			if (movieId != null) {
				url = url.replace("{movie_id}", movieId.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviesexternalidsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviesimages.<br/>
     * Get the images that belong to a movie.
     *
     * @param jMoviesimagesQuestion the query
     * @return JMoviesimagesResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JMoviesimagesResponse getJMoviesimages(@NonNull JMoviesimagesQuestion jMoviesimagesQuestion) throws JtmdbException {
        JMoviesimagesResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/movie/{movie_id}/videos?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer movieId = jMoviesimagesQuestion.getMovieId();
			if (movieId != null) {
				url = url.replace("{movie_id}", movieId.toString());
			}
			final String language = jMoviesimagesQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviesimagesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviesrecommandations.<br/>
     * Get a list of recommended movies for a movie.
     *
     * @param jMoviesrecommandationsQuestion the query
     * @return JMoviesrecommandationsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JMoviesrecommandationsResponse getJMoviesrecommandations(@NonNull JMoviesrecommandationsQuestion jMoviesrecommandationsQuestion) throws JtmdbException {
        JMoviesrecommandationsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/movie/{movie_id}/videos?api_key={api_key}&language={language}&page={page}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer movieId = jMoviesrecommandationsQuestion.getMovieId();
			if (movieId != null) {
				url = url.replace("{movie_id}", movieId.toString());
			}
			final String language = jMoviesrecommandationsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}
			final Integer page = jMoviesrecommandationsQuestion.getPage();
			if (page != null) {
				url = url.replace("{page}", page.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviesrecommandationsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviessimilar.<br/>
     * These items are assembled by looking at keywords and genres.
     *
     * @param jMoviessimilarQuestion the query
     * @return JMoviessimilarResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JMoviessimilarResponse getJMoviessimilar(@NonNull JMoviessimilarQuestion jMoviessimilarQuestion) throws JtmdbException {
        JMoviessimilarResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/movie/{movie_id}/similar?api_key={api_key}&language={language}&page={page}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer movieId = jMoviessimilarQuestion.getMovieId();
			if (movieId != null) {
				url = url.replace("{movie_id}", movieId.toString());
			}
			final String language = jMoviessimilarQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}
			final Integer page = jMoviessimilarQuestion.getPage();
			if (page != null) {
				url = url.replace("{page}", page.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviessimilarResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviestranslations.<br/>
     * Get a list of translations that have been created for a movie.
     *
     * @param jMoviestranslationsQuestion the query
     * @return JMoviestranslationsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JMoviestranslationsResponse getJMoviestranslations(@NonNull JMoviestranslationsQuestion jMoviestranslationsQuestion) throws JtmdbException {
        JMoviestranslationsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/movie/{movie_id}/translations?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer movieId = jMoviestranslationsQuestion.getMovieId();
			if (movieId != null) {
				url = url.replace("{movie_id}", movieId.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviestranslationsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JMoviesvideos.<br/>
     * Get the videos that have been added to a movie.
     *
     * @param jMoviesvideosQuestion the query
     * @return JMoviesvideosResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JMoviesvideosResponse getJMoviesvideos(@NonNull JMoviesvideosQuestion jMoviesvideosQuestion) throws JtmdbException {
        JMoviesvideosResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/movie/{movie_id}/images?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer movieId = jMoviesvideosQuestion.getMovieId();
			if (movieId != null) {
				url = url.replace("{movie_id}", movieId.toString());
			}
			final String language = jMoviesvideosQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JMoviesvideosResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvepisodecredits.<br/>
     * Get the TV episode credits by id.
     *
     * @param jTvepisodecreditsQuestion the query
     * @return JTvepisodecreditsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvepisodecreditsResponse getJTvepisodecredits(@NonNull JTvepisodecreditsQuestion jTvepisodecreditsQuestion) throws JtmdbException {
        JTvepisodecreditsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}/episode/{episode_number}/credits?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvepisodecreditsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvepisodecreditsQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final Integer episodeNumber = jTvepisodecreditsQuestion.getEpisodeNumber();
			if (episodeNumber != null) {
				url = url.replace("{episode_number}", episodeNumber.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvepisodecreditsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvepisodedetails.<br/>
     * Get the TV episode details by id.
     *
     * @param jTvepisodedetailsQuestion the query
     * @return JTvepisodedetailsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvepisodedetailsResponse getJTvepisodedetails(@NonNull JTvepisodedetailsQuestion jTvepisodedetailsQuestion) throws JtmdbException {
        JTvepisodedetailsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}/episode/{episode_number}/images?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvepisodedetailsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvepisodedetailsQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final Integer episodeNumber = jTvepisodedetailsQuestion.getEpisodeNumber();
			if (episodeNumber != null) {
				url = url.replace("{episode_number}", episodeNumber.toString());
			}
			final String language = jTvepisodedetailsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvepisodedetailsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvepisodeexternalids.<br/>
     * Get the external ids for a TV episode.
     *
     * @param jTvepisodeexternalidsQuestion the query
     * @return JTvepisodeexternalidsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvepisodeexternalidsResponse getJTvepisodeexternalids(@NonNull JTvepisodeexternalidsQuestion jTvepisodeexternalidsQuestion) throws JtmdbException {
        JTvepisodeexternalidsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvepisodeexternalidsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvepisodeexternalidsQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final Integer episodeNumber = jTvepisodeexternalidsQuestion.getEpisodeNumber();
			if (episodeNumber != null) {
				url = url.replace("{episode_number}", episodeNumber.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvepisodeexternalidsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvepisodeimages.<br/>
     * Get the images that have been added to a TV episode.
     *
     * @param jTvepisodeimagesQuestion the query
     * @return JTvepisodeimagesResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvepisodeimagesResponse getJTvepisodeimages(@NonNull JTvepisodeimagesQuestion jTvepisodeimagesQuestion) throws JtmdbException {
        JTvepisodeimagesResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}/episode/{episode_number}/images?api_key={api_key}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvepisodeimagesQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvepisodeimagesQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final Integer episodeNumber = jTvepisodeimagesQuestion.getEpisodeNumber();
			if (episodeNumber != null) {
				url = url.replace("{episode_number}", episodeNumber.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvepisodeimagesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvepisodevideos.<br/>
     * Get the videos that have been added to a TV episode.
     *
     * @param jTvepisodevideosQuestion the query
     * @return JTvepisodevideosResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvepisodevideosResponse getJTvepisodevideos(@NonNull JTvepisodevideosQuestion jTvepisodevideosQuestion) throws JtmdbException {
        JTvepisodevideosResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvepisodevideosQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvepisodevideosQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final Integer episodeNumber = jTvepisodevideosQuestion.getEpisodeNumber();
			if (episodeNumber != null) {
				url = url.replace("{episode_number}", episodeNumber.toString());
			}
			final String language = jTvepisodevideosQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvepisodevideosResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvseasoncredits.<br/>
     * Get the credits for TV season.
     *
     * @param jTvseasoncreditsQuestion the query
     * @return JTvseasoncreditsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvseasoncreditsResponse getJTvseasoncredits(@NonNull JTvseasoncreditsQuestion jTvseasoncreditsQuestion) throws JtmdbException {
        JTvseasoncreditsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}/credits?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvseasoncreditsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvseasoncreditsQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final String language = jTvseasoncreditsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvseasoncreditsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvseasondetails.<br/>
     * Get the TV season details by id.
     *
     * @param jTvseasondetailsQuestion the query
     * @return JTvseasondetailsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvseasondetailsResponse getJTvseasondetails(@NonNull JTvseasondetailsQuestion jTvseasondetailsQuestion) throws JtmdbException {
        JTvseasondetailsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvseasondetailsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvseasondetailsQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final String language = jTvseasondetailsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvseasondetailsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvseasonexternalids.<br/>
     * Get the credits for TV season.
     *
     * @param jTvseasonexternalidsQuestion the query
     * @return JTvseasonexternalidsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvseasonexternalidsResponse getJTvseasonexternalids(@NonNull JTvseasonexternalidsQuestion jTvseasonexternalidsQuestion) throws JtmdbException {
        JTvseasonexternalidsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}/external_ids?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvseasonexternalidsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvseasonexternalidsQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final String language = jTvseasonexternalidsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvseasonexternalidsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvseasonimages.<br/>
     * Get the images that belong to a TV season.
     *
     * @param jTvseasonimagesQuestion the query
     * @return JTvseasonimagesResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvseasonimagesResponse getJTvseasonimages(@NonNull JTvseasonimagesQuestion jTvseasonimagesQuestion) throws JtmdbException {
        JTvseasonimagesResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}/images?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvseasonimagesQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvseasonimagesQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final String language = jTvseasonimagesQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvseasonimagesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvseasonvideos.<br/>
     * Get the images that belong to a TV season.
     *
     * @param jTvseasonvideosQuestion the query
     * @return JTvseasonvideosResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvseasonvideosResponse getJTvseasonvideos(@NonNull JTvseasonvideosQuestion jTvseasonvideosQuestion) throws JtmdbException {
        JTvseasonvideosResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/season/{season_number}/videos?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvseasonvideosQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final Integer seasonNumber = jTvseasonvideosQuestion.getSeasonNumber();
			if (seasonNumber != null) {
				url = url.replace("{season_number}", seasonNumber.toString());
			}
			final String language = jTvseasonvideosQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvseasonvideosResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvalternativetitles.<br/>
     * Returns all of the alternative titles for a TV show.
     *
     * @param jTvalternativetitlesQuestion the query
     * @return JTvalternativetitlesResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvalternativetitlesResponse getJTvalternativetitles(@NonNull JTvalternativetitlesQuestion jTvalternativetitlesQuestion) throws JtmdbException {
        JTvalternativetitlesResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/alternative_titles?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvalternativetitlesQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final String language = jTvalternativetitlesQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvalternativetitlesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvcredits.<br/>
     * Get the credits (cast and crew) that have been added to a TV show.
     *
     * @param jTvcreditsQuestion the query
     * @return JTvcreditsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvcreditsResponse getJTvcredits(@NonNull JTvcreditsQuestion jTvcreditsQuestion) throws JtmdbException {
        JTvcreditsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/credits?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvcreditsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final String language = jTvcreditsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvcreditsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvdetails.<br/>
     * Get the primary TV show details by id.
     *
     * @param jTvdetailsQuestion the query
     * @return JTvdetailsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvdetailsResponse getJTvdetails(@NonNull JTvdetailsQuestion jTvdetailsQuestion) throws JtmdbException {
        JTvdetailsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvdetailsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final String language = jTvdetailsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvdetailsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvexternalids.<br/>
     * Get the external ids for a TV show. We currently support the following external sources.
     *
     * @param jTvexternalidsQuestion the query
     * @return JTvexternalidsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvexternalidsResponse getJTvexternalids(@NonNull JTvexternalidsQuestion jTvexternalidsQuestion) throws JtmdbException {
        JTvexternalidsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/external_ids?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvexternalidsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final String language = jTvexternalidsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvexternalidsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvimages.<br/>
     * Get the images that belong to a TV show.
     *
     * @param jTvimagesQuestion the query
     * @return JTvimagesResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvimagesResponse getJTvimages(@NonNull JTvimagesQuestion jTvimagesQuestion) throws JtmdbException {
        JTvimagesResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/images?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvimagesQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final String language = jTvimagesQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvimagesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvrecommandations.<br/>
     * Get the list of TV show recommendations for this item.
     *
     * @param jTvrecommandationsQuestion the query
     * @return JTvrecommandationsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvrecommandationsResponse getJTvrecommandations(@NonNull JTvrecommandationsQuestion jTvrecommandationsQuestion) throws JtmdbException {
        JTvrecommandationsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/recommendations?api_key={api_key}&language={language}&page={page}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvrecommandationsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final String language = jTvrecommandationsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}
			final String page = jTvrecommandationsQuestion.getPage();
			if (page != null) {
				url = url.replace("{page}", page.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvrecommandationsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvsimilar.<br/>
     * Get a list of similar TV shows. These items are assembled by looking at keywords and genres.
     *
     * @param jTvsimilarQuestion the query
     * @return JTvsimilarResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvsimilarResponse getJTvsimilar(@NonNull JTvsimilarQuestion jTvsimilarQuestion) throws JtmdbException {
        JTvsimilarResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/similar?api_key={api_key}&language={language}&page={page}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvsimilarQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final String language = jTvsimilarQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}
			final String page = jTvsimilarQuestion.getPage();
			if (page != null) {
				url = url.replace("{page}", page.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvsimilarResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvtranslations.<br/>
     * Get a list of the translations that exist for a TV show.
     *
     * @param jTvtranslationsQuestion the query
     * @return JTvtranslationsResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvtranslationsResponse getJTvtranslations(@NonNull JTvtranslationsQuestion jTvtranslationsQuestion) throws JtmdbException {
        JTvtranslationsResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/translations?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvtranslationsQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final String language = jTvtranslationsQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvtranslationsResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JTvvideos.<br/>
     * Get the videos that have been added to a TV show.
     *
     * @param jTvvideosQuestion the query
     * @return JTvvideosResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JTvvideosResponse getJTvvideos(@NonNull JTvvideosQuestion jTvvideosQuestion) throws JtmdbException {
        JTvvideosResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/tv/{tv_id}/videos?api_key={api_key}&language={language}";
            url = url.replace("{api_key}", this.apiKey);
			final Integer tvId = jTvvideosQuestion.getTvId();
			if (tvId != null) {
				url = url.replace("{tv_id}", tvId.toString());
			}
			final String language = jTvvideosQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JTvvideosResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * This method does not matter if the URL is absolute or relative.
     *
     * @param url
     * @return image from the URL
     * @throws JtmdbException
     * @see BufferedImage
     */
    @Nullable
    public final BufferedImage getImage(@NonNull final String url) throws JtmdbException {
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
            throw new JtmdbException(e.getMessage(), e.getCause());
        }

        return result;
    }

}
