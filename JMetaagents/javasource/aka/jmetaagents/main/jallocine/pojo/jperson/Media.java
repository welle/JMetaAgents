package aka.jmetaagents.main.jallocine.pojo.jperson;

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
	@NonNull
    private List<Subject> subject = new ArrayList<>();
	@Nullable
    private String description;
	@Nullable
    private Integer rcode;
	@Nullable
    private Type type;
	@Nullable
    private String title;
	@Nullable
    private Version version;
	@NonNull
    private List<Rendition> rendition = new ArrayList<>();
    @JsonProperty("link")
	@NonNull
    private List<Link1> link1 = new ArrayList<>();
	@Nullable
    private String copyrightHolder;
    @JsonProperty("statistics")
	@Nullable
    private Statistics1 statistics1;
	@Nullable
    private Integer width;
	@Nullable
    private String titleShort;
    @JsonProperty("class")
	@Nullable
    private String clazz;
	@Nullable
    private Integer height;
	@Nullable
    private AcShow acShow;
    @JsonProperty("publication")
	@Nullable
    private Publication3 publication3;

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
     * @param subjectParam List<Subject>
     * @param descriptionParam String
     * @param rcodeParam Integer
     * @param typeParam Type
     * @param titleParam String
     * @param versionParam Version
     * @param renditionParam List<Rendition>
     * @param link1Param List<Link1>
     * @param copyrightHolderParam String
     * @param statistics1Param Statistics1
     * @param widthParam Integer
     * @param titleShortParam String
     * @param clazzParam String
     * @param heightParam Integer
     * @param acShowParam AcShow
     * @param publication3Param Publication3
     */
    public Media(@Nullable final Thumbnail thumbnailParam, @Nullable final Integer codeParam, @NonNull final List<Subject> subjectParam, @Nullable final String descriptionParam, @Nullable final Integer rcodeParam, @Nullable final Type typeParam, @Nullable final String titleParam, @Nullable final Version versionParam, @NonNull final List<Rendition> renditionParam, @NonNull final List<Link1> link1Param, @Nullable final String copyrightHolderParam, @Nullable final Statistics1 statistics1Param, @Nullable final Integer widthParam, @Nullable final String titleShortParam, @Nullable final String clazzParam, @Nullable final Integer heightParam, @Nullable final AcShow acShowParam, @Nullable final Publication3 publication3Param) {
        this.thumbnail = thumbnailParam;
        this.code = codeParam;
        this.subject = subjectParam;
        this.description = descriptionParam;
        this.rcode = rcodeParam;
        this.type = typeParam;
        this.title = titleParam;
        this.version = versionParam;
        this.rendition = renditionParam;
        this.link1 = link1Param;
        this.copyrightHolder = copyrightHolderParam;
        this.statistics1 = statistics1Param;
        this.width = widthParam;
        this.titleShort = titleShortParam;
        this.clazz = clazzParam;
        this.height = heightParam;
        this.acShow = acShowParam;
        this.publication3 = publication3Param;
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
     * Get value of subject.
     *
     * @return List<Subject> value of subject
     */
    @NonNull
    public final List<Subject> getSubject() {
        return this.subject;
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
     * Get value of rendition.
     *
     * @return List<Rendition> value of rendition
     */
    @NonNull
    public final List<Rendition> getRendition() {
        return this.rendition;
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
     * Get value of statistics1.
     *
     * @return Statistics1 value of statistics1
     */
    @Nullable
    public final Statistics1 getStatistics1() {
        return this.statistics1;
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
     * Get value of publication3.
     *
     * @return Publication3 value of publication3
     */
    @Nullable
    public final Publication3 getPublication3() {
        return this.publication3;
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
     * Set value of subject.
     *
     * @param subjectParam
     */
    public final void getSubject(@NonNull final List<Subject> subjectParam) {
        this.subject = subjectParam;
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
     * Set value of rendition.
     *
     * @param renditionParam
     */
    public final void getRendition(@NonNull final List<Rendition> renditionParam) {
        this.rendition = renditionParam;
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
     * Set value of statistics1.
     *
     * @param statistics1Param
     */
    public final void setStatistics1(@Nullable final Statistics1 statistics1Param) {
        this.statistics1 = statistics1Param;
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
     * Set value of publication3.
     *
     * @param publication3Param
     */
    public final void setPublication3(@Nullable final Publication3 publication3Param) {
        this.publication3 = publication3Param;
    }
}
