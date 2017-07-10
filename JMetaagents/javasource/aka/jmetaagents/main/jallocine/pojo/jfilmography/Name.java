package aka.jmetaagents.main.jallocine.pojo.jfilmography;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Name {

	@Nullable
    private String given;
	@Nullable
    private String family;

	/**
     * Empty Constructor.
     */
    public Name() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param givenParam String
     * @param familyParam String
     */
    public Name(@Nullable final String givenParam, @Nullable final String familyParam) {
        this.given = givenParam;
        this.family = familyParam;
    }
    
    /**
     * Get value of given.
     *
     * @return String value of given
     */
    @Nullable
    public final String getGiven() {
        return this.given;
    }
    
    /**
     * Get value of family.
     *
     * @return String value of family
     */
    @Nullable
    public final String getFamily() {
        return this.family;
    }

    
    /**
     * Set value of given.
     *
     * @param givenParam
     */
    public final void setGiven(@Nullable final String givenParam) {
        this.given = givenParam;
    }
    
    /**
     * Set value of family.
     *
     * @param familyParam
     */
    public final void setFamily(@Nullable final String familyParam) {
        this.family = familyParam;
    }
}
