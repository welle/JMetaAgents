package aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Crew {

	@Nullable
    private String gender;
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

	/**
     * Empty Constructor.
     */
    public Crew() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param genderParam String
     * @param creditIdParam String
     * @param nameParam String
     * @param profilePathParam String
     * @param idParam Integer
     * @param departmentParam String
     * @param jobParam String
     */
    public Crew(@Nullable final String genderParam, @Nullable final String creditIdParam, @Nullable final String nameParam, @Nullable final String profilePathParam, @Nullable final Integer idParam, @Nullable final String departmentParam, @Nullable final String jobParam) {
        this.gender = genderParam;
        this.creditId = creditIdParam;
        this.name = nameParam;
        this.profilePath = profilePathParam;
        this.id = idParam;
        this.department = departmentParam;
        this.job = jobParam;
    }
    
    /**
     * Get value of gender.
     *
     * @return String value of gender
     */
    @Nullable
    public final String getGender() {
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
     * Set value of gender.
     *
     * @param genderParam
     */
    public final void setGender(@Nullable final String genderParam) {
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
}
