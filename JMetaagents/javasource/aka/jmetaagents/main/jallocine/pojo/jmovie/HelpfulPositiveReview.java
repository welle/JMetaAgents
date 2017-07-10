package aka.jmetaagents.main.jallocine.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class HelpfulPositiveReview {

	@Nullable
    private Integer code;
    @JsonProperty("writer")
	@Nullable
    private Writer1 writer1;
	@Nullable
    private Integer rating;
	@Nullable
    private String creationDate;
	@Nullable
    private String body;
	@Nullable
    private Integer opinion;

	/**
     * Empty Constructor.
     */
    public HelpfulPositiveReview() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param writer1Param Writer1
     * @param ratingParam Integer
     * @param creationDateParam String
     * @param bodyParam String
     * @param opinionParam Integer
     */
    public HelpfulPositiveReview(@Nullable final Integer codeParam, @Nullable final Writer1 writer1Param, @Nullable final Integer ratingParam, @Nullable final String creationDateParam, @Nullable final String bodyParam, @Nullable final Integer opinionParam) {
        this.code = codeParam;
        this.writer1 = writer1Param;
        this.rating = ratingParam;
        this.creationDate = creationDateParam;
        this.body = bodyParam;
        this.opinion = opinionParam;
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
     * Get value of writer1.
     *
     * @return Writer1 value of writer1
     */
    @Nullable
    public final Writer1 getWriter1() {
        return this.writer1;
    }
    
    /**
     * Get value of rating.
     *
     * @return Integer value of rating
     */
    @Nullable
    public final Integer getRating() {
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
     * Get value of opinion.
     *
     * @return Integer value of opinion
     */
    @Nullable
    public final Integer getOpinion() {
        return this.opinion;
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
     * Set value of writer1.
     *
     * @param writer1Param
     */
    public final void setWriter1(@Nullable final Writer1 writer1Param) {
        this.writer1 = writer1Param;
    }
    
    /**
     * Set value of rating.
     *
     * @param ratingParam
     */
    public final void setRating(@Nullable final Integer ratingParam) {
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
    
    /**
     * Set value of opinion.
     *
     * @param opinionParam
     */
    public final void setOpinion(@Nullable final Integer opinionParam) {
        this.opinion = opinionParam;
    }
}
