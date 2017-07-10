package aka.jmetaagents.main.jallocine.pojo.jperson;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jperson.deserializers.URLDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Rendition {

	@Nullable
    private Integer code;
	@Nullable
    private Integer size;
	@Nullable
    private Bandwidth bandwidth;
	@Nullable
    private Format format;
	@Nullable
    private Integer width;
	@Nullable
    private EncodingProfile encodingProfile;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI href;
    @JsonProperty("publication")
	@Nullable
    private Publication2 publication2;
	@Nullable
    private Integer height;

	/**
     * Empty Constructor.
     */
    public Rendition() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param sizeParam Integer
     * @param bandwidthParam Bandwidth
     * @param formatParam Format
     * @param widthParam Integer
     * @param encodingProfileParam EncodingProfile
     * @param hrefParam URI
     * @param publication2Param Publication2
     * @param heightParam Integer
     */
    public Rendition(@Nullable final Integer codeParam, @Nullable final Integer sizeParam, @Nullable final Bandwidth bandwidthParam, @Nullable final Format formatParam, @Nullable final Integer widthParam, @Nullable final EncodingProfile encodingProfileParam, @Nullable final URI hrefParam, @Nullable final Publication2 publication2Param, @Nullable final Integer heightParam) {
        this.code = codeParam;
        this.size = sizeParam;
        this.bandwidth = bandwidthParam;
        this.format = formatParam;
        this.width = widthParam;
        this.encodingProfile = encodingProfileParam;
        this.href = hrefParam;
        this.publication2 = publication2Param;
        this.height = heightParam;
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
     * Get value of size.
     *
     * @return Integer value of size
     */
    @Nullable
    public final Integer getSize() {
        return this.size;
    }
    
    /**
     * Get value of bandwidth.
     *
     * @return Bandwidth value of bandwidth
     */
    @Nullable
    public final Bandwidth getBandwidth() {
        return this.bandwidth;
    }
    
    /**
     * Get value of format.
     *
     * @return Format value of format
     */
    @Nullable
    public final Format getFormat() {
        return this.format;
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
     * Get value of encodingProfile.
     *
     * @return EncodingProfile value of encodingProfile
     */
    @Nullable
    public final EncodingProfile getEncodingProfile() {
        return this.encodingProfile;
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
     * Get value of publication2.
     *
     * @return Publication2 value of publication2
     */
    @Nullable
    public final Publication2 getPublication2() {
        return this.publication2;
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
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
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
     * Set value of bandwidth.
     *
     * @param bandwidthParam
     */
    public final void setBandwidth(@Nullable final Bandwidth bandwidthParam) {
        this.bandwidth = bandwidthParam;
    }
    
    /**
     * Set value of format.
     *
     * @param formatParam
     */
    public final void setFormat(@Nullable final Format formatParam) {
        this.format = formatParam;
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
     * Set value of encodingProfile.
     *
     * @param encodingProfileParam
     */
    public final void setEncodingProfile(@Nullable final EncodingProfile encodingProfileParam) {
        this.encodingProfile = encodingProfileParam;
    }
    
    /**
     * Set value of href.
     *
     * @param hrefParam
     */
    public final void setHref(@Nullable final URI hrefParam) {
        this.href = hrefParam;
    }
    
    /**
     * Set value of publication2.
     *
     * @param publication2Param
     */
    public final void setPublication2(@Nullable final Publication2 publication2Param) {
        this.publication2 = publication2Param;
    }
    
    /**
     * Set value of height.
     *
     * @param heightParam
     */
    public final void setHeight(@Nullable final Integer heightParam) {
        this.height = heightParam;
    }
}
