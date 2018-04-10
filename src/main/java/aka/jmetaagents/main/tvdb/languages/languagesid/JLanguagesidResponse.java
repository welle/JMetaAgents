package aka.jmetaagents.main.tvdb.languages.languagesid;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JLanguagesidResponse {

	@Nullable
    private String englishName;
	@Nullable
    private String name;
	@Nullable
    private Integer id;
	@Nullable
    private String abbreviation;

	/**
     * Empty Constructor.
     */
    public JLanguagesidResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param englishNameParam String
     * @param nameParam String
     * @param idParam Integer
     * @param abbreviationParam String
     */
    public JLanguagesidResponse(@Nullable final String englishNameParam, @Nullable final String nameParam, @Nullable final Integer idParam, @Nullable final String abbreviationParam) {
        this.englishName = englishNameParam;
        this.name = nameParam;
        this.id = idParam;
        this.abbreviation = abbreviationParam;
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
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    /**
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }
    
    /**
     * Get value of abbreviation.
     *
     * @return String value of abbreviation
     */
    @Nullable
    public final String getAbbreviation() {
        return this.abbreviation;
    }

    
    /**
     * Set value of englishName.
     *
     * @param englishNameParam
     */
    public final void setEnglishName(@Nullable final String englishNameParam) {
        this.englishName = englishNameParam;
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
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of abbreviation.
     *
     * @param abbreviationParam
     */
    public final void setAbbreviation(@Nullable final String abbreviationParam) {
        this.abbreviation = abbreviationParam;
    }
}
