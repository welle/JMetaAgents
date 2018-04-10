package aka.jmetaagents.main.tmdb.tv.season.tvseasonexternalids;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTvseasonexternalidsResponse {

    @JsonProperty("freebase_mid")
	@Nullable
    private String freebaseMid;
    @JsonProperty("tvdb_id")
	@Nullable
    private Integer tvdbId;
    @JsonProperty("freebase_id")
	@Nullable
    private String freebaseId;
	@Nullable
    private Integer id;
    @JsonProperty("tvrage_id")
	@Nullable
    private String tvrageId;

	/**
     * Empty Constructor.
     */
    public JTvseasonexternalidsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param freebaseMidParam String
     * @param tvdbIdParam Integer
     * @param freebaseIdParam String
     * @param idParam Integer
     * @param tvrageIdParam String
     */
    public JTvseasonexternalidsResponse(@Nullable final String freebaseMidParam, @Nullable final Integer tvdbIdParam, @Nullable final String freebaseIdParam, @Nullable final Integer idParam, @Nullable final String tvrageIdParam) {
        this.freebaseMid = freebaseMidParam;
        this.tvdbId = tvdbIdParam;
        this.freebaseId = freebaseIdParam;
        this.id = idParam;
        this.tvrageId = tvrageIdParam;
    }
    
    /**
     * Get value of freebaseMid.
     *
     * @return String value of freebaseMid
     */
    @Nullable
    public final String getFreebaseMid() {
        return this.freebaseMid;
    }
    
    /**
     * Get value of tvdbId.
     *
     * @return Integer value of tvdbId
     */
    @Nullable
    public final Integer getTvdbId() {
        return this.tvdbId;
    }
    
    /**
     * Get value of freebaseId.
     *
     * @return String value of freebaseId
     */
    @Nullable
    public final String getFreebaseId() {
        return this.freebaseId;
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
     * Get value of tvrageId.
     *
     * @return String value of tvrageId
     */
    @Nullable
    public final String getTvrageId() {
        return this.tvrageId;
    }

    
    /**
     * Set value of freebaseMid.
     *
     * @param freebaseMidParam
     */
    public final void setFreebaseMid(@Nullable final String freebaseMidParam) {
        this.freebaseMid = freebaseMidParam;
    }
    
    /**
     * Set value of tvdbId.
     *
     * @param tvdbIdParam
     */
    public final void setTvdbId(@Nullable final Integer tvdbIdParam) {
        this.tvdbId = tvdbIdParam;
    }
    
    /**
     * Set value of freebaseId.
     *
     * @param freebaseIdParam
     */
    public final void setFreebaseId(@Nullable final String freebaseIdParam) {
        this.freebaseId = freebaseIdParam;
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
     * Set value of tvrageId.
     *
     * @param tvrageIdParam
     */
    public final void setTvrageId(@Nullable final String tvrageIdParam) {
        this.tvrageId = tvrageIdParam;
    }
}
