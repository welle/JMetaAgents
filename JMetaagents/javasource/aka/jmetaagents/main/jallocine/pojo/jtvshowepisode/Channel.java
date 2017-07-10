package aka.jmetaagents.main.jallocine.pojo.jtvshowepisode;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Channel {

	@Nullable
    private Integer code;
	@Nullable
    private String name;
	@Nullable
    private Logo logo;

	/**
     * Empty Constructor.
     */
    public Channel() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param nameParam String
     * @param logoParam Logo
     */
    public Channel(@Nullable final Integer codeParam, @Nullable final String nameParam, @Nullable final Logo logoParam) {
        this.code = codeParam;
        this.name = nameParam;
        this.logo = logoParam;
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
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    /**
     * Get value of logo.
     *
     * @return Logo value of logo
     */
    @Nullable
    public final Logo getLogo() {
        return this.logo;
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
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of logo.
     *
     * @param logoParam
     */
    public final void setLogo(@Nullable final Logo logoParam) {
        this.logo = logoParam;
    }
}
