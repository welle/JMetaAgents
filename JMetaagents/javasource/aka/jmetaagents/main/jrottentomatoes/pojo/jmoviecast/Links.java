package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviecast;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviecast.deserializers.URLDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Links {

    @JsonDeserialize(using = URLDeserializer.class)
    private URI rel;

	/**
     * Empty Constructor.
     */
    public Links() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param relParam URI
     */
    public Links(@Nullable final URI relParam) {
        this.rel = relParam;
    }
    
    /**
     * Get value of rel.
     *
     * @return URI value of rel
     */
    @Nullable
    public final URI getRel() {
        return this.rel;
    }

    
    /**
     * Set value of rel.
     *
     * @param relParam
     */
    public final void setRel(@Nullable final URI relParam) {
        this.rel = relParam;
    }
}
