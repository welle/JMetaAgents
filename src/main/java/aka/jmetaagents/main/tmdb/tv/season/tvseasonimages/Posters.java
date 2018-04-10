package aka.jmetaagents.main.tmdb.tv.season.tvseasonimages;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Posters {

    @JsonProperty("aspect_ratio")
	@Nullable
    private Double aspectRatio;
    @JsonProperty("file_path")
	@Nullable
    private String filePath;
    @JsonProperty("vote_average")
	@Nullable
    private Double voteAverage;
	@Nullable
    private Integer width;
    @JsonProperty("iso_639_1")
	@Nullable
    private String iso6391;
    @JsonProperty("vote_count")
	@Nullable
    private Integer voteCount;
	@Nullable
    private Integer height;

	/**
     * Empty Constructor.
     */
    public Posters() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param aspectRatioParam Double
     * @param filePathParam String
     * @param voteAverageParam Double
     * @param widthParam Integer
     * @param iso6391Param String
     * @param voteCountParam Integer
     * @param heightParam Integer
     */
    public Posters(@Nullable final Double aspectRatioParam, @Nullable final String filePathParam, @Nullable final Double voteAverageParam, @Nullable final Integer widthParam, @Nullable final String iso6391Param, @Nullable final Integer voteCountParam, @Nullable final Integer heightParam) {
        this.aspectRatio = aspectRatioParam;
        this.filePath = filePathParam;
        this.voteAverage = voteAverageParam;
        this.width = widthParam;
        this.iso6391 = iso6391Param;
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
     * Get value of voteAverage.
     *
     * @return Double value of voteAverage
     */
    @Nullable
    public final Double getVoteAverage() {
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
     * Get value of iso6391.
     *
     * @return String value of iso6391
     */
    @Nullable
    public final String getIso6391() {
        return this.iso6391;
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
     * Set value of voteAverage.
     *
     * @param voteAverageParam
     */
    public final void setVoteAverage(@Nullable final Double voteAverageParam) {
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
     * Set value of iso6391.
     *
     * @param iso6391Param
     */
    public final void setIso6391(@Nullable final String iso6391Param) {
        this.iso6391 = iso6391Param;
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
