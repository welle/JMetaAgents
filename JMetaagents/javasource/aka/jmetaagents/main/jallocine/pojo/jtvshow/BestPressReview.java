package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class BestPressReview {

	@Nullable
    private Integer code;
	@Nullable
    private Double rating;
    @JsonProperty("newsSource")
	@Nullable
    private NewsSource1 newsSource1;
	@Nullable
    private String creationDate;
	@Nullable
    private String body;

	/**
     * Empty Constructor.
     */
    public BestPressReview() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param ratingParam Double
     * @param newsSource1Param NewsSource1
     * @param creationDateParam String
     * @param bodyParam String
     */
    public BestPressReview(@Nullable final Integer codeParam, @Nullable final Double ratingParam, @Nullable final NewsSource1 newsSource1Param, @Nullable final String creationDateParam, @Nullable final String bodyParam) {
        this.code = codeParam;
        this.rating = ratingParam;
        this.newsSource1 = newsSource1Param;
        this.creationDate = creationDateParam;
        this.body = bodyParam;
    }
    
    /**
     * Get value of code.
     *
     * @return Integer value of code
     */
    @Nullable
    public final Integer getCode() {
        return this.code;
    }
    
    /**
     * Get value of rating.
     *
     * @return Double value of rating
     */
    @Nullable
    public final Double getRating() {
        return this.rating;
    }
    
    /**
     * Get value of newsSource1.
     *
     * @return NewsSource1 value of newsSource1
     */
    @Nullable
    public final NewsSource1 getNewsSource1() {
        return this.newsSource1;
    }
    
    /**
     * Get value of creationDate.
     *
     * @return String value of creationDate
     */
    @Nullable
    public final String getCreationDate() {
        return this.creationDate;
    }
    
    /**
     * Get value of body.
     *
     * @return String value of body
     */
    @Nullable
    public final String getBody() {
        return this.body;
    }

    
    /**
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
    }
    
    /**
     * Set value of rating.
     *
     * @param ratingParam
     */
    public final void setRating(@Nullable final Double ratingParam) {
        this.rating = ratingParam;
    }
    
    /**
     * Set value of newsSource1.
     *
     * @param newsSource1Param
     */
    public final void setNewsSource1(@Nullable final NewsSource1 newsSource1Param) {
        this.newsSource1 = newsSource1Param;
    }
    
    /**
     * Set value of creationDate.
     *
     * @param creationDateParam
     */
    public final void setCreationDate(@Nullable final String creationDateParam) {
        this.creationDate = creationDateParam;
    }
    
    /**
     * Set value of body.
     *
     * @param bodyParam
     */
    public final void setBody(@Nullable final String bodyParam) {
        this.body = bodyParam;
    }
}
