package aka.jmetaagents.main.jallocine.pojo.jperson;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Movie2 {

	@Nullable
    private Integer code;
    @JsonProperty("poster")
	@Nullable
    private Poster2 poster2;
	@Nullable
    private String title;

	/**
     * Empty Constructor.
     */
    public Movie2() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param poster2Param Poster2
     * @param titleParam String
     */
    public Movie2(@Nullable final Integer codeParam, @Nullable final Poster2 poster2Param, @Nullable final String titleParam) {
        this.code = codeParam;
        this.poster2 = poster2Param;
        this.title = titleParam;
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
     * Get value of poster2.
     *
     * @return Poster2 value of poster2
     */
    @Nullable
    public final Poster2 getPoster2() {
        return this.poster2;
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
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
    }
    
    /**
     * Set value of poster2.
     *
     * @param poster2Param
     */
    public final void setPoster2(@Nullable final Poster2 poster2Param) {
        this.poster2 = poster2Param;
    }
    
    /**
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
}
