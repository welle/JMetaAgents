package aka.jmetaagents.main.tmdb.tv.tvrecommandations;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTvrecommandationsQuestion {

    @JsonProperty("tv_id")
	@Nullable
    private Integer tvId;
	@Nullable
    private String language;
	@Nullable
    private String page;

	/**
     * Empty Constructor.
     */
    public JTvrecommandationsQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param tvIdParam Integer
     * @param languageParam String
     * @param pageParam String
     */
    public JTvrecommandationsQuestion(@Nullable final Integer tvIdParam, @Nullable final String languageParam, @Nullable final String pageParam) {
        this.tvId = tvIdParam;
        this.language = languageParam;
        this.page = pageParam;
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
     * Get value of page.
     *
     * @return String value of page
     */
    @Nullable
    public final String getPage() {
        return this.page;
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
    
    /**
     * Set value of page.
     *
     * @param pageParam
     */
    public final void setPage(@Nullable final String pageParam) {
        this.page = pageParam;
    }
}
