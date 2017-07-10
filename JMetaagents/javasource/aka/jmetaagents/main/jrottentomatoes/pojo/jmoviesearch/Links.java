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
public final class Links {

    @JsonDeserialize(using = URLDeserializer.class)
    private URI cast;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI similar;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI reviews;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI self;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI alternate;

	/**
     * Empty Constructor.
     */
    public Links() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param castParam URI
     * @param similarParam URI
     * @param reviewsParam URI
     * @param selfParam URI
     * @param alternateParam URI
     */
    public Links(@Nullable final URI castParam, @Nullable final URI similarParam, @Nullable final URI reviewsParam, @Nullable final URI selfParam, @Nullable final URI alternateParam) {
        this.cast = castParam;
        this.similar = similarParam;
        this.reviews = reviewsParam;
        this.self = selfParam;
        this.alternate = alternateParam;
    }
    
    /**
     * Get value of cast.
     *
     * @return URI value of cast
     */
    @Nullable
    public final URI getCast() {
        return this.cast;
    }
    
    /**
     * Get value of similar.
     *
     * @return URI value of similar
     */
    @Nullable
    public final URI getSimilar() {
        return this.similar;
    }
    
    /**
     * Get value of reviews.
     *
     * @return URI value of reviews
     */
    @Nullable
    public final URI getReviews() {
        return this.reviews;
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
     * Get value of alternate.
     *
     * @return URI value of alternate
     */
    @Nullable
    public final URI getAlternate() {
        return this.alternate;
    }

    
    /**
     * Set value of cast.
     *
     * @param castParam
     */
    public final void setCast(@Nullable final URI castParam) {
        this.cast = castParam;
    }
    
    /**
     * Set value of similar.
     *
     * @param similarParam
     */
    public final void setSimilar(@Nullable final URI similarParam) {
        this.similar = similarParam;
    }
    
    /**
     * Set value of reviews.
     *
     * @param reviewsParam
     */
    public final void setReviews(@Nullable final URI reviewsParam) {
        this.reviews = reviewsParam;
    }
    
    /**
     * Set value of self.
     *
     * @param selfParam
     */
    public final void setSelf(@Nullable final URI selfParam) {
        this.self = selfParam;
    }
    
    /**
     * Set value of alternate.
     *
     * @param alternateParam
     */
    public final void setAlternate(@Nullable final URI alternateParam) {
        this.alternate = alternateParam;
    }
}
