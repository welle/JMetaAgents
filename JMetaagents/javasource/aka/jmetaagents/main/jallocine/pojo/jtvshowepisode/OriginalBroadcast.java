package aka.jmetaagents.main.jallocine.pojo.jtvshowepisode;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class OriginalBroadcast {

	@Nullable
    private Broadcast broadcast;

	/**
     * Empty Constructor.
     */
    public OriginalBroadcast() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param broadcastParam Broadcast
     */
    public OriginalBroadcast(@Nullable final Broadcast broadcastParam) {
        this.broadcast = broadcastParam;
    }
    
    /**
     * Get value of broadcast.
     *
     * @return Broadcast value of broadcast
     */
    @Nullable
    public final Broadcast getBroadcast() {
        return this.broadcast;
    }

    
    /**
     * Set value of broadcast.
     *
     * @param broadcastParam
     */
    public final void setBroadcast(@Nullable final Broadcast broadcastParam) {
        this.broadcast = broadcastParam;
    }
}
