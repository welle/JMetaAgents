package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Writer {

	@Nullable
    private String code;
	@Nullable
    private String name;

	/**
     * Empty Constructor.
     */
    public Writer() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam String
     * @param nameParam String
     */
    public Writer(@Nullable final String codeParam, @Nullable final String nameParam) {
        this.code = codeParam;
        this.name = nameParam;
    }
    
    /**
     * Get value of code.
     *
     * @return String value of code
     */
    @Nullable
    public final String getCode() {
        return this.code;
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
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final String codeParam) {
        this.code = codeParam;
    }
    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
}
