package aka.jmetaagents.main.jallocine.pojo.jtvshow;

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
	@Nullable
    private String description;
	@Nullable
    private Integer runtime;
	@Nullable
    private Integer rcode;
	@Nullable
    private Type type;
	@Nullable
    private String title;
	@Nullable
    private Version version;
    @JsonProperty("link")
	@NonNull
    private List<Link1> link1 = new ArrayList<>();
	@Nullable
    private String copyrightHolder;
	@Nullable
    private Integer width;
	@Nullable
    private String titleShort;
    @JsonProperty("class")
	@Nullable
    private String clazz;
	@Nullable
    private String trailerEmbed;
	@Nullable
    private Integer height;
	@Nullable
    private AcShow acShow;
	@Nullable
    private Statistics statistics;

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
     * @param descriptionParam String
     * @param runtimeParam Integer
     * @param rcodeParam Integer
     * @param typeParam Type
     * @param titleParam String
     * @param versionParam Version
     * @param link1Param List<Link1>
     * @param copyrightHolderParam String
     * @param widthParam Integer
     * @param titleShortParam String
     * @param clazzParam String
     * @param trailerEmbedParam String
     * @param heightParam Integer
     * @param acShowParam AcShow
     * @param statisticsParam Statistics
     */
    public Media(@Nullable final Thumbnail thumbnailParam, @Nullable final Integer codeParam, @Nullable final String descriptionParam, @Nullable final Integer runtimeParam, @Nullable final Integer rcodeParam, @Nullable final Type typeParam, @Nullable final String titleParam, @Nullable final Version versionParam, @NonNull final List<Link1> link1Param, @Nullable final String copyrightHolderParam, @Nullable final Integer widthParam, @Nullable final String titleShortParam, @Nullable final String clazzParam, @Nullable final String trailerEmbedParam, @Nullable final Integer heightParam, @Nullable final AcShow acShowParam, @Nullable final Statistics statisticsParam) {
        this.thumbnail = thumbnailParam;
        this.code = codeParam;
        this.description = descriptionParam;
        this.runtime = runtimeParam;
        this.rcode = rcodeParam;
        this.type = typeParam;
        this.title = titleParam;
        this.version = versionParam;
        this.link1 = link1Param;
        this.copyrightHolder = copyrightHolderParam;
        this.width = widthParam;
        this.titleShort = titleShortParam;
        this.clazz = clazzParam;
        this.trailerEmbed = trailerEmbedParam;
        this.height = heightParam;
        this.acShow = acShowParam;
        this.statistics = statisticsParam;
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
     * Get value of description.
     *
     * @return String value of description
     */
    @Nullable
    public final String getDescription() {
        return this.description;
    }
    
    /**
     * Get value of runtime.
     *
     * @return Integer value of runtime
     */
    @Nullable
    public final Integer getRuntime() {
        return this.runtime;
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
     * Get value of version.
     *
     * @return Version value of version
     */
    @Nullable
    public final Version getVersion() {
        return this.version;
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
     * Get value of width.
     *
     * @return Integer value of width
     */
    @Nullable
    public final Integer getWidth() {
        return this.width;
    }
    
    /**
     * Get value of titleShort.
     *
     * @return String value of titleShort
     */
    @Nullable
    public final String getTitleShort() {
        return this.titleShort;
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
     * Get value of trailerEmbed.
     *
     * @return String value of trailerEmbed
     */
    @Nullable
    public final String getTrailerEmbed() {
        return this.trailerEmbed;
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
     * Get value of acShow.
     *
     * @return AcShow value of acShow
     */
    @Nullable
    public final AcShow getAcShow() {
        return this.acShow;
    }
    
    /**
     * Get value of statistics.
     *
     * @return Statistics value of statistics
     */
    @Nullable
    public final Statistics getStatistics() {
        return this.statistics;
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
     * Set value of description.
     *
     * @param descriptionParam
     */
    public final void setDescription(@Nullable final String descriptionParam) {
        this.description = descriptionParam;
    }
    
    /**
     * Set value of runtime.
     *
     * @param runtimeParam
     */
    public final void setRuntime(@Nullable final Integer runtimeParam) {
        this.runtime = runtimeParam;
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
     * Set value of version.
     *
     * @param versionParam
     */
    public final void setVersion(@Nullable final Version versionParam) {
        this.version = versionParam;
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
     * Set value of width.
     *
     * @param widthParam
     */
    public final void setWidth(@Nullable final Integer widthParam) {
        this.width = widthParam;
    }
    
    /**
     * Set value of titleShort.
     *
     * @param titleShortParam
     */
    public final void setTitleShort(@Nullable final String titleShortParam) {
        this.titleShort = titleShortParam;
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
     * Set value of trailerEmbed.
     *
     * @param trailerEmbedParam
     */
    public final void setTrailerEmbed(@Nullable final String trailerEmbedParam) {
        this.trailerEmbed = trailerEmbedParam;
    }
    
    /**
     * Set value of height.
     *
     * @param heightParam
     */
    public final void setHeight(@Nullable final Integer heightParam) {
        this.height = heightParam;
    }
    
    /**
     * Set value of acShow.
     *
     * @param acShowParam
     */
    public final void setAcShow(@Nullable final AcShow acShowParam) {
        this.acShow = acShowParam;
    }
    
    /**
     * Set value of statistics.
     *
     * @param statisticsParam
     */
    public final void setStatistics(@Nullable final Statistics statisticsParam) {
        this.statistics = statisticsParam;
    }
}
