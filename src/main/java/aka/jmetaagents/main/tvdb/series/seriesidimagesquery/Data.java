package aka.jmetaagents.main.tvdb.series.seriesidimagesquery;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Data {

	@Nullable
    private String fileName;
	@Nullable
    private String thumbnail;
	@Nullable
    private String subKey;
	@Nullable
    private RatingsInfo ratingsInfo;
	@Nullable
    private Integer languageId;
	@Nullable
    private Integer id;
	@Nullable
    private String keyType;
	@Nullable
    private String resolution;

	/**
     * Empty Constructor.
     */
    public Data() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param fileNameParam String
     * @param thumbnailParam String
     * @param subKeyParam String
     * @param ratingsInfoParam RatingsInfo
     * @param languageIdParam Integer
     * @param idParam Integer
     * @param keyTypeParam String
     * @param resolutionParam String
     */
    public Data(@Nullable final String fileNameParam, @Nullable final String thumbnailParam, @Nullable final String subKeyParam, @Nullable final RatingsInfo ratingsInfoParam, @Nullable final Integer languageIdParam, @Nullable final Integer idParam, @Nullable final String keyTypeParam, @Nullable final String resolutionParam) {
        this.fileName = fileNameParam;
        this.thumbnail = thumbnailParam;
        this.subKey = subKeyParam;
        this.ratingsInfo = ratingsInfoParam;
        this.languageId = languageIdParam;
        this.id = idParam;
        this.keyType = keyTypeParam;
        this.resolution = resolutionParam;
    }
    
    /**
     * Get value of fileName.
     *
     * @return String value of fileName
     */
    @Nullable
    public final String getFileName() {
        return this.fileName;
    }
    
    /**
     * Get value of thumbnail.
     *
     * @return String value of thumbnail
     */
    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }
    
    /**
     * Get value of subKey.
     *
     * @return String value of subKey
     */
    @Nullable
    public final String getSubKey() {
        return this.subKey;
    }
    
    /**
     * Get value of ratingsInfo.
     *
     * @return RatingsInfo value of ratingsInfo
     */
    @Nullable
    public final RatingsInfo getRatingsInfo() {
        return this.ratingsInfo;
    }
    
    /**
     * Get value of languageId.
     *
     * @return Integer value of languageId
     */
    @Nullable
    public final Integer getLanguageId() {
        return this.languageId;
    }
    
    /**
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }
    
    /**
     * Get value of keyType.
     *
     * @return String value of keyType
     */
    @Nullable
    public final String getKeyType() {
        return this.keyType;
    }
    
    /**
     * Get value of resolution.
     *
     * @return String value of resolution
     */
    @Nullable
    public final String getResolution() {
        return this.resolution;
    }

    
    /**
     * Set value of fileName.
     *
     * @param fileNameParam
     */
    public final void setFileName(@Nullable final String fileNameParam) {
        this.fileName = fileNameParam;
    }
    
    /**
     * Set value of thumbnail.
     *
     * @param thumbnailParam
     */
    public final void setThumbnail(@Nullable final String thumbnailParam) {
        this.thumbnail = thumbnailParam;
    }
    
    /**
     * Set value of subKey.
     *
     * @param subKeyParam
     */
    public final void setSubKey(@Nullable final String subKeyParam) {
        this.subKey = subKeyParam;
    }
    
    /**
     * Set value of ratingsInfo.
     *
     * @param ratingsInfoParam
     */
    public final void setRatingsInfo(@Nullable final RatingsInfo ratingsInfoParam) {
        this.ratingsInfo = ratingsInfoParam;
    }
    
    /**
     * Set value of languageId.
     *
     * @param languageIdParam
     */
    public final void setLanguageId(@Nullable final Integer languageIdParam) {
        this.languageId = languageIdParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of keyType.
     *
     * @param keyTypeParam
     */
    public final void setKeyType(@Nullable final String keyTypeParam) {
        this.keyType = keyTypeParam;
    }
    
    /**
     * Set value of resolution.
     *
     * @param resolutionParam
     */
    public final void setResolution(@Nullable final String resolutionParam) {
        this.resolution = resolutionParam;
    }
}
