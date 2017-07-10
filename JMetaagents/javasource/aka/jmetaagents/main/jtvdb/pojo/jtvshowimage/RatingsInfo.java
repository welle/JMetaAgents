package aka.jmetaagents.main.jtvdb.pojo.jtvshowimage;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class RatingsInfo {

	@Nullable
    private Integer average;
	@Nullable
    private Integer count;

	/**
     * Empty Constructor.
     */
    public RatingsInfo() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param averageParam Integer
     * @param countParam Integer
     */
    public RatingsInfo(@Nullable final Integer averageParam, @Nullable final Integer countParam) {
        this.average = averageParam;
        this.count = countParam;
    }
    
    /**
     * Get value of average.
     *
     * @return Integer value of average
     */
    @Nullable
    public final Integer getAverage() {
        return this.average;
    }
    
    /**
     * Get value of count.
     *
     * @return Integer value of count
     */
    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    
    /**
     * Set value of average.
     *
     * @param averageParam
     */
    public final void setAverage(@Nullable final Integer averageParam) {
        this.average = averageParam;
    }
    
    /**
     * Set value of count.
     *
     * @param countParam
     */
    public final void setCount(@Nullable final Integer countParam) {
        this.count = countParam;
    }
}
