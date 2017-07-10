package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Media {

	@Nullable
    private Thumbnail thumbnail;
	@Nullable
    private Integer code;
	@Nullable
    private Type type;
	@Nullable
    private String title;
    @JsonProperty("class")
	@Nullable
    private String clazz;
	@Nullable
    private Version version;

	/**
     * Empty Constructor.
     */
    public Media() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param thumbnailParam Thumbnail
     * @param codeParam Integer
     * @param typeParam Type
     * @param titleParam String
     * @param clazzParam String
     * @param versionParam Version
     */
    public Media(@Nullable final Thumbnail thumbnailParam, @Nullable final Integer codeParam, @Nullable final Type typeParam, @Nullable final String titleParam, @Nullable final String clazzParam, @Nullable final Version versionParam) {
        this.thumbnail = thumbnailParam;
        this.code = codeParam;
        this.type = typeParam;
        this.title = titleParam;
        this.clazz = clazzParam;
        this.version = versionParam;
    }
    
    /**
     * Get value of thumbnail.
     *
     * @return Thumbnail value of thumbnail
     */
    @Nullable
    public final Thumbnail getThumbnail() {
        return this.thumbnail;
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
     * Get value of type.
     *
     * @return Type value of type
     */
    @Nullable
    public final Type getType() {
        return this.type;
    }
    
    /**
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
    }
    
    /**
     * Get value of clazz.
     *
     * @return String value of clazz
     */
    @Nullable
    public final String getClazz() {
        return this.clazz;
    }
    
    /**
     * Get value of version.
     *
     * @return Version value of version
     */
    @Nullable
    public final Version getVersion() {
        return this.version;
    }

    
    /**
     * Set value of thumbnail.
     *
     * @param thumbnailParam
     */
    public final void setThumbnail(@Nullable final Thumbnail thumbnailParam) {
        this.thumbnail = thumbnailParam;
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
     * Set value of type.
     *
     * @param typeParam
     */
    public final void setType(@Nullable final Type typeParam) {
        this.type = typeParam;
    }
    
    /**
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
    
    /**
     * Set value of clazz.
     *
     * @param clazzParam
     */
    public final void setClazz(@Nullable final String clazzParam) {
        this.clazz = clazzParam;
    }
    
    /**
     * Set value of version.
     *
     * @param versionParam
     */
    public final void setVersion(@Nullable final Version versionParam) {
        this.version = versionParam;
    }
}
