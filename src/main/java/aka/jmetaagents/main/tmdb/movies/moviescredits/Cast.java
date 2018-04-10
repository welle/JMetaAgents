package aka.jmetaagents.main.tmdb.movies.moviescredits;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Cast {

    @JsonProperty("cast_id")
	@Nullable
    private Integer castId;
	@Nullable
    private String character;
	@Nullable
    private Integer gender;
    @JsonProperty("credit_id")
	@Nullable
    private String creditId;
	@Nullable
    private String name;
    @JsonProperty("profile_path")
	@Nullable
    private String profilePath;
	@Nullable
    private Integer id;
	@Nullable
    private String department;
	@Nullable
    private String job;
	@Nullable
    private Integer order;

	/**
     * Empty Constructor.
     */
    public Cast() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param castIdParam Integer
     * @param characterParam String
     * @param genderParam Integer
     * @param creditIdParam String
     * @param nameParam String
     * @param profilePathParam String
     * @param idParam Integer
     * @param departmentParam String
     * @param jobParam String
     * @param orderParam Integer
     */
    public Cast(@Nullable final Integer castIdParam, @Nullable final String characterParam, @Nullable final Integer genderParam, @Nullable final String creditIdParam, @Nullable final String nameParam, @Nullable final String profilePathParam, @Nullable final Integer idParam, @Nullable final String departmentParam, @Nullable final String jobParam, @Nullable final Integer orderParam) {
        this.castId = castIdParam;
        this.character = characterParam;
        this.gender = genderParam;
        this.creditId = creditIdParam;
        this.name = nameParam;
        this.profilePath = profilePathParam;
        this.id = idParam;
        this.department = departmentParam;
        this.job = jobParam;
        this.order = orderParam;
    }
    
    /**
     * Get value of castId.
     *
     * @return Integer value of castId
     */
    @Nullable
    public final Integer getCastId() {
        return this.castId;
    }
    
    /**
     * Get value of character.
     *
     * @return String value of character
     */
    @Nullable
    public final String getCharacter() {
        return this.character;
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
     * Get value of creditId.
     *
     * @return String value of creditId
     */
    @Nullable
    public final String getCreditId() {
        return this.creditId;
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
     * Get value of department.
     *
     * @return String value of department
     */
    @Nullable
    public final String getDepartment() {
        return this.department;
    }
    
    /**
     * Get value of job.
     *
     * @return String value of job
     */
    @Nullable
    public final String getJob() {
        return this.job;
    }
    
    /**
     * Get value of order.
     *
     * @return Integer value of order
     */
    @Nullable
    public final Integer getOrder() {
        return this.order;
    }

    
    /**
     * Set value of castId.
     *
     * @param castIdParam
     */
    public final void setCastId(@Nullable final Integer castIdParam) {
        this.castId = castIdParam;
    }
    
    /**
     * Set value of character.
     *
     * @param characterParam
     */
    public final void setCharacter(@Nullable final String characterParam) {
        this.character = characterParam;
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
     * Set value of creditId.
     *
     * @param creditIdParam
     */
    public final void setCreditId(@Nullable final String creditIdParam) {
        this.creditId = creditIdParam;
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
    
    /**
     * Set value of department.
     *
     * @param departmentParam
     */
    public final void setDepartment(@Nullable final String departmentParam) {
        this.department = departmentParam;
    }
    
    /**
     * Set value of job.
     *
     * @param jobParam
     */
    public final void setJob(@Nullable final String jobParam) {
        this.job = jobParam;
    }
    
    /**
     * Set value of order.
     *
     * @param orderParam
     */
    public final void setOrder(@Nullable final Integer orderParam) {
        this.order = orderParam;
    }
}
