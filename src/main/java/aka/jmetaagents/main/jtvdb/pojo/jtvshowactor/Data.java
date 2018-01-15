package aka.jmetaagents.main.jtvdb.pojo.jtvshowactor;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowactor.deserializers.DateYearMonthDayHourDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Data {

	@Nullable
    private String image;
    @JsonDeserialize(using = DateYearMonthDayHourDashDeserializer.class)
    private Date lastUpdated;
	@Nullable
    private String role;
	@Nullable
    private Integer sortOrder;
	@Nullable
    private Integer imageAuthor;
	@Nullable
    private String imageAdded;
	@Nullable
    private String name;
	@Nullable
    private Integer id;
	@Nullable
    private Integer seriesId;

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param imageParam String
     * @param lastUpdatedParam Date
     * @param roleParam String
     * @param sortOrderParam Integer
     * @param imageAuthorParam Integer
     * @param imageAddedParam String
     * @param nameParam String
     * @param idParam Integer
     * @param seriesIdParam Integer
     */
    public Data(@Nullable final String imageParam, @Nullable final Date lastUpdatedParam, @Nullable final String roleParam, @Nullable final Integer sortOrderParam, @Nullable final Integer imageAuthorParam, @Nullable final String imageAddedParam, @Nullable final String nameParam, @Nullable final Integer idParam, @Nullable final Integer seriesIdParam) {
        this.image = imageParam;
        this.lastUpdated = lastUpdatedParam;
        this.role = roleParam;
        this.sortOrder = sortOrderParam;
        this.imageAuthor = imageAuthorParam;
        this.imageAdded = imageAddedParam;
        this.name = nameParam;
        this.id = idParam;
        this.seriesId = seriesIdParam;
    }
    
    /**
     * Get value of image.
     *
     * @return String value of image
     */
    @Nullable
    public final String getImage() {
        return this.image;
    }
    
    /**
     * Get value of lastUpdated.
     *
     * @return Date value of lastUpdated
     */
    @Nullable
    public final Date getLastUpdated() {
        return this.lastUpdated;
    }
    
    /**
     * Get value of role.
     *
     * @return String value of role
     */
    @Nullable
    public final String getRole() {
        return this.role;
    }
    
    /**
     * Get value of sortOrder.
     *
     * @return Integer value of sortOrder
     */
    @Nullable
    public final Integer getSortOrder() {
        return this.sortOrder;
    }
    
    /**
     * Get value of imageAuthor.
     *
     * @return Integer value of imageAuthor
     */
    @Nullable
    public final Integer getImageAuthor() {
        return this.imageAuthor;
    }
    
    /**
     * Get value of imageAdded.
     *
     * @return String value of imageAdded
     */
    @Nullable
    public final String getImageAdded() {
        return this.imageAdded;
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
     * Get value of seriesId.
     *
     * @return Integer value of seriesId
     */
    @Nullable
    public final Integer getSeriesId() {
        return this.seriesId;
    }

    
    /**
     * Set value of image.
     *
     * @param imageParam
     */
    public final void setImage(@Nullable final String imageParam) {
        this.image = imageParam;
    }
    
    /**
     * Set value of lastUpdated.
     *
     * @param lastUpdatedParam
     */
    public final void setLastUpdated(@Nullable final Date lastUpdatedParam) {
        this.lastUpdated = lastUpdatedParam;
    }
    
    /**
     * Set value of role.
     *
     * @param roleParam
     */
    public final void setRole(@Nullable final String roleParam) {
        this.role = roleParam;
    }
    
    /**
     * Set value of sortOrder.
     *
     * @param sortOrderParam
     */
    public final void setSortOrder(@Nullable final Integer sortOrderParam) {
        this.sortOrder = sortOrderParam;
    }
    
    /**
     * Set value of imageAuthor.
     *
     * @param imageAuthorParam
     */
    public final void setImageAuthor(@Nullable final Integer imageAuthorParam) {
        this.imageAuthor = imageAuthorParam;
    }
    
    /**
     * Set value of imageAdded.
     *
     * @param imageAddedParam
     */
    public final void setImageAdded(@Nullable final String imageAddedParam) {
        this.imageAdded = imageAddedParam;
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
     * Set value of seriesId.
     *
     * @param seriesIdParam
     */
    public final void setSeriesId(@Nullable final Integer seriesIdParam) {
        this.seriesId = seriesIdParam;
    }
}
