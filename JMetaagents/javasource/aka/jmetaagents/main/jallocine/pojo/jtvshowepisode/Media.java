package aka.jmetaagents.main.jallocine.pojo.jtvshowepisode;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
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
    @JsonProperty("link")
	@NonNull
    private List<Link1> link1 = new ArrayList<>();
	@Nullable
    private String copyrightHolder;
	@Nullable
    private Integer rcode;
	@Nullable
    private Type type;
	@Nullable
    private String title;
    @JsonProperty("class")
	@Nullable
    private String clazz;

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
     * @param link1Param List<Link1>
     * @param copyrightHolderParam String
     * @param rcodeParam Integer
     * @param typeParam Type
     * @param titleParam String
     * @param clazzParam String
     */
    public Media(@Nullable final Thumbnail thumbnailParam, @Nullable final Integer codeParam, @NonNull final List<Link1> link1Param, @Nullable final String copyrightHolderParam, @Nullable final Integer rcodeParam, @Nullable final Type typeParam, @Nullable final String titleParam, @Nullable final String clazzParam) {
        this.thumbnail = thumbnailParam;
        this.code = codeParam;
        this.link1 = link1Param;
        this.copyrightHolder = copyrightHolderParam;
        this.rcode = rcodeParam;
        this.type = typeParam;
        this.title = titleParam;
        this.clazz = clazzParam;
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
     * Get value of link1.
     *
     * @return List<Link1> value of link1
     */
    @NonNull
    public final List<Link1> getLink1() {
        return this.link1;
    }
    
    /**
     * Get value of copyrightHolder.
     *
     * @return String value of copyrightHolder
     */
    @Nullable
    public final String getCopyrightHolder() {
        return this.copyrightHolder;
    }
    
    /**
     * Get value of rcode.
     *
     * @return Integer value of rcode
     */
    @Nullable
    public final Integer getRcode() {
        return this.rcode;
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
     * Set value of link1.
     *
     * @param link1Param
     */
    public final void getLink1(@NonNull final List<Link1> link1Param) {
        this.link1 = link1Param;
    }
    
    /**
     * Set value of copyrightHolder.
     *
     * @param copyrightHolderParam
     */
    public final void setCopyrightHolder(@Nullable final String copyrightHolderParam) {
        this.copyrightHolder = copyrightHolderParam;
    }
    
    /**
     * Set value of rcode.
     *
     * @param rcodeParam
     */
    public final void setRcode(@Nullable final Integer rcodeParam) {
        this.rcode = rcodeParam;
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
}
