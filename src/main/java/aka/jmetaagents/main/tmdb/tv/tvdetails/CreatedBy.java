package aka.jmetaagents.main.tmdb.tv.tvdetails;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class CreatedBy {

	@Nullable
    private Integer gender;
	@Nullable
    private String name;
    @JsonProperty("profile_path")
	@Nullable
    private String profilePath;
	@Nullable
    private Integer id;

	/**
     * Empty Constructor.
     */
    public CreatedBy() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param genderParam Integer
     * @param nameParam String
     * @param profilePathParam String
     * @param idParam Integer
     */
    public CreatedBy(@Nullable final Integer genderParam, @Nullable final String nameParam, @Nullable final String profilePathParam, @Nullable final Integer idParam) {
        this.gender = genderParam;
        this.name = nameParam;
        this.profilePath = profilePathParam;
        this.id = idParam;
    }
    
    /**
     * Get value of gender.
     *
     * @return Integer value of gender
     */
    @Nullable
    public final Integer getGender() {
        return this.gender;
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
     * Get value of profilePath.
     *
     * @return String value of profilePath
     */
    @Nullable
    public final String getProfilePath() {
        return this.profilePath;
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
     * Set value of gender.
     *
     * @param genderParam
     */
    public final void setGender(@Nullable final Integer genderParam) {
        this.gender = genderParam;
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
     * Set value of profilePath.
     *
     * @param profilePathParam
     */
    public final void setProfilePath(@Nullable final String profilePathParam) {
        this.profilePath = profilePathParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
}
