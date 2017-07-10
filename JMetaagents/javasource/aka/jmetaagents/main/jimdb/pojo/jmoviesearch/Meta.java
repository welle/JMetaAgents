package aka.jmetaagents.main.jimdb.pojo.jmoviesearch;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Meta {

	@Nullable
    private Integer serverTimeMs;
	@Nullable
    private String requestId;

	/**
     * Empty Constructor.
     */
    public Meta() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param serverTimeMsParam Integer
     * @param requestIdParam String
     */
    public Meta(@Nullable final Integer serverTimeMsParam, @Nullable final String requestIdParam) {
        this.serverTimeMs = serverTimeMsParam;
        this.requestId = requestIdParam;
    }
    
    /**
     * Get value of serverTimeMs.
     *
     * @return Integer value of serverTimeMs
     */
    @Nullable
    public final Integer getServerTimeMs() {
        return this.serverTimeMs;
    }
    
    /**
     * Get value of requestId.
     *
     * @return String value of requestId
     */
    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    
    /**
     * Set value of serverTimeMs.
     *
     * @param serverTimeMsParam
     */
    public final void setServerTimeMs(@Nullable final Integer serverTimeMsParam) {
        this.serverTimeMs = serverTimeMsParam;
    }
    
    /**
     * Set value of requestId.
     *
     * @param requestIdParam
     */
    public final void setRequestId(@Nullable final String requestIdParam) {
        this.requestId = requestIdParam;
    }
}
