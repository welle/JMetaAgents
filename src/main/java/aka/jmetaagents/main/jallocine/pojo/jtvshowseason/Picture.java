package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jallocine.pojo.jtvshowseason.deserializers.URLDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Picture {

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
     * @param hrefParam URI
     */
    public Picture(@Nullable final URI hrefParam) {
        this.href = hrefParam;
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
     * Set value of href.
     *
     * @param hrefParam
     */
    public final void setHref(@Nullable final URI hrefParam) {
        this.href = hrefParam;
    }
}
