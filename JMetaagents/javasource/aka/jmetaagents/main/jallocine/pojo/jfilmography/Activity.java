package aka.jmetaagents.main.jallocine.pojo.jfilmography;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Activity {

	@Nullable
    private Integer code;
    @JsonProperty("$")
	@Nullable
    private String value;

	/**
     * Empty Constructor.
     */
    public Activity() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param valueParam String
     */
    public Activity(@Nullable final Integer codeParam, @Nullable final String valueParam) {
        this.code = codeParam;
        this.value = valueParam;
    }
    
    /**
     * Get value of code.
     *
     * @return Integer value of code
     */
    @Nullable
    public final Integer getCode() {
        return this.code;
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
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
    }
    
    /**
     * Set value of value.
     *
     * @param valueParam
     */
    public final void setValue(@Nullable final String valueParam) {
        this.value = valueParam;
    }
}
