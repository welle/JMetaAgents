package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Statistics {

	@Nullable
    private Integer firstAiringViewerCount;

	/**
     * Empty Constructor.
     */
    public Statistics() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param firstAiringViewerCountParam Integer
     */
    public Statistics(@Nullable final Integer firstAiringViewerCountParam) {
        this.firstAiringViewerCount = firstAiringViewerCountParam;
    }
    
    /**
     * Get value of firstAiringViewerCount.
     *
     * @return Integer value of firstAiringViewerCount
     */
    @Nullable
    public final Integer getFirstAiringViewerCount() {
        return this.firstAiringViewerCount;
    }

    
    /**
     * Set value of firstAiringViewerCount.
     *
     * @param firstAiringViewerCountParam
     */
    public final void setFirstAiringViewerCount(@Nullable final Integer firstAiringViewerCountParam) {
        this.firstAiringViewerCount = firstAiringViewerCountParam;
    }
}
