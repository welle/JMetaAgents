package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class AcShow {

	@Nullable
    private Integer code;
    @JsonProperty("$")
	@Nullable
    private String value;
	@Nullable
    private String nameShort;

	/**
     * Empty Constructor.
     */
    public AcShow() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param valueParam String
     * @param nameShortParam String
     */
    public AcShow(@Nullable final Integer codeParam, @Nullable final String valueParam, @Nullable final String nameShortParam) {
        this.code = codeParam;
        this.value = valueParam;
        this.nameShort = nameShortParam;
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
     * Get value of nameShort.
     *
     * @return String value of nameShort
     */
    @Nullable
    public final String getNameShort() {
        return this.nameShort;
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
    
    /**
     * Set value of nameShort.
     *
     * @param nameShortParam
     */
    public final void setNameShort(@Nullable final String nameShortParam) {
        this.nameShort = nameShortParam;
    }
}
