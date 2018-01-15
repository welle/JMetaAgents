package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class DefaultMedia {

	@Nullable
    private Media media;

	/**
     * Empty Constructor.
     */
    public DefaultMedia() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param mediaParam Media
     */
    public DefaultMedia(@Nullable final Media mediaParam) {
        this.media = mediaParam;
    }
    
    /**
     * Get value of media.
     *
     * @return Media value of media
     */
    @Nullable
    public final Media getMedia() {
        return this.media;
    }

    
    /**
     * Set value of media.
     *
     * @param mediaParam
     */
    public final void setMedia(@Nullable final Media mediaParam) {
        this.media = mediaParam;
    }
}
