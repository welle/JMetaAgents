package aka.jmetaagents.main.jallocine.pojo.jmovie;

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
    private Integer viewCount;
	@Nullable
    private Integer commentCount;

	/**
     * Empty Constructor.
     */
    public Statistics() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param viewCountParam Integer
     * @param commentCountParam Integer
     */
    public Statistics(@Nullable final Integer viewCountParam, @Nullable final Integer commentCountParam) {
        this.viewCount = viewCountParam;
        this.commentCount = commentCountParam;
    }
    
    /**
     * Get value of viewCount.
     *
     * @return Integer value of viewCount
     */
    @Nullable
    public final Integer getViewCount() {
        return this.viewCount;
    }
    
    /**
     * Get value of commentCount.
     *
     * @return Integer value of commentCount
     */
    @Nullable
    public final Integer getCommentCount() {
        return this.commentCount;
    }

    
    /**
     * Set value of viewCount.
     *
     * @param viewCountParam
     */
    public final void setViewCount(@Nullable final Integer viewCountParam) {
        this.viewCount = viewCountParam;
    }
    
    /**
     * Set value of commentCount.
     *
     * @param commentCountParam
     */
    public final void setCommentCount(@Nullable final Integer commentCountParam) {
        this.commentCount = commentCountParam;
    }
}
