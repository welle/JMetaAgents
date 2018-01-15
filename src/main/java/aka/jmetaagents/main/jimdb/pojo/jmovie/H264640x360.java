package aka.jmetaagents.main.jimdb.pojo.jmovie;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jimdb.pojo.jmovie.deserializers.URLDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class H264640x360 {

	@Nullable
    private String format;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI url;

	/**
     * Empty Constructor.
     */
    public H264640x360() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param formatParam String
     * @param urlParam URI
     */
    public H264640x360(@Nullable final String formatParam, @Nullable final URI urlParam) {
        this.format = formatParam;
        this.url = urlParam;
    }
    
    /**
     * Get value of format.
     *
     * @return String value of format
     */
    @Nullable
    public final String getFormat() {
        return this.format;
    }
    
    /**
     * Get value of url.
     *
     * @return URI value of url
     */
    @Nullable
    public final URI getUrl() {
        return this.url;
    }

    
    /**
     * Set value of format.
     *
     * @param formatParam
     */
    public final void setFormat(@Nullable final String formatParam) {
        this.format = formatParam;
    }
    
    /**
     * Set value of url.
     *
     * @param urlParam
     */
    public final void setUrl(@Nullable final URI urlParam) {
        this.url = urlParam;
    }
}
