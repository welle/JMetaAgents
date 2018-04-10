package aka.jmetaagents.main.tvdb.series.seriesidfilter;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JSeriesidfilterQuestion {

	@Nullable
    private String keys;
	@Nullable
    private Integer id;
    @JsonProperty("Accept-Language")
	@Nullable
    private String acceptLanguage;

	/**
     * Empty Constructor.
     */
    public JSeriesidfilterQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param keysParam String
     * @param idParam Integer
     * @param acceptLanguageParam String
     */
    public JSeriesidfilterQuestion(@Nullable final String keysParam, @Nullable final Integer idParam, @Nullable final String acceptLanguageParam) {
        this.keys = keysParam;
        this.id = idParam;
        this.acceptLanguage = acceptLanguageParam;
    }
    
    /**
     * Get value of keys.
     *
     * @return String value of keys
     */
    @Nullable
    public final String getKeys() {
        return this.keys;
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
     * Get value of acceptLanguage.
     *
     * @return String value of acceptLanguage
     */
    @Nullable
    public final String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    
    /**
     * Set value of keys.
     *
     * @param keysParam
     */
    public final void setKeys(@Nullable final String keysParam) {
        this.keys = keysParam;
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
     * Set value of acceptLanguage.
     *
     * @param acceptLanguageParam
     */
    public final void setAcceptLanguage(@Nullable final String acceptLanguageParam) {
        this.acceptLanguage = acceptLanguageParam;
    }
}
