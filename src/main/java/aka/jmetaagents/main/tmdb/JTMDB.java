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
