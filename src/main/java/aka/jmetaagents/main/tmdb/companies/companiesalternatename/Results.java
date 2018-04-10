package aka.jmetaagents.main.tmdb.companies.companiesalternatename;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Results {

	@Nullable
    private String name;
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
     * @param nameParam String
     * @param typeParam String
     */
    public Results(@Nullable final String nameParam, @Nullable final String typeParam) {
        this.name = nameParam;
        this.type = typeParam;
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
     * Get value of type.
     *
     * @return String value of type
     */
    @Nullable
    public final String getType() {
        return this.type;
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
     * Set value of type.
     *
     * @param typeParam
     */
    public final void setType(@Nullable final String typeParam) {
        this.type = typeParam;
    }
}
