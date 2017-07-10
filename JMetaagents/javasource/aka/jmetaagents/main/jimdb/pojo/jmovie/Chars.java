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
public final class Chars {

    @JsonProperty("char")
	@Nullable
    private String charRes;
	@Nullable
    private String nconst;

	/**
     * Empty Constructor.
     */
    public Chars() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param charResParam String
     * @param nconstParam String
     */
    public Chars(@Nullable final String charResParam, @Nullable final String nconstParam) {
        this.charRes = charResParam;
        this.nconst = nconstParam;
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
     * Get value of nconst.
     *
     * @return String value of nconst
     */
    @Nullable
    public final String getNconst() {
        return this.nconst;
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
     * Set value of nconst.
     *
     * @param nconstParam
     */
    public final void setNconst(@Nullable final String nconstParam) {
        this.nconst = nconstParam;
    }
}
