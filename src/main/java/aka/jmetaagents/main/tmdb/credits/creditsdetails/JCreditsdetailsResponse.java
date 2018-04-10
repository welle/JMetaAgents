package aka.jmetaagents.main.tmdb.credits.creditsdetails;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JCreditsdetailsResponse {

    @JsonProperty("media_type")
	@Nullable
    private String mediaType;
	@Nullable
    private Person person;
	@Nullable
    private Media media;
	@Nullable
    private String id;
    @JsonProperty("credit_type")
	@Nullable
    private String creditType;
	@Nullable
    private String department;
	@Nullable
    private String job;

	/**
     * Empty Constructor.
     */
    public JCreditsdetailsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param mediaTypeParam String
     * @param personParam Person
     * @param mediaParam Media
     * @param idParam String
     * @param creditTypeParam String
     * @param departmentParam String
     * @param jobParam String
     */
    public JCreditsdetailsResponse(@Nullable final String mediaTypeParam, @Nullable final Person personParam, @Nullable final Media mediaParam, @Nullable final String idParam, @Nullable final String creditTypeParam, @Nullable final String departmentParam, @Nullable final String jobParam) {
        this.mediaType = mediaTypeParam;
        this.person = personParam;
        this.media = mediaParam;
        this.id = idParam;
        this.creditType = creditTypeParam;
        this.department = departmentParam;
        this.job = jobParam;
    }
    
    /**
     * Get value of mediaType.
     *
     * @return String value of mediaType
     */
    @Nullable
    public final String getMediaType() {
        return this.mediaType;
    }
    
    /**
     * Get value of person.
     *
     * @return Person value of person
     */
    @Nullable
    public final Person getPerson() {
        return this.person;
    }
    
    /**
     * Get value of media.
     *
     * @return Media value of media
     */
    @Nullable
    public final Media getMedia() {
        return this.media;
    }
    
    /**
     * Get value of id.
     *
     * @return String value of id
     */
    @Nullable
    public final String getId() {
        return this.id;
    }
    
    /**
     * Get value of creditType.
     *
     * @return String value of creditType
     */
    @Nullable
    public final String getCreditType() {
        return this.creditType;
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
     * Set value of mediaType.
     *
     * @param mediaTypeParam
     */
    public final void setMediaType(@Nullable final String mediaTypeParam) {
        this.mediaType = mediaTypeParam;
    }
    
    /**
     * Set value of person.
     *
     * @param personParam
     */
    public final void setPerson(@Nullable final Person personParam) {
        this.person = personParam;
    }
    
    /**
     * Set value of media.
     *
     * @param mediaParam
     */
    public final void setMedia(@Nullable final Media mediaParam) {
        this.media = mediaParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final String idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of creditType.
     *
     * @param creditTypeParam
     */
    public final void setCreditType(@Nullable final String creditTypeParam) {
        this.creditType = creditTypeParam;
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
