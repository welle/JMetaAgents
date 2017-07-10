package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Plot {

	@Nullable
    private String outline;
	@Nullable
    private Integer more;

	/**
     * Empty Constructor.
     */
    public Plot() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param outlineParam String
     * @param moreParam Integer
     */
    public Plot(@Nullable final String outlineParam, @Nullable final Integer moreParam) {
        this.outline = outlineParam;
        this.more = moreParam;
    }
    
    /**
     * Get value of outline.
     *
     * @return String value of outline
     */
    @Nullable
    public final String getOutline() {
        return this.outline;
    }
    
    /**
     * Get value of more.
     *
     * @return Integer value of more
     */
    @Nullable
    public final Integer getMore() {
        return this.more;
    }

    
    /**
     * Set value of outline.
     *
     * @param outlineParam
     */
    public final void setOutline(@Nullable final String outlineParam) {
        this.outline = outlineParam;
    }
    
    /**
     * Set value of more.
     *
     * @param moreParam
     */
    public final void setMore(@Nullable final Integer moreParam) {
        this.more = moreParam;
    }
}
