package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Statistics1 {

	@Nullable
    private Integer commentCount;

	/**
     * Empty Constructor.
     */
    public Statistics1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param commentCountParam Integer
     */
    public Statistics1(@Nullable final Integer commentCountParam) {
        this.commentCount = commentCountParam;
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
     * Set value of commentCount.
     *
     * @param commentCountParam
     */
    public final void setCommentCount(@Nullable final Integer commentCountParam) {
        this.commentCount = commentCountParam;
    }
}
