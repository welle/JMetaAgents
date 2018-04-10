package aka.jmetaagents.main.tmdb.movies.moviesexternalids;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMoviesexternalidsResponse {

    @JsonProperty("imdb_id")
	@Nullable
    private String imdbId;
	@Nullable
    private Integer id;
    @JsonProperty("twitter_id")
	@Nullable
    private String twitterId;
    @JsonProperty("facebook_id")
	@Nullable
    private String facebookId;
    @JsonProperty("instagram_id")
	@Nullable
    private String instagramId;

	/**
     * Empty Constructor.
     */
    public JMoviesexternalidsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param imdbIdParam String
     * @param idParam Integer
     * @param twitterIdParam String
     * @param facebookIdParam String
     * @param instagramIdParam String
     */
    public JMoviesexternalidsResponse(@Nullable final String imdbIdParam, @Nullable final Integer idParam, @Nullable final String twitterIdParam, @Nullable final String facebookIdParam, @Nullable final String instagramIdParam) {
        this.imdbId = imdbIdParam;
        this.id = idParam;
        this.twitterId = twitterIdParam;
        this.facebookId = facebookIdParam;
        this.instagramId = instagramIdParam;
    }
    
    /**
     * Get value of imdbId.
     *
     * @return String value of imdbId
     */
    @Nullable
    public final String getImdbId() {
        return this.imdbId;
    }
    
    /**
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }
    
    /**
     * Get value of twitterId.
     *
     * @return String value of twitterId
     */
    @Nullable
    public final String getTwitterId() {
        return this.twitterId;
    }
    
    /**
     * Get value of facebookId.
     *
     * @return String value of facebookId
     */
    @Nullable
    public final String getFacebookId() {
        return this.facebookId;
    }
    
    /**
     * Get value of instagramId.
     *
     * @return String value of instagramId
     */
    @Nullable
    public final String getInstagramId() {
        return this.instagramId;
    }

    
    /**
     * Set value of imdbId.
     *
     * @param imdbIdParam
     */
    public final void setImdbId(@Nullable final String imdbIdParam) {
        this.imdbId = imdbIdParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of twitterId.
     *
     * @param twitterIdParam
     */
    public final void setTwitterId(@Nullable final String twitterIdParam) {
        this.twitterId = twitterIdParam;
    }
    
    /**
     * Set value of facebookId.
     *
     * @param facebookIdParam
     */
    public final void setFacebookId(@Nullable final String facebookIdParam) {
        this.facebookId = facebookIdParam;
    }
    
    /**
     * Set value of instagramId.
     *
     * @param instagramIdParam
     */
    public final void setInstagramId(@Nullable final String instagramIdParam) {
        this.instagramId = instagramIdParam;
    }
}
