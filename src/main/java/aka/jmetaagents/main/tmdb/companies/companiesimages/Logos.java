package aka.jmetaagents.main.tmdb.companies.companiesimages;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Logos {

    @JsonProperty("aspect_ratio")
	@Nullable
    private Double aspectRatio;
    @JsonProperty("file_path")
	@Nullable
    private String filePath;
    @JsonProperty("file_type")
	@Nullable
    private String fileType;
    @JsonProperty("vote_average")
	@Nullable
    private Integer voteAverage;
	@Nullable
    private Integer width;
	@Nullable
    private String id;
    @JsonProperty("vote_count")
	@Nullable
    private Integer voteCount;
	@Nullable
    private Integer height;

	/**
     * Empty Constructor.
     */
    public Logos() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param aspectRatioParam Double
     * @param filePathParam String
     * @param fileTypeParam String
     * @param voteAverageParam Integer
     * @param widthParam Integer
     * @param idParam String
     * @param voteCountParam Integer
     * @param heightParam Integer
     */
    public Logos(@Nullable final Double aspectRatioParam, @Nullable final String filePathParam, @Nullable final String fileTypeParam, @Nullable final Integer voteAverageParam, @Nullable final Integer widthParam, @Nullable final String idParam, @Nullable final Integer voteCountParam, @Nullable final Integer heightParam) {
        this.aspectRatio = aspectRatioParam;
        this.filePath = filePathParam;
        this.fileType = fileTypeParam;
        this.voteAverage = voteAverageParam;
        this.width = widthParam;
        this.id = idParam;
        this.voteCount = voteCountParam;
        this.height = heightParam;
    }
    
    /**
     * Get value of aspectRatio.
     *
     * @return Double value of aspectRatio
     */
    @Nullable
    public final Double getAspectRatio() {
        return this.aspectRatio;
    }
    
    /**
     * Get value of filePath.
     *
     * @return String value of filePath
     */
    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }
    
    /**
     * Get value of fileType.
     *
     * @return String value of fileType
     */
    @Nullable
    public final String getFileType() {
        return this.fileType;
    }
    
    /**
     * Get value of voteAverage.
     *
     * @return Integer value of voteAverage
     */
    @Nullable
    public final Integer getVoteAverage() {
        return this.voteAverage;
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
     * Get value of id.
     *
     * @return String value of id
     */
    @Nullable
    public final String getId() {
        return this.id;
    }
    
    /**
     * Get value of voteCount.
     *
     * @return Integer value of voteCount
     */
    @Nullable
    public final Integer getVoteCount() {
        return this.voteCount;
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
     * Set value of aspectRatio.
     *
     * @param aspectRatioParam
     */
    public final void setAspectRatio(@Nullable final Double aspectRatioParam) {
        this.aspectRatio = aspectRatioParam;
    }
    
    /**
     * Set value of filePath.
     *
     * @param filePathParam
     */
    public final void setFilePath(@Nullable final String filePathParam) {
        this.filePath = filePathParam;
    }
    
    /**
     * Set value of fileType.
     *
     * @param fileTypeParam
     */
    public final void setFileType(@Nullable final String fileTypeParam) {
        this.fileType = fileTypeParam;
    }
    
    /**
     * Set value of voteAverage.
     *
     * @param voteAverageParam
     */
    public final void setVoteAverage(@Nullable final Integer voteAverageParam) {
        this.voteAverage = voteAverageParam;
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
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final String idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of voteCount.
     *
     * @param voteCountParam
     */
    public final void setVoteCount(@Nullable final Integer voteCountParam) {
        this.voteCount = voteCountParam;
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
