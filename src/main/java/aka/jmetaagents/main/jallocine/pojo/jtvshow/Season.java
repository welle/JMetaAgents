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
public final class Season {

	@Nullable
    private Integer code;
	@Nullable
    private Integer episodeCount;
    @JsonProperty("productionStatus")
	@Nullable
    private ProductionStatus1 productionStatus1;
    @JsonProperty("statistics")
	@Nullable
    private Statistics1 statistics1;
	@Nullable
    private Integer yearEnd;
	@Nullable
    private Integer seasonNumber;
    @JsonProperty("link")
	@NonNull
    private List<Link2> link2 = new ArrayList<>();
	@Nullable
    private String trailerEmbed;
	@Nullable
    private Integer yearStart;

	/**
     * Empty Constructor.
     */
    public Season() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param episodeCountParam Integer
     * @param productionStatus1Param ProductionStatus1
     * @param statistics1Param Statistics1
     * @param yearEndParam Integer
     * @param seasonNumberParam Integer
     * @param link2Param List<Link2>
     * @param trailerEmbedParam String
     * @param yearStartParam Integer
     */
    public Season(@Nullable final Integer codeParam, @Nullable final Integer episodeCountParam, @Nullable final ProductionStatus1 productionStatus1Param, @Nullable final Statistics1 statistics1Param, @Nullable final Integer yearEndParam, @Nullable final Integer seasonNumberParam, @NonNull final List<Link2> link2Param, @Nullable final String trailerEmbedParam, @Nullable final Integer yearStartParam) {
        this.code = codeParam;
        this.episodeCount = episodeCountParam;
        this.productionStatus1 = productionStatus1Param;
        this.statistics1 = statistics1Param;
        this.yearEnd = yearEndParam;
        this.seasonNumber = seasonNumberParam;
        this.link2 = link2Param;
        this.trailerEmbed = trailerEmbedParam;
        this.yearStart = yearStartParam;
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
     * Get value of episodeCount.
     *
     * @return Integer value of episodeCount
     */
    @Nullable
    public final Integer getEpisodeCount() {
        return this.episodeCount;
    }
    
    /**
     * Get value of productionStatus1.
     *
     * @return ProductionStatus1 value of productionStatus1
     */
    @Nullable
    public final ProductionStatus1 getProductionStatus1() {
        return this.productionStatus1;
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
     * Get value of yearEnd.
     *
     * @return Integer value of yearEnd
     */
    @Nullable
    public final Integer getYearEnd() {
        return this.yearEnd;
    }
    
    /**
     * Get value of seasonNumber.
     *
     * @return Integer value of seasonNumber
     */
    @Nullable
    public final Integer getSeasonNumber() {
        return this.seasonNumber;
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
     * Get value of trailerEmbed.
     *
     * @return String value of trailerEmbed
     */
    @Nullable
    public final String getTrailerEmbed() {
        return this.trailerEmbed;
    }
    
    /**
     * Get value of yearStart.
     *
     * @return Integer value of yearStart
     */
    @Nullable
    public final Integer getYearStart() {
        return this.yearStart;
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
     * Set value of episodeCount.
     *
     * @param episodeCountParam
     */
    public final void setEpisodeCount(@Nullable final Integer episodeCountParam) {
        this.episodeCount = episodeCountParam;
    }
    
    /**
     * Set value of productionStatus1.
     *
     * @param productionStatus1Param
     */
    public final void setProductionStatus1(@Nullable final ProductionStatus1 productionStatus1Param) {
        this.productionStatus1 = productionStatus1Param;
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
     * Set value of yearEnd.
     *
     * @param yearEndParam
     */
    public final void setYearEnd(@Nullable final Integer yearEndParam) {
        this.yearEnd = yearEndParam;
    }
    
    /**
     * Set value of seasonNumber.
     *
     * @param seasonNumberParam
     */
    public final void setSeasonNumber(@Nullable final Integer seasonNumberParam) {
        this.seasonNumber = seasonNumberParam;
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
     * Set value of trailerEmbed.
     *
     * @param trailerEmbedParam
     */
    public final void setTrailerEmbed(@Nullable final String trailerEmbedParam) {
        this.trailerEmbed = trailerEmbedParam;
    }
    
    /**
     * Set value of yearStart.
     *
     * @param yearStartParam
     */
    public final void setYearStart(@Nullable final Integer yearStartParam) {
        this.yearStart = yearStartParam;
    }
}
