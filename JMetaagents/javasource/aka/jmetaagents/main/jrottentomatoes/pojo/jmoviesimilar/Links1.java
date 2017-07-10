package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesimilar;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesimilar.deserializers.URLDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Links1 {

    @JsonDeserialize(using = URLDeserializer.class)
    private URI rel;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI self;

	/**
     * Empty Constructor.
     */
    public Links1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param relParam URI
     * @param selfParam URI
     */
    public Links1(@Nullable final URI relParam, @Nullable final URI selfParam) {
        this.rel = relParam;
        this.self = selfParam;
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
     * Get value of self.
     *
     * @return URI value of self
     */
    @Nullable
    public final URI getSelf() {
        return this.self;
    }

    
    /**
     * Set value of rel.
     *
     * @param relParam
     */
    public final void setRel(@Nullable final URI relParam) {
        this.rel = relParam;
    }
    
    /**
     * Set value of self.
     *
     * @param selfParam
     */
    public final void setSelf(@Nullable final URI selfParam) {
        this.self = selfParam;
    }
}
