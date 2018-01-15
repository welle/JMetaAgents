package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class CastSummary {

	@Nullable
    private String as;
    @JsonProperty("char")
	@Nullable
    private String charRes;
    @JsonProperty("name")
	@Nullable
    private Name2 name2;

	/**
     * Empty Constructor.
     */
    public CastSummary() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param asParam String
     * @param charResParam String
     * @param name2Param Name2
     */
    public CastSummary(@Nullable final String asParam, @Nullable final String charResParam, @Nullable final Name2 name2Param) {
        this.as = asParam;
        this.charRes = charResParam;
        this.name2 = name2Param;
    }
    
    /**
     * Get value of as.
     *
     * @return String value of as
     */
    @Nullable
    public final String getAs() {
        return this.as;
    }
    
    /**
     * Get value of charRes.
     *
     * @return String value of charRes
     */
    @Nullable
    public final String getCharRes() {
        return this.charRes;
    }
    
    /**
     * Get value of name2.
     *
     * @return Name2 value of name2
     */
    @Nullable
    public final Name2 getName2() {
        return this.name2;
    }

    
    /**
     * Set value of as.
     *
     * @param asParam
     */
    public final void setAs(@Nullable final String asParam) {
        this.as = asParam;
    }
    
    /**
     * Set value of charRes.
     *
     * @param charResParam
     */
    public final void setCharRes(@Nullable final String charResParam) {
        this.charRes = charResParam;
    }
    
    /**
     * Set value of name2.
     *
     * @param name2Param
     */
    public final void setName2(@Nullable final Name2 name2Param) {
        this.name2 = name2Param;
    }
}
