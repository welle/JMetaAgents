package aka.jmetaagents.main.jallocine.pojo.jtvshow;

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
    private Country country;
	@Nullable
    private Integer code;
	@Nullable
    private String name;

	/**
     * Empty Constructor.
     */
    public Channel() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param countryParam Country
     * @param codeParam Integer
     * @param nameParam String
     */
    public Channel(@Nullable final Country countryParam, @Nullable final Integer codeParam, @Nullable final String nameParam) {
        this.country = countryParam;
        this.code = codeParam;
        this.name = nameParam;
    }
    
    /**
     * Get value of country.
     *
     * @return Country value of country
     */
    @Nullable
    public final Country getCountry() {
        return this.country;
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
     * Set value of country.
     *
     * @param countryParam
     */
    public final void setCountry(@Nullable final Country countryParam) {
        this.country = countryParam;
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
}