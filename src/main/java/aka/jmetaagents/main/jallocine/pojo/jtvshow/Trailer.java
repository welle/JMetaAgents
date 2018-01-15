package aka.jmetaagents.main.jallocine.pojo.jtvshow;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jallocine.pojo.jtvshow.deserializers.URLDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Trailer {

	@Nullable
    private Integer code;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI href;

	/**
     * Empty Constructor.
     */
    public Trailer() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param hrefParam URI
     */
    public Trailer(@Nullable final Integer codeParam, @Nullable final URI hrefParam) {
        this.code = codeParam;
        this.href = hrefParam;
    }
    
    /**
     * Get value of code.
     *
     * @return Integer value of code
     */
    @Nullable
    public final Integer getCode() {
        return this.code;
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
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
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
