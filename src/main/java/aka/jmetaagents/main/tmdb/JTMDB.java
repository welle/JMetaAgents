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
import aka.jmetaagents.main.tmdb.genres.genresgetmovies.JGenresgetmoviesQuestion;
import aka.jmetaagents.main.tmdb.genres.genresgetmovies.JGenresgetmoviesQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.genres.genresgetmovies.JGenresgetmoviesResponse;
import aka.jmetaagents.main.tmdb.genres.genresgetmovies.JGenresgetmoviesResponseJacksonMapper;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistQuestion;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistQuestionJacksonMapper;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistResponse;
import aka.jmetaagents.main.tmdb.genres.genresgettvlist.JGenresgettvlistResponseJacksonMapper;

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
     * Get JCollectionsdetails.
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
     * Get JCollectionsimages.
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
     * Get JCollectionstranslations.
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
     * Get JCompaniesalternatename.
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
     * Get JCompaniesdetails.
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
     * Get JCompaniesimages.
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
     * Get JCreditsdetails.
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
     * Get JFindbyimdbid.
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
     * Get JFindbytvdbid.
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
     * Get JGenresgetmovielist.
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
     * Get JGenresgetmovies.
     *
     * @param jGenresgetmoviesQuestion the query
     * @return JGenresgetmoviesResponse
     * @throws JtmdbException
     */
    @Nullable
    public final JGenresgetmoviesResponse getJGenresgetmovies(@NonNull JGenresgetmoviesQuestion jGenresgetmoviesQuestion) throws JtmdbException {
        JGenresgetmoviesResponse result = null;
        
        try {
            String url = "https://api.themoviedb.org/3/genre/{genre_id}/movies?api_key={api_key}&language={language}&include_adult={include_adult}&sort_by=created_at.asc";
            url = url.replace("{api_key}", this.apiKey);
			final Integer genreId = jGenresgetmoviesQuestion.getGenreId();
			if (genreId != null) {
				url = url.replace("{genre_id}", genreId.toString());
			}
			final String language = jGenresgetmoviesQuestion.getLanguage();
			if (language != null) {
				url = url.replace("{language}", language.toString());
			}
			final Boolean includeAdult = jGenresgetmoviesQuestion.getIncludeAdult();
			if (includeAdult != null) {
				url = url.replace("{include_adult}", includeAdult.toString());
			}

            final HTTPRequestData httpRequestData = new HTTPRequestData(url);


            final HTTPResponseString response = (HTTPResponseString) this.httpManager.sendGetRequest(httpRequestData);
            final String jsonString = response.getContent();
            result = readValue(JGenresgetmoviesResponseJacksonMapper.class, jsonString);
        } catch (final HTTPException | MalformedURLException e) {
            throw new JtmdbException(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * Get JGenresgettvlist.
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
