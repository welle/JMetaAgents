package aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesearch;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmoviesearch.deserializers.URLDeserializer;

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
    private URI next;
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
     * @param nextParam URI
     * @param selfParam URI
     */
    public Links1(@Nullable final URI nextParam, @Nullable final URI selfParam) {
        this.next = nextParam;
        this.self = selfParam;
    }
    
    /**
     * Get value of next.
     *
     * @return URI value of next
     */
    @Nullable
    public final URI getNext() {
        return this.next;
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
     * Set value of next.
     *
     * @param nextParam
     */
    public final void setNext(@Nullable final URI nextParam) {
        this.next = nextParam;
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
