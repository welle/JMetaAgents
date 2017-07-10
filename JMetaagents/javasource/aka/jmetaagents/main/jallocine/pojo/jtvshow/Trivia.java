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
public final class Trivia {

	@Nullable
    private Integer code;
	@Nullable
    private String title;
	@Nullable
    private String body;
    @JsonProperty("publication")
	@Nullable
    private Publication1 publication1;

	/**
     * Empty Constructor.
     */
    public Trivia() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param titleParam String
     * @param bodyParam String
     * @param publication1Param Publication1
     */
    public Trivia(@Nullable final Integer codeParam, @Nullable final String titleParam, @Nullable final String bodyParam, @Nullable final Publication1 publication1Param) {
        this.code = codeParam;
        this.title = titleParam;
        this.body = bodyParam;
        this.publication1 = publication1Param;
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
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
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
     * Get value of publication1.
     *
     * @return Publication1 value of publication1
     */
    @Nullable
    public final Publication1 getPublication1() {
        return this.publication1;
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
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
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
     * Set value of publication1.
     *
     * @param publication1Param
     */
    public final void setPublication1(@Nullable final Publication1 publication1Param) {
        this.publication1 = publication1Param;
    }
}
