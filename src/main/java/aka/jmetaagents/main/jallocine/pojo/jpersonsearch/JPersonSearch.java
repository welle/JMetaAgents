package aka.jmetaagents.main.jallocine.pojo.jpersonsearch;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JPersonSearch {

	@Nullable
    private Feed feed;

	/**
     * Empty Constructor.
     */
    public JPersonSearch() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param feedParam Feed
     */
    public JPersonSearch(@Nullable final Feed feedParam) {
        this.feed = feedParam;
    }
    
    /**
     * Get value of feed.
     *
     * @return Feed value of feed
     */
    @Nullable
    public final Feed getFeed() {
        return this.feed;
    }

    
    /**
     * Set value of feed.
     *
     * @param feedParam
     */
    public final void setFeed(@Nullable final Feed feedParam) {
        this.feed = feedParam;
    }
}
