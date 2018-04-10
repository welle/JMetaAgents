package aka.jmetaagents.main.tmdb.find.findbyimdbid;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JFindbyimdbidQuestion {

    @JsonProperty("external_id")
	@Nullable
    private Integer externalId;
	@Nullable
    private String language;

	/**
     * Empty Constructor.
     */
    public JFindbyimdbidQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param externalIdParam Integer
     * @param languageParam String
     */
    public JFindbyimdbidQuestion(@Nullable final Integer externalIdParam, @Nullable final String languageParam) {
        this.externalId = externalIdParam;
        this.language = languageParam;
    }
    
    /**
     * Get value of externalId.
     *
     * @return Integer value of externalId
     */
    @Nullable
    public final Integer getExternalId() {
        return this.externalId;
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
     * Set value of externalId.
     *
     * @param externalIdParam
     */
    public final void setExternalId(@Nullable final Integer externalIdParam) {
        this.externalId = externalIdParam;
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
