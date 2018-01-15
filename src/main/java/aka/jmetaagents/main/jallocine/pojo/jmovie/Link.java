package aka.jmetaagents.main.jallocine.pojo.jmovie;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jmovie.deserializers.URLDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Link {

	@Nullable
    private String rel;
	@Nullable
    private String name;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI href;

	/**
     * Empty Constructor.
     */
    public Link() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param relParam String
     * @param nameParam String
     * @param hrefParam URI
     */
    public Link(@Nullable final String relParam, @Nullable final String nameParam, @Nullable final URI hrefParam) {
        this.rel = relParam;
        this.name = nameParam;
        this.href = hrefParam;
    }
    
    /**
     * Get value of rel.
     *
     * @return String value of rel
     */
    @Nullable
    public final String getRel() {
        return this.rel;
    }
    
    /**
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
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
     * Set value of rel.
     *
     * @param relParam
     */
    public final void setRel(@Nullable final String relParam) {
        this.rel = relParam;
    }
    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
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
