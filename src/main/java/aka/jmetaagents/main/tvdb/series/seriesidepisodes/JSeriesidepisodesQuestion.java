package aka.jmetaagents.main.tvdb.series.seriesidepisodes;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JSeriesidepisodesQuestion {

	@Nullable
    private Integer id;
    @JsonProperty("Accept-Language")
	@Nullable
    private String acceptLanguage;

	/**
     * Empty Constructor.
     */
    public JSeriesidepisodesQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param idParam Integer
     * @param acceptLanguageParam String
     */
    public JSeriesidepisodesQuestion(@Nullable final Integer idParam, @Nullable final String acceptLanguageParam) {
        this.id = idParam;
        this.acceptLanguage = acceptLanguageParam;
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
