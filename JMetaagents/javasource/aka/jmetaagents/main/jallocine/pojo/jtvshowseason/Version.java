package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Version {

	@Nullable
    private Integer code;
	@Nullable
    private Integer original;
    @JsonProperty("$")
	@Nullable
    private String value;

	/**
     * Empty Constructor.
     */
    public Version() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param originalParam Integer
     * @param valueParam String
     */
    public Version(@Nullable final Integer codeParam, @Nullable final Integer originalParam, @Nullable final String valueParam) {
        this.code = codeParam;
        this.original = originalParam;
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
     * Get value of original.
     *
     * @return Integer value of original
     */
    @Nullable
    public final Integer getOriginal() {
        return this.original;
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
     * Set value of original.
     *
     * @param originalParam
     */
    public final void setOriginal(@Nullable final Integer originalParam) {
        this.original = originalParam;
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
