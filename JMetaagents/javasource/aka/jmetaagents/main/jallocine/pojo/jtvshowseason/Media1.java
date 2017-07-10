package aka.jmetaagents.main.jallocine.pojo.jtvshowseason;

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
public final class Media1 {

	@Nullable
    private Integer code;
	@Nullable
    private Integer runtime;
	@Nullable
    private Integer rcode;
	@Nullable
    private String title;
    @JsonProperty("type")
	@Nullable
    private Type1 type1;
	@Nullable
    private String copyrightHolder;
    @JsonProperty("version")
	@Nullable
    private Version1 version1;
    @JsonProperty("statistics")
	@Nullable
    private Statistics1 statistics1;
	@Nullable
    private Integer width;
    @JsonProperty("link")
	@NonNull
    private List<Link2> link2 = new ArrayList<>();
    @JsonProperty("class")
	@Nullable
    private String clazz;
	@Nullable
    private String trailerEmbed;
    @JsonProperty("thumbnail")
	@Nullable
    private Thumbnail1 thumbnail1;
	@Nullable
    private Integer height;
	@Nullable
    private AcShow acShow;

	/**
     * Empty Constructor.
     */
    public Media1() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param runtimeParam Integer
     * @param rcodeParam Integer
     * @param titleParam String
     * @param type1Param Type1
     * @param copyrightHolderParam String
     * @param version1Param Version1
     * @param statistics1Param Statistics1
     * @param widthParam Integer
     * @param link2Param List<Link2>
     * @param clazzParam String
     * @param trailerEmbedParam String
     * @param thumbnail1Param Thumbnail1
     * @param heightParam Integer
     * @param acShowParam AcShow
     */
    public Media1(@Nullable final Integer codeParam, @Nullable final Integer runtimeParam, @Nullable final Integer rcodeParam, @Nullable final String titleParam, @Nullable final Type1 type1Param, @Nullable final String copyrightHolderParam, @Nullable final Version1 version1Param, @Nullable final Statistics1 statistics1Param, @Nullable final Integer widthParam, @NonNull final List<Link2> link2Param, @Nullable final String clazzParam, @Nullable final String trailerEmbedParam, @Nullable final Thumbnail1 thumbnail1Param, @Nullable final Integer heightParam, @Nullable final AcShow acShowParam) {
        this.code = codeParam;
        this.runtime = runtimeParam;
        this.rcode = rcodeParam;
        this.title = titleParam;
        this.type1 = type1Param;
        this.copyrightHolder = copyrightHolderParam;
        this.version1 = version1Param;
        this.statistics1 = statistics1Param;
        this.width = widthParam;
        this.link2 = link2Param;
        this.clazz = clazzParam;
        this.trailerEmbed = trailerEmbedParam;
        this.thumbnail1 = thumbnail1Param;
        this.height = heightParam;
        this.acShow = acShowParam;
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
     * Get value of title.
     *
     * @return String value of title
     */
    @Nullable
    public final String getTitle() {
        return this.title;
    }
    
    /**
     * Get value of type1.
     *
     * @return Type1 value of type1
     */
    @Nullable
    public final Type1 getType1() {
        return this.type1;
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
     * Get value of version1.
     *
     * @return Version1 value of version1
     */
    @Nullable
    public final Version1 getVersion1() {
        return this.version1;
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
     * Get value of link2.
     *
     * @return List<Link2> value of link2
     */
    @NonNull
    public final List<Link2> getLink2() {
        return this.link2;
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
     * Get value of thumbnail1.
     *
     * @return Thumbnail1 value of thumbnail1
     */
    @Nullable
    public final Thumbnail1 getThumbnail1() {
        return this.thumbnail1;
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
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
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
     * Set value of title.
     *
     * @param titleParam
     */
    public final void setTitle(@Nullable final String titleParam) {
        this.title = titleParam;
    }
    
    /**
     * Set value of type1.
     *
     * @param type1Param
     */
    public final void setType1(@Nullable final Type1 type1Param) {
        this.type1 = type1Param;
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
     * Set value of version1.
     *
     * @param version1Param
     */
    public final void setVersion1(@Nullable final Version1 version1Param) {
        this.version1 = version1Param;
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
     * Set value of link2.
     *
     * @param link2Param
     */
    public final void getLink2(@NonNull final List<Link2> link2Param) {
        this.link2 = link2Param;
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
     * Set value of thumbnail1.
     *
     * @param thumbnail1Param
     */
    public final void setThumbnail1(@Nullable final Thumbnail1 thumbnail1Param) {
        this.thumbnail1 = thumbnail1Param;
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
}
