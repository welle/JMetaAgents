package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class OriginalChannel {

	@Nullable
    private Channel channel;

	/**
     * Empty Constructor.
     */
    public OriginalChannel() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param channelParam Channel
     */
    public OriginalChannel(@Nullable final Channel channelParam) {
        this.channel = channelParam;
    }
    
    /**
     * Get value of channel.
     *
     * @return Channel value of channel
     */
    @Nullable
    public final Channel getChannel() {
        return this.channel;
    }

    
    /**
     * Set value of channel.
     *
     * @param channelParam
     */
    public final void setChannel(@Nullable final Channel channelParam) {
        this.channel = channelParam;
    }
}
