package aka.jmetaagents.main.jallocine.pojo.jtvshowssearch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Tvseries {

	@Nullable
    private CastingShort castingShort;
	@Nullable
    private Integer code;
	@Nullable
    private Integer seasonCount;
	@Nullable
    private String originalTitle;
	@NonNull
    private List<Link> link = new ArrayList<>();
	@Nullable
    private Integer yearEnd;
	@Nullable
    private Poster poster;
	@Nullable
    private Integer yearStart;
	@Nullable
    private Statistics statistics;

	/**
     * Empty Constructor.
     */
    public Tvseries() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param castingShortParam CastingShort
     * @param codeParam Integer
     * @param seasonCountParam Integer
     * @param originalTitleParam String
     * @param linkParam List<Link>
     * @param yearEndParam Integer
     * @param posterParam Poster
     * @param yearStartParam Integer
     * @param statisticsParam Statistics
     */
    public Tvseries(@Nullable final CastingShort castingShortParam, @Nullable final Integer codeParam, @Nullable final Integer seasonCountParam, @Nullable final String originalTitleParam, @NonNull final List<Link> linkParam, @Nullable final Integer yearEndParam, @Nullable final Poster posterParam, @Nullable final Integer yearStartParam, @Nullable final Statistics statisticsParam) {
        this.castingShort = castingShortParam;
        this.code = codeParam;
        this.seasonCount = seasonCountParam;
        this.originalTitle = originalTitleParam;
        this.link = linkParam;
        this.yearEnd = yearEndParam;
        this.poster = posterParam;
        this.yearStart = yearStartParam;
        this.statistics = statisticsParam;
    }
    
    /**
     * Get value of castingShort.
     *
     * @return CastingShort value of castingShort
     */
    @Nullable
    public final CastingShort getCastingShort() {
        return this.castingShort;
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
     * Get value of seasonCount.
     *
     * @return Integer value of seasonCount
     */
    @Nullable
    public final Integer getSeasonCount() {
        return this.seasonCount;
    }
    
    /**
     * Get value of originalTitle.
     *
     * @return String value of originalTitle
     */
    @Nullable
    public final String getOriginalTitle() {
        return this.originalTitle;
    }
    
    /**
     * Get value of link.
     *
     * @return List<Link> value of link
     */
    @NonNull
    public final List<Link> getLink() {
        return this.link;
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
     * Get value of poster.
     *
     * @return Poster value of poster
     */
    @Nullable
    public final Poster getPoster() {
        return this.poster;
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
     * Get value of statistics.
     *
     * @return Statistics value of statistics
     */
    @Nullable
    public final Statistics getStatistics() {
        return this.statistics;
    }

    
    /**
     * Set value of castingShort.
     *
     * @param castingShortParam
     */
    public final void setCastingShort(@Nullable final CastingShort castingShortParam) {
        this.castingShort = castingShortParam;
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
     * Set value of seasonCount.
     *
     * @param seasonCountParam
     */
    public final void setSeasonCount(@Nullable final Integer seasonCountParam) {
        this.seasonCount = seasonCountParam;
    }
    
    /**
     * Set value of originalTitle.
     *
     * @param originalTitleParam
     */
    public final void setOriginalTitle(@Nullable final String originalTitleParam) {
        this.originalTitle = originalTitleParam;
    }
    
    /**
     * Set value of link.
     *
     * @param linkParam
     */
    public final void getLink(@NonNull final List<Link> linkParam) {
        this.link = linkParam;
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
     * Set value of poster.
     *
     * @param posterParam
     */
    public final void setPoster(@Nullable final Poster posterParam) {
        this.poster = posterParam;
    }
    
    /**
     * Set value of yearStart.
     *
     * @param yearStartParam
     */
    public final void setYearStart(@Nullable final Integer yearStartParam) {
        this.yearStart = yearStartParam;
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
