package aka.jmetaagents.main.jtmdb.pojo.movie.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class ProductionCountries {

    @JsonProperty("iso_3166_1")
	@Nullable
    private String iso31661;
	@Nullable
    private String name;

	/**
     * Empty Constructor.
     */
    public ProductionCountries() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param iso31661Param String
     * @param nameParam String
     */
    public ProductionCountries(@Nullable final String iso31661Param, @Nullable final String nameParam) {
        this.iso31661 = iso31661Param;
        this.name = nameParam;
    }
    
    /**
     * Get value of iso31661.
     *
     * @return String value of iso31661
     */
    @Nullable
    public final String getIso31661() {
        return this.iso31661;
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
     * Set value of iso31661.
     *
     * @param iso31661Param
     */
    public final void setIso31661(@Nullable final String iso31661Param) {
        this.iso31661 = iso31661Param;
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
