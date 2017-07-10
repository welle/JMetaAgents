package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class WorstPressReview {

	@Nullable
    private NewsSource newsSource;
	@Nullable
    private Integer code;
	@Nullable
    private Double rating;
	@Nullable
    private String creationDate;
	@Nullable
    private String body;

	/**
     * Empty Constructor.
     */
    public WorstPressReview() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param newsSourceParam NewsSource
     * @param codeParam Integer
     * @param ratingParam Double
     * @param creationDateParam String
     * @param bodyParam String
     */
    public WorstPressReview(@Nullable final NewsSource newsSourceParam, @Nullable final Integer codeParam, @Nullable final Double ratingParam, @Nullable final String creationDateParam, @Nullable final String bodyParam) {
        this.newsSource = newsSourceParam;
        this.code = codeParam;
        this.rating = ratingParam;
        this.creationDate = creationDateParam;
        this.body = bodyParam;
    }
    
    /**
     * Get value of newsSource.
     *
     * @return NewsSource value of newsSource
     */
    @Nullable
    public final NewsSource getNewsSource() {
        return this.newsSource;
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
     * Set value of newsSource.
     *
     * @param newsSourceParam
     */
    public final void setNewsSource(@Nullable final NewsSource newsSourceParam) {
        this.newsSource = newsSourceParam;
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
