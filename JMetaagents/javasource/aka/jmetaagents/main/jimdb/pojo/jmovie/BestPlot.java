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
public final class BestPlot {

	@Nullable
    private String outline;
    @JsonProperty("total_summaries")
	@Nullable
    private Integer totalSummaries;

	/**
     * Empty Constructor.
     */
    public BestPlot() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param outlineParam String
     * @param totalSummariesParam Integer
     */
    public BestPlot(@Nullable final String outlineParam, @Nullable final Integer totalSummariesParam) {
        this.outline = outlineParam;
        this.totalSummaries = totalSummariesParam;
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
     * Get value of totalSummaries.
     *
     * @return Integer value of totalSummaries
     */
    @Nullable
    public final Integer getTotalSummaries() {
        return this.totalSummaries;
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
     * Set value of totalSummaries.
     *
     * @param totalSummariesParam
     */
    public final void setTotalSummaries(@Nullable final Integer totalSummariesParam) {
        this.totalSummaries = totalSummariesParam;
    }
}
