package aka.jmetaagents.main.jimdb.pojo.jmoviesearch;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMovieSearch {

	@Nullable
    private String copyright;
	@Nullable
    private Data data;
    @JsonProperty("@type")
	@Nullable
    private String type;
    @JsonProperty("@meta")
	@Nullable
    private Meta meta;

	/**
     * Empty Constructor.
     */
    public JMovieSearch() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param copyrightParam String
     * @param dataParam Data
     * @param typeParam String
     * @param metaParam Meta
     */
    public JMovieSearch(@Nullable final String copyrightParam, @Nullable final Data dataParam, @Nullable final String typeParam, @Nullable final Meta metaParam) {
        this.copyright = copyrightParam;
        this.data = dataParam;
        this.type = typeParam;
        this.meta = metaParam;
    }
    
    /**
     * Get value of copyright.
     *
     * @return String value of copyright
     */
    @Nullable
    public final String getCopyright() {
        return this.copyright;
    }
    
    /**
     * Get value of data.
     *
     * @return Data value of data
     */
    @Nullable
    public final Data getData() {
        return this.data;
    }
    
    /**
     * Get value of type.
     *
     * @return String value of type
     */
    @Nullable
    public final String getType() {
        return this.type;
    }
    
    /**
     * Get value of meta.
     *
     * @return Meta value of meta
     */
    @Nullable
    public final Meta getMeta() {
        return this.meta;
    }

    
    /**
     * Set value of copyright.
     *
     * @param copyrightParam
     */
    public final void setCopyright(@Nullable final String copyrightParam) {
        this.copyright = copyrightParam;
    }
    
    /**
     * Set value of data.
     *
     * @param dataParam
     */
    public final void setData(@Nullable final Data dataParam) {
        this.data = dataParam;
    }
    
    /**
     * Set value of type.
     *
     * @param typeParam
     */
    public final void setType(@Nullable final String typeParam) {
        this.type = typeParam;
    }
    
    /**
     * Set value of meta.
     *
     * @param metaParam
     */
    public final void setMeta(@Nullable final Meta metaParam) {
        this.meta = metaParam;
    }
}
