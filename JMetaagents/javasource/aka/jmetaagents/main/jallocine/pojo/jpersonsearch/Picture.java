package aka.jmetaagents.main.jallocine.pojo.jpersonsearch;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jpersonsearch.deserializers.URLDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Picture {

	@Nullable
    private String path;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI href;

	/**
     * Empty Constructor.
     */
    public Picture() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param pathParam String
     * @param hrefParam URI
     */
    public Picture(@Nullable final String pathParam, @Nullable final URI hrefParam) {
        this.path = pathParam;
        this.href = hrefParam;
    }
    
    /**
     * Get value of path.
     *
     * @return String value of path
     */
    @Nullable
    public final String getPath() {
        return this.path;
    }
    
    /**
     * Get value of href.
     *
     * @return URI value of href
     */
    @Nullable
    public final URI getHref() {
        return this.href;
    }

    
    /**
     * Set value of path.
     *
     * @param pathParam
     */
    public final void setPath(@Nullable final String pathParam) {
        this.path = pathParam;
    }
    
    /**
     * Set value of href.
     *
     * @param hrefParam
     */
    public final void setHref(@Nullable final URI hrefParam) {
        this.href = hrefParam;
    }
}
