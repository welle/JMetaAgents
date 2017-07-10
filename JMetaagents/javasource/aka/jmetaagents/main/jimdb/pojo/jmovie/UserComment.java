package aka.jmetaagents.main.jimdb.pojo.jmovie;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jimdb.pojo.jmovie.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class UserComment {

    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date date;
	@Nullable
    private String summary;
    @JsonProperty("user_score_count")
	@Nullable
    private Integer userScoreCount;
    @JsonProperty("user_score")
	@Nullable
    private Integer userScore;
    @JsonProperty("user_name")
	@Nullable
    private String userName;
	@Nullable
    private String text;
    @JsonProperty("user_location")
	@Nullable
    private String userLocation;
    @JsonProperty("user_rating")
	@Nullable
    private Integer userRating;
	@Nullable
    private String status;

	/**
     * Empty Constructor.
     */
    public UserComment() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dateParam Date
     * @param summaryParam String
     * @param userScoreCountParam Integer
     * @param userScoreParam Integer
     * @param userNameParam String
     * @param textParam String
     * @param userLocationParam String
     * @param userRatingParam Integer
     * @param statusParam String
     */
    public UserComment(@Nullable final Date dateParam, @Nullable final String summaryParam, @Nullable final Integer userScoreCountParam, @Nullable final Integer userScoreParam, @Nullable final String userNameParam, @Nullable final String textParam, @Nullable final String userLocationParam, @Nullable final Integer userRatingParam, @Nullable final String statusParam) {
        this.date = dateParam;
        this.summary = summaryParam;
        this.userScoreCount = userScoreCountParam;
        this.userScore = userScoreParam;
        this.userName = userNameParam;
        this.text = textParam;
        this.userLocation = userLocationParam;
        this.userRating = userRatingParam;
        this.status = statusParam;
    }
    
    /**
     * Get value of date.
     *
     * @return Date value of date
     */
    @Nullable
    public final Date getDate() {
        return this.date;
    }
    
    /**
     * Get value of summary.
     *
     * @return String value of summary
     */
    @Nullable
    public final String getSummary() {
        return this.summary;
    }
    
    /**
     * Get value of userScoreCount.
     *
     * @return Integer value of userScoreCount
     */
    @Nullable
    public final Integer getUserScoreCount() {
        return this.userScoreCount;
    }
    
    /**
     * Get value of userScore.
     *
     * @return Integer value of userScore
     */
    @Nullable
    public final Integer getUserScore() {
        return this.userScore;
    }
    
    /**
     * Get value of userName.
     *
     * @return String value of userName
     */
    @Nullable
    public final String getUserName() {
        return this.userName;
    }
    
    /**
     * Get value of text.
     *
     * @return String value of text
     */
    @Nullable
    public final String getText() {
        return this.text;
    }
    
    /**
     * Get value of userLocation.
     *
     * @return String value of userLocation
     */
    @Nullable
    public final String getUserLocation() {
        return this.userLocation;
    }
    
    /**
     * Get value of userRating.
     *
     * @return Integer value of userRating
     */
    @Nullable
    public final Integer getUserRating() {
        return this.userRating;
    }
    
    /**
     * Get value of status.
     *
     * @return String value of status
     */
    @Nullable
    public final String getStatus() {
        return this.status;
    }

    
    /**
     * Set value of date.
     *
     * @param dateParam
     */
    public final void setDate(@Nullable final Date dateParam) {
        this.date = dateParam;
    }
    
    /**
     * Set value of summary.
     *
     * @param summaryParam
     */
    public final void setSummary(@Nullable final String summaryParam) {
        this.summary = summaryParam;
    }
    
    /**
     * Set value of userScoreCount.
     *
     * @param userScoreCountParam
     */
    public final void setUserScoreCount(@Nullable final Integer userScoreCountParam) {
        this.userScoreCount = userScoreCountParam;
    }
    
    /**
     * Set value of userScore.
     *
     * @param userScoreParam
     */
    public final void setUserScore(@Nullable final Integer userScoreParam) {
        this.userScore = userScoreParam;
    }
    
    /**
     * Set value of userName.
     *
     * @param userNameParam
     */
    public final void setUserName(@Nullable final String userNameParam) {
        this.userName = userNameParam;
    }
    
    /**
     * Set value of text.
     *
     * @param textParam
     */
    public final void setText(@Nullable final String textParam) {
        this.text = textParam;
    }
    
    /**
     * Set value of userLocation.
     *
     * @param userLocationParam
     */
    public final void setUserLocation(@Nullable final String userLocationParam) {
        this.userLocation = userLocationParam;
    }
    
    /**
     * Set value of userRating.
     *
     * @param userRatingParam
     */
    public final void setUserRating(@Nullable final Integer userRatingParam) {
        this.userRating = userRatingParam;
    }
    
    /**
     * Set value of status.
     *
     * @param statusParam
     */
    public final void setStatus(@Nullable final String statusParam) {
        this.status = statusParam;
    }
}
