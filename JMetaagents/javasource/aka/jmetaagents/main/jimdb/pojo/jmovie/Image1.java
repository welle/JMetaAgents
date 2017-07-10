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
public final class Image1 {

	@Nullable
    private Integer width;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI url;
	@Nullable
    private Integer height;

	/**
     * Empty Constructor.
     */
    public Image1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param widthParam Integer
     * @param urlParam URI
     * @param heightParam Integer
     */
    public Image1(@Nullable final Integer widthParam, @Nullable final URI urlParam, @Nullable final Integer heightParam) {
        this.width = widthParam;
        this.url = urlParam;
        this.height = heightParam;
    }
    
    /**
     * Get value of width.
     *
     * @return Integer value of width
     */
    @Nullable
    public final Integer getWidth() {
        return this.width;
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
     * Get value of height.
     *
     * @return Integer value of height
     */
    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    
    /**
     * Set value of width.
     *
     * @param widthParam
     */
    public final void setWidth(@Nullable final Integer widthParam) {
        this.width = widthParam;
    }
    
    /**
     * Set value of url.
     *
     * @param urlParam
     */
    public final void setUrl(@Nullable final URI urlParam) {
        this.url = urlParam;
    }
    
    /**
     * Set value of height.
     *
     * @param heightParam
     */
    public final void setHeight(@Nullable final Integer heightParam) {
        this.height = heightParam;
    }
}
