package aka.jmetaagents.main.jtmdb.pojo.person.jpersoncredits;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jtmdb.pojo.person.jpersoncredits.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Crew {

    @JsonProperty("original_title")
	@Nullable
    private String originalTitle;
    @JsonProperty("credit_id")
	@Nullable
    private String creditId;
    @JsonProperty("release_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date releaseDate;
	@Nullable
    private Integer id;
	@Nullable
    private Boolean adult;
	@Nullable
    private String department;
	@Nullable
    private String job;
	@Nullable
    private String title;
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;

	/**
     * Empty Constructor.
     */
    public Crew() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param originalTitleParam String
     * @param creditIdParam String
     * @param releaseDateParam Date
     * @param idParam Integer
     * @param adultParam Boolean
     * @param departmentParam String
     * @param jobParam String
     * @param titleParam String
     * @param posterPathParam String
     */
    public Crew(@Nullable final String originalTitleParam, @Nullable final String creditIdParam, @Nullable final Date releaseDateParam, @Nullable final Integer idParam, @Nullable final Boolean adultParam, @Nullable final String departmentParam, @Nullable final String jobParam, @Nullable final String titleParam, @Nullable final String posterPathParam) {
        this.originalTitle = originalTitleParam;
        this.creditId = creditIdParam;
        this.releaseDate = releaseDateParam;
        this.id = idParam;
        this.adult = adultParam;
        this.department = departmentParam;
        this.job = jobParam;
        this.title = titleParam;
        this.posterPath = posterPathParam;
    }
    
    /**
     * Get value of originalTitle.
     *
     * @return String value of originalTitle
     */
    @Nullable
    public final String getOriginalTitle() {
        return this.originalTitle;
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
     * Get value of releaseDate.
     *
     * @return Date value of releaseDate
     */
    @Nullable
    public final Date getReleaseDate() {
        return this.releaseDate;
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
     * Get value of adult.
     *
     * @return Boolean value of adult
     */
    @Nullable
    public final Boolean getAdult() {
        return this.adult;
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
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
    }
    
    /**
     * Get value of posterPath.
     *
     * @return String value of posterPath
     */
    @Nullable
    public final String getPosterPath() {
        return this.posterPath;
    }

    
    /**
     * Set value of originalTitle.
     *
     * @param originalTitleParam
     */
    public final void setOriginalTitle(@Nullable final String originalTitleParam) {
        this.originalTitle = originalTitleParam;
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
     * Set value of releaseDate.
     *
     * @param releaseDateParam
     */
    public final void setReleaseDate(@Nullable final Date releaseDateParam) {
        this.releaseDate = releaseDateParam;
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
     * Set value of adult.
     *
     * @param adultParam
     */
    public final void setAdult(@Nullable final Boolean adultParam) {
        this.adult = adultParam;
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
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
    
    /**
     * Set value of posterPath.
     *
     * @param posterPathParam
     */
    public final void setPosterPath(@Nullable final String posterPathParam) {
        this.posterPath = posterPathParam;
    }
}
