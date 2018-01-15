package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class DisplayMode {

	@Nullable
    private Integer code;

	/**
     * Empty Constructor.
     */
    public DisplayMode() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     */
    public DisplayMode(@Nullable final Integer codeParam) {
        this.code = codeParam;
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
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
    }
}
