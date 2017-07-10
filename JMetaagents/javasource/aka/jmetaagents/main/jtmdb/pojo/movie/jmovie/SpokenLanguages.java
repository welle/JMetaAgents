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
public final class SpokenLanguages {

	@Nullable
    private String name;
    @JsonProperty("iso_639_1")
	@Nullable
    private String iso6391;

	/**
     * Empty Constructor.
     */
    public SpokenLanguages() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param nameParam String
     * @param iso6391Param String
     */
    public SpokenLanguages(@Nullable final String nameParam, @Nullable final String iso6391Param) {
        this.name = nameParam;
        this.iso6391 = iso6391Param;
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
     * Get value of iso6391.
     *
     * @return String value of iso6391
     */
    @Nullable
    public final String getIso6391() {
        return this.iso6391;
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
     * Set value of iso6391.
     *
     * @param iso6391Param
     */
    public final void setIso6391(@Nullable final String iso6391Param) {
        this.iso6391 = iso6391Param;
    }
}
