package aka.jmetaagents.main.tmdb.tv.tvexternalids;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTvexternalidsQuestion {

    @JsonProperty("tv_id")
	@Nullable
    private Integer tvId;
	@Nullable
    private String language;

	/**
     * Empty Constructor.
     */
    public JTvexternalidsQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param tvIdParam Integer
     * @param languageParam String
     */
    public JTvexternalidsQuestion(@Nullable final Integer tvIdParam, @Nullable final String languageParam) {
        this.tvId = tvIdParam;
        this.language = languageParam;
    }
    
    /**
     * Get value of tvId.
     *
     * @return Integer value of tvId
     */
    @Nullable
    public final Integer getTvId() {
        return this.tvId;
    }
    
    /**
     * Get value of language.
     *
     * @return String value of language
     */
    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    
    /**
     * Set value of tvId.
     *
     * @param tvIdParam
     */
    public final void setTvId(@Nullable final Integer tvIdParam) {
        this.tvId = tvIdParam;
    }
    
    /**
     * Set value of language.
     *
     * @param languageParam
     */
    public final void setLanguage(@Nullable final String languageParam) {
        this.language = languageParam;
    }
}
