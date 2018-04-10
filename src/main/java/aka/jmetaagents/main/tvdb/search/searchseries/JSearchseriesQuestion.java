package aka.jmetaagents.main.tvdb.search.searchseries;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JSearchseriesQuestion {

	@Nullable
    private String zap2itId;
	@Nullable
    private String imdbId;
	@Nullable
    private String name;
    @JsonProperty("Accept-Language")
	@Nullable
    private String acceptLanguage;

	/**
     * Empty Constructor.
     */
    public JSearchseriesQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param zap2itIdParam String
     * @param imdbIdParam String
     * @param nameParam String
     * @param acceptLanguageParam String
     */
    public JSearchseriesQuestion(@Nullable final String zap2itIdParam, @Nullable final String imdbIdParam, @Nullable final String nameParam, @Nullable final String acceptLanguageParam) {
        this.zap2itId = zap2itIdParam;
        this.imdbId = imdbIdParam;
        this.name = nameParam;
        this.acceptLanguage = acceptLanguageParam;
    }
    
    /**
     * Get value of zap2itId.
     *
     * @return String value of zap2itId
     */
    @Nullable
    public final String getZap2itId() {
        return this.zap2itId;
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
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
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
     * Set value of zap2itId.
     *
     * @param zap2itIdParam
     */
    public final void setZap2itId(@Nullable final String zap2itIdParam) {
        this.zap2itId = zap2itIdParam;
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
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
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
