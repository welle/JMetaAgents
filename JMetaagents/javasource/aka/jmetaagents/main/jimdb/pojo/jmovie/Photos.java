package aka.jmetaagents.main.jimdb.pojo.jmovie;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jimdb.pojo.jmovie.deserializers.URLDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Photos {

    @JsonDeserialize(using = URLDeserializer.class)
    private URI link;
    @JsonProperty("image")
	@Nullable
    private Image2 image2;

	/**
     * Empty Constructor.
     */
    public Photos() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param linkParam URI
     * @param image2Param Image2
     */
    public Photos(@Nullable final URI linkParam, @Nullable final Image2 image2Param) {
        this.link = linkParam;
        this.image2 = image2Param;
    }
    
    /**
     * Get value of link.
     *
     * @return URI value of link
     */
    @Nullable
    public final URI getLink() {
        return this.link;
    }
    
    /**
     * Get value of image2.
     *
     * @return Image2 value of image2
     */
    @Nullable
    public final Image2 getImage2() {
        return this.image2;
    }

    
    /**
     * Set value of link.
     *
     * @param linkParam
     */
    public final void setLink(@Nullable final URI linkParam) {
        this.link = linkParam;
    }
    
    /**
     * Set value of image2.
     *
     * @param image2Param
     */
    public final void setImage2(@Nullable final Image2 image2Param) {
        this.image2 = image2Param;
    }
}
