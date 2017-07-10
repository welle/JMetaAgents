package aka.jmetaagents.main.jallocine.pojo.jperson;

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
public final class Movie {

	@Nullable
    private Integer code;
	@Nullable
    private MovieType movieType;
	@Nullable
    private String originalTitle;
	@Nullable
    private Release release;
	@Nullable
    private Integer productionYear;
	@Nullable
    private String title;
	@Nullable
    private String synopsisShort;
	@Nullable
    private Poster poster;
	@NonNull
    private List<CastMember> castMember = new ArrayList<>();
	@Nullable
    private Statistics statistics;

	/**
     * Empty Constructor.
     */
    public Movie() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param codeParam Integer
     * @param movieTypeParam MovieType
     * @param originalTitleParam String
     * @param releaseParam Release
     * @param productionYearParam Integer
     * @param titleParam String
     * @param synopsisShortParam String
     * @param posterParam Poster
     * @param castMemberParam List<CastMember>
     * @param statisticsParam Statistics
     */
    public Movie(@Nullable final Integer codeParam, @Nullable final MovieType movieTypeParam, @Nullable final String originalTitleParam, @Nullable final Release releaseParam, @Nullable final Integer productionYearParam, @Nullable final String titleParam, @Nullable final String synopsisShortParam, @Nullable final Poster posterParam, @NonNull final List<CastMember> castMemberParam, @Nullable final Statistics statisticsParam) {
        this.code = codeParam;
        this.movieType = movieTypeParam;
        this.originalTitle = originalTitleParam;
        this.release = releaseParam;
        this.productionYear = productionYearParam;
        this.title = titleParam;
        this.synopsisShort = synopsisShortParam;
        this.poster = posterParam;
        this.castMember = castMemberParam;
        this.statistics = statisticsParam;
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
     * Get value of movieType.
     *
     * @return MovieType value of movieType
     */
    @Nullable
    public final MovieType getMovieType() {
        return this.movieType;
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
     * Get value of release.
     *
     * @return Release value of release
     */
    @Nullable
    public final Release getRelease() {
        return this.release;
    }
    
    /**
     * Get value of productionYear.
     *
     * @return Integer value of productionYear
     */
    @Nullable
    public final Integer getProductionYear() {
        return this.productionYear;
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
     * Get value of synopsisShort.
     *
     * @return String value of synopsisShort
     */
    @Nullable
    public final String getSynopsisShort() {
        return this.synopsisShort;
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
     * Get value of castMember.
     *
     * @return List<CastMember> value of castMember
     */
    @NonNull
    public final List<CastMember> getCastMember() {
        return this.castMember;
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
     * Set value of code.
     *
     * @param codeParam
     */
    public final void setCode(@Nullable final Integer codeParam) {
        this.code = codeParam;
    }
    
    /**
     * Set value of movieType.
     *
     * @param movieTypeParam
     */
    public final void setMovieType(@Nullable final MovieType movieTypeParam) {
        this.movieType = movieTypeParam;
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
     * Set value of release.
     *
     * @param releaseParam
     */
    public final void setRelease(@Nullable final Release releaseParam) {
        this.release = releaseParam;
    }
    
    /**
     * Set value of productionYear.
     *
     * @param productionYearParam
     */
    public final void setProductionYear(@Nullable final Integer productionYearParam) {
        this.productionYear = productionYearParam;
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
     * Set value of synopsisShort.
     *
     * @param synopsisShortParam
     */
    public final void setSynopsisShort(@Nullable final String synopsisShortParam) {
        this.synopsisShort = synopsisShortParam;
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
     * Set value of castMember.
     *
     * @param castMemberParam
     */
    public final void getCastMember(@NonNull final List<CastMember> castMemberParam) {
        this.castMember = castMemberParam;
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
