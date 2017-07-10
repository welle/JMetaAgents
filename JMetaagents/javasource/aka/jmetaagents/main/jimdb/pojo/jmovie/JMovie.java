package aka.jmetaagents.main.jimdb.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMovie {

	@Nullable
    private String copyright;
	@Nullable
    private Data data;
	@Nullable
    private Integer exp;
    @JsonProperty("@meta")
	@Nullable
    private Meta meta;

	/**
     * Empty Constructor.
     */
    public JMovie() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param copyrightParam String
     * @param dataParam Data
     * @param expParam Integer
     * @param metaParam Meta
     */
    public JMovie(@Nullable final String copyrightParam, @Nullable final Data dataParam, @Nullable final Integer expParam, @Nullable final Meta metaParam) {
        this.copyright = copyrightParam;
        this.data = dataParam;
        this.exp = expParam;
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
     * Get value of exp.
     *
     * @return Integer value of exp
     */
    @Nullable
    public final Integer getExp() {
        return this.exp;
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
     * Set value of exp.
     *
     * @param expParam
     */
    public final void setExp(@Nullable final Integer expParam) {
        this.exp = expParam;
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
