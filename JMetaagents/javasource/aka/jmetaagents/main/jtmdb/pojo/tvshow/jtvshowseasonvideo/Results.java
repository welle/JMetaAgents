package aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseasonvideo;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Results {

	@Nullable
    private String site;
	@Nullable
    private Integer size;
    @JsonProperty("iso_3166_1")
	@Nullable
    private String iso31661;
	@Nullable
    private String name;
	@Nullable
    private String id;
	@Nullable
    private String type;
    @JsonProperty("iso_639_1")
	@Nullable
    private String iso6391;
	@Nullable
    private String key;

	/**
     * Empty Constructor.
     */
    public Results() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param siteParam String
     * @param sizeParam Integer
     * @param iso31661Param String
     * @param nameParam String
     * @param idParam String
     * @param typeParam String
     * @param iso6391Param String
     * @param keyParam String
     */
    public Results(@Nullable final String siteParam, @Nullable final Integer sizeParam, @Nullable final String iso31661Param, @Nullable final String nameParam, @Nullable final String idParam, @Nullable final String typeParam, @Nullable final String iso6391Param, @Nullable final String keyParam) {
        this.site = siteParam;
        this.size = sizeParam;
        this.iso31661 = iso31661Param;
        this.name = nameParam;
        this.id = idParam;
        this.type = typeParam;
        this.iso6391 = iso6391Param;
        this.key = keyParam;
    }
    
    /**
     * Get value of site.
     *
     * @return String value of site
     */
    @Nullable
    public final String getSite() {
        return this.site;
    }
    
    /**
     * Get value of size.
     *
     * @return Integer value of size
     */
    @Nullable
    public final Integer getSize() {
        return this.size;
    }
    
    /**
     * Get value of iso31661.
     *
     * @return String value of iso31661
     */
    @Nullable
    public final String getIso31661() {
        return this.iso31661;
    }
    
    /**
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    /**
     * Get value of id.
     *
     * @return String value of id
     */
    @Nullable
    public final String getId() {
        return this.id;
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
     * Get value of iso6391.
     *
     * @return String value of iso6391
     */
    @Nullable
    public final String getIso6391() {
        return this.iso6391;
    }
    
    /**
     * Get value of key.
     *
     * @return String value of key
     */
    @Nullable
    public final String getKey() {
        return this.key;
    }

    
    /**
     * Set value of site.
     *
     * @param siteParam
     */
    public final void setSite(@Nullable final String siteParam) {
        this.site = siteParam;
    }
    
    /**
     * Set value of size.
     *
     * @param sizeParam
     */
    public final void setSize(@Nullable final Integer sizeParam) {
        this.size = sizeParam;
    }
    
    /**
     * Set value of iso31661.
     *
     * @param iso31661Param
     */
    public final void setIso31661(@Nullable final String iso31661Param) {
        this.iso31661 = iso31661Param;
    }
    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final String idParam) {
        this.id = idParam;
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
     * Set value of iso6391.
     *
     * @param iso6391Param
     */
    public final void setIso6391(@Nullable final String iso6391Param) {
        this.iso6391 = iso6391Param;
    }
    
    /**
     * Set value of key.
     *
     * @param keyParam
     */
    public final void setKey(@Nullable final String keyParam) {
        this.key = keyParam;
    }
}
