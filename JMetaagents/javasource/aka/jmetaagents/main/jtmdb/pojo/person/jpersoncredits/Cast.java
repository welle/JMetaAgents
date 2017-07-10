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
public final class Cast {

	@Nullable
    private String character;
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
    private String title;
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;

	/**
     * Empty Constructor.
     */
    public Cast() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param characterParam String
     * @param originalTitleParam String
     * @param creditIdParam String
     * @param releaseDateParam Date
     * @param idParam Integer
     * @param adultParam Boolean
     * @param titleParam String
     * @param posterPathParam String
     */
    public Cast(@Nullable final String characterParam, @Nullable final String originalTitleParam, @Nullable final String creditIdParam, @Nullable final Date releaseDateParam, @Nullable final Integer idParam, @Nullable final Boolean adultParam, @Nullable final String titleParam, @Nullable final String posterPathParam) {
        this.character = characterParam;
        this.originalTitle = originalTitleParam;
        this.creditId = creditIdParam;
        this.releaseDate = releaseDateParam;
        this.id = idParam;
        this.adult = adultParam;
        this.title = titleParam;
        this.posterPath = posterPathParam;
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
     * Set value of character.
     *
     * @param characterParam
     */
    public final void setCharacter(@Nullable final String characterParam) {
        this.character = characterParam;
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
