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
public final class Ns0000222 {

    @JsonDeserialize(using = URLDeserializer.class)
    private URI logo;
	@Nullable
    private String label;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI url;

	/**
     * Empty Constructor.
     */
    public Ns0000222() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param logoParam URI
     * @param labelParam String
     * @param urlParam URI
     */
    public Ns0000222(@Nullable final URI logoParam, @Nullable final String labelParam, @Nullable final URI urlParam) {
        this.logo = logoParam;
        this.label = labelParam;
        this.url = urlParam;
    }
    
    /**
     * Get value of logo.
     *
     * @return URI value of logo
     */
    @Nullable
    public final URI getLogo() {
        return this.logo;
    }
    
    /**
     * Get value of label.
     *
     * @return String value of label
     */
    @Nullable
    public final String getLabel() {
        return this.label;
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
     * Set value of logo.
     *
     * @param logoParam
     */
    public final void setLogo(@Nullable final URI logoParam) {
        this.logo = logoParam;
    }
    
    /**
     * Set value of label.
     *
     * @param labelParam
     */
    public final void setLabel(@Nullable final String labelParam) {
        this.label = labelParam;
    }
    
    /**
     * Set value of url.
     *
     * @param urlParam
     */
    public final void setUrl(@Nullable final URI urlParam) {
        this.url = urlParam;
    }
}
