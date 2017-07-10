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
public final class Posters {

    @JsonDeserialize(using = URLDeserializer.class)
    private URI thumbnail;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI original;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI detailed;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI profile;

	/**
     * Empty Constructor.
     */
    public Posters() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param thumbnailParam URI
     * @param originalParam URI
     * @param detailedParam URI
     * @param profileParam URI
     */
    public Posters(@Nullable final URI thumbnailParam, @Nullable final URI originalParam, @Nullable final URI detailedParam, @Nullable final URI profileParam) {
        this.thumbnail = thumbnailParam;
        this.original = originalParam;
        this.detailed = detailedParam;
        this.profile = profileParam;
    }
    
    /**
     * Get value of thumbnail.
     *
     * @return URI value of thumbnail
     */
    @Nullable
    public final URI getThumbnail() {
        return this.thumbnail;
    }
    
    /**
     * Get value of original.
     *
     * @return URI value of original
     */
    @Nullable
    public final URI getOriginal() {
        return this.original;
    }
    
    /**
     * Get value of detailed.
     *
     * @return URI value of detailed
     */
    @Nullable
    public final URI getDetailed() {
        return this.detailed;
    }
    
    /**
     * Get value of profile.
     *
     * @return URI value of profile
     */
    @Nullable
    public final URI getProfile() {
        return this.profile;
    }

    
    /**
     * Set value of thumbnail.
     *
     * @param thumbnailParam
     */
    public final void setThumbnail(@Nullable final URI thumbnailParam) {
        this.thumbnail = thumbnailParam;
    }
    
    /**
     * Set value of original.
     *
     * @param originalParam
     */
    public final void setOriginal(@Nullable final URI originalParam) {
        this.original = originalParam;
    }
    
    /**
     * Set value of detailed.
     *
     * @param detailedParam
     */
    public final void setDetailed(@Nullable final URI detailedParam) {
        this.detailed = detailedParam;
    }
    
    /**
     * Set value of profile.
     *
     * @param profileParam
     */
    public final void setProfile(@Nullable final URI profileParam) {
        this.profile = profileParam;
    }
}
