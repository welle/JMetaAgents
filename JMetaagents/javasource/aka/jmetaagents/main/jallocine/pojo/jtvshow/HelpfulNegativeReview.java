package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class HelpfulNegativeReview {

	@Nullable
    private Integer code;
	@Nullable
    private Double rating;
	@Nullable
    private Writer writer;
	@Nullable
    private String creationDate;
	@Nullable
    private String body;
	@Nullable
    private Integer opinion;

	/**
     * Empty Constructor.
     */
    public HelpfulNegativeReview() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param ratingParam Double
     * @param writerParam Writer
     * @param creationDateParam String
     * @param bodyParam String
     * @param opinionParam Integer
     */
    public HelpfulNegativeReview(@Nullable final Integer codeParam, @Nullable final Double ratingParam, @Nullable final Writer writerParam, @Nullable final String creationDateParam, @Nullable final String bodyParam, @Nullable final Integer opinionParam) {
        this.code = codeParam;
        this.rating = ratingParam;
        this.writer = writerParam;
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
     * Get value of rating.
     *
     * @return Double value of rating
     */
    @Nullable
    public final Double getRating() {
        return this.rating;
    }
    
    /**
     * Get value of writer.
     *
     * @return Writer value of writer
     */
    @Nullable
    public final Writer getWriter() {
        return this.writer;
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
     * Set value of rating.
     *
     * @param ratingParam
     */
    public final void setRating(@Nullable final Double ratingParam) {
        this.rating = ratingParam;
    }
    
    /**
     * Set value of writer.
     *
     * @param writerParam
     */
    public final void setWriter(@Nullable final Writer writerParam) {
        this.writer = writerParam;
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
