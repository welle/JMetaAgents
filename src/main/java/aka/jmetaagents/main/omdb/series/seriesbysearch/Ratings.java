package aka.jmetaagents.main.omdb.series.seriesbysearch;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Ratings {

    @JsonProperty("Value")
	@Nullable
    private String value;
    @JsonProperty("Source")
	@Nullable
    private String source;

	/**
     * Empty Constructor.
     */
    public Ratings() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param valueParam String
     * @param sourceParam String
     */
    public Ratings(@Nullable final String valueParam, @Nullable final String sourceParam) {
        this.value = valueParam;
        this.source = sourceParam;
    }
    
    /**
     * Get value of value.
     *
     * @return String value of value
     */
    @Nullable
    public final String getValue() {
        return this.value;
    }
    
    /**
     * Get value of source.
     *
     * @return String value of source
     */
    @Nullable
    public final String getSource() {
        return this.source;
    }

    
    /**
     * Set value of value.
     *
     * @param valueParam
     */
    public final void setValue(@Nullable final String valueParam) {
        this.value = valueParam;
    }
    
    /**
     * Set value of source.
     *
     * @param sourceParam
     */
    public final void setSource(@Nullable final String sourceParam) {
        this.source = sourceParam;
    }
}
