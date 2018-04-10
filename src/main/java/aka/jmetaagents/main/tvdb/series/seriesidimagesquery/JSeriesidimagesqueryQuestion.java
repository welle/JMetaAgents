package aka.jmetaagents.main.tvdb.series.seriesidimagesquery;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JSeriesidimagesqueryQuestion {

	@Nullable
    private String subKey;
	@Nullable
    private Integer id;
    @JsonProperty("Accept-Language")
	@Nullable
    private String acceptLanguage;
	@Nullable
    private String keyType;
	@Nullable
    private String resolution;

	/**
     * Empty Constructor.
     */
    public JSeriesidimagesqueryQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param subKeyParam String
     * @param idParam Integer
     * @param acceptLanguageParam String
     * @param keyTypeParam String
     * @param resolutionParam String
     */
    public JSeriesidimagesqueryQuestion(@Nullable final String subKeyParam, @Nullable final Integer idParam, @Nullable final String acceptLanguageParam, @Nullable final String keyTypeParam, @Nullable final String resolutionParam) {
        this.subKey = subKeyParam;
        this.id = idParam;
        this.acceptLanguage = acceptLanguageParam;
        this.keyType = keyTypeParam;
        this.resolution = resolutionParam;
    }
    
    /**
     * Get value of subKey.
     *
     * @return String value of subKey
     */
    @Nullable
    public final String getSubKey() {
        return this.subKey;
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
     * Get value of keyType.
     *
     * @return String value of keyType
     */
    @Nullable
    public final String getKeyType() {
        return this.keyType;
    }
    
    /**
     * Get value of resolution.
     *
     * @return String value of resolution
     */
    @Nullable
    public final String getResolution() {
        return this.resolution;
    }

    
    /**
     * Set value of subKey.
     *
     * @param subKeyParam
     */
    public final void setSubKey(@Nullable final String subKeyParam) {
        this.subKey = subKeyParam;
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
    
    /**
     * Set value of keyType.
     *
     * @param keyTypeParam
     */
    public final void setKeyType(@Nullable final String keyTypeParam) {
        this.keyType = keyTypeParam;
    }
    
    /**
     * Set value of resolution.
     *
     * @param resolutionParam
     */
    public final void setResolution(@Nullable final String resolutionParam) {
        this.resolution = resolutionParam;
    }
}
