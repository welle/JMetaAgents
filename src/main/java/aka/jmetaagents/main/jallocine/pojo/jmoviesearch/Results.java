package aka.jmetaagents.main.jallocine.pojo.jmoviesearch;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Results {

    @JsonProperty("$")
	@Nullable
    private Integer value;
	@Nullable
    private String type;

	/**
     * Empty Constructor.
     */
    public Results() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param valueParam Integer
     * @param typeParam String
     */
    public Results(@Nullable final Integer valueParam, @Nullable final String typeParam) {
        this.value = valueParam;
        this.type = typeParam;
    }
    
    /**
     * Get value of value.
     *
     * @return Integer value of value
     */
    @Nullable
    public final Integer getValue() {
        return this.value;
    }
    
    /**
     * Get value of type.
     *
     * @return String value of type
     */
    @Nullable
    public final String getType() {
        return this.type;
    }

    
    /**
     * Set value of value.
     *
     * @param valueParam
     */
    public final void setValue(@Nullable final Integer valueParam) {
        this.value = valueParam;
    }
    
    /**
     * Set value of type.
     *
     * @param typeParam
     */
    public final void setType(@Nullable final String typeParam) {
        this.type = typeParam;
    }
}
