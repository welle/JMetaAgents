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
public final class Encodings {

    @JsonProperty("H.264 480x270")
	@Nullable
    private H264480x270 h264480x270;
    @JsonProperty("H.264 640x360")
	@Nullable
    private H264640x360 h264640x360;

	/**
     * Empty Constructor.
     */
    public Encodings() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param h264480x270Param H264480x270
     * @param h264640x360Param H264640x360
     */
    public Encodings(@Nullable final H264480x270 h264480x270Param, @Nullable final H264640x360 h264640x360Param) {
        this.h264480x270 = h264480x270Param;
        this.h264640x360 = h264640x360Param;
    }
    
    /**
     * Get value of h264480x270.
     *
     * @return H264480x270 value of h264480x270
     */
    @Nullable
    public final H264480x270 getH264480x270() {
        return this.h264480x270;
    }
    
    /**
     * Get value of h264640x360.
     *
     * @return H264640x360 value of h264640x360
     */
    @Nullable
    public final H264640x360 getH264640x360() {
        return this.h264640x360;
    }

    
    /**
     * Set value of h264480x270.
     *
     * @param h264480x270Param
     */
    public final void setH264480x270(@Nullable final H264480x270 h264480x270Param) {
        this.h264480x270 = h264480x270Param;
    }
    
    /**
     * Set value of h264640x360.
     *
     * @param h264640x360Param
     */
    public final void setH264640x360(@Nullable final H264640x360 h264640x360Param) {
        this.h264640x360 = h264640x360Param;
    }
}
