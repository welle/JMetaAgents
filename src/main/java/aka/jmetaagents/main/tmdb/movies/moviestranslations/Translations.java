package aka.jmetaagents.main.tmdb.movies.moviestranslations;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Translations {

    @JsonProperty("iso_3166_1")
	@Nullable
    private String iso31661;
	@Nullable
    private String name;
    @JsonProperty("iso_639_1")
	@Nullable
    private String iso6391;
    @JsonProperty("english_name")
	@Nullable
    private String englishName;

	/**
     * Empty Constructor.
     */
    public Translations() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param iso31661Param String
     * @param nameParam String
     * @param iso6391Param String
     * @param englishNameParam String
     */
    public Translations(@Nullable final String iso31661Param, @Nullable final String nameParam, @Nullable final String iso6391Param, @Nullable final String englishNameParam) {
        this.iso31661 = iso31661Param;
        this.name = nameParam;
        this.iso6391 = iso6391Param;
        this.englishName = englishNameParam;
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
     * Get value of iso6391.
     *
     * @return String value of iso6391
     */
    @Nullable
    public final String getIso6391() {
        return this.iso6391;
    }
    
    /**
     * Get value of englishName.
     *
     * @return String value of englishName
     */
    @Nullable
    public final String getEnglishName() {
        return this.englishName;
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
    
    /**
     * Set value of iso6391.
     *
     * @param iso6391Param
     */
    public final void setIso6391(@Nullable final String iso6391Param) {
        this.iso6391 = iso6391Param;
    }
    
    /**
     * Set value of englishName.
     *
     * @param englishNameParam
     */
    public final void setEnglishName(@Nullable final String englishNameParam) {
        this.englishName = englishNameParam;
    }
}
