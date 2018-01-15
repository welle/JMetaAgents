package aka.jmetaagents.main.jimdb.pojo.jmovie;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jimdb.pojo.jmovie.deserializers.DateYearDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class RelatedTitle {

    @JsonProperty("image")
	@Nullable
    private Image5 image5;
    @JsonDeserialize(using = DateYearDeserializer.class)
    private Date year;
    @JsonProperty("title_id")
	@Nullable
    private String titleId;
	@Nullable
    private String title;
	@Nullable
    private String type;

	/**
     * Empty Constructor.
     */
    public RelatedTitle() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param image5Param Image5
     * @param yearParam Date
     * @param titleIdParam String
     * @param titleParam String
     * @param typeParam String
     */
    public RelatedTitle(@Nullable final Image5 image5Param, @Nullable final Date yearParam, @Nullable final String titleIdParam, @Nullable final String titleParam, @Nullable final String typeParam) {
        this.image5 = image5Param;
        this.year = yearParam;
        this.titleId = titleIdParam;
        this.title = titleParam;
        this.type = typeParam;
    }
    
    /**
     * Get value of image5.
     *
     * @return Image5 value of image5
     */
    @Nullable
    public final Image5 getImage5() {
        return this.image5;
    }
    
    /**
     * Get value of year.
     *
     * @return Date value of year
     */
    @Nullable
    public final Date getYear() {
        return this.year;
    }
    
    /**
     * Get value of titleId.
     *
     * @return String value of titleId
     */
    @Nullable
    public final String getTitleId() {
        return this.titleId;
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
     * Get value of type.
     *
     * @return String value of type
     */
    @Nullable
    public final String getType() {
        return this.type;
    }

    
    /**
     * Set value of image5.
     *
     * @param image5Param
     */
    public final void setImage5(@Nullable final Image5 image5Param) {
        this.image5 = image5Param;
    }
    
    /**
     * Set value of year.
     *
     * @param yearParam
     */
    public final void setYear(@Nullable final Date yearParam) {
        this.year = yearParam;
    }
    
    /**
     * Set value of titleId.
     *
     * @param titleIdParam
     */
    public final void setTitleId(@Nullable final String titleIdParam) {
        this.titleId = titleIdParam;
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
     * Set value of type.
     *
     * @param typeParam
     */
    public final void setType(@Nullable final String typeParam) {
        this.type = typeParam;
    }
}
