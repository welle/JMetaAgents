package aka.jmetaagents.main.jallocine.pojo.jmoviesearch;

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
    private CastingShort castingShort;
	@Nullable
    private MovieCertificate movieCertificate;
	@Nullable
    private Integer code;
	@Nullable
    private String originalTitle;
	@Nullable
    private Release release;
	@NonNull
    private List<Link> link = new ArrayList<>();
	@Nullable
    private Integer productionYear;
	@Nullable
    private String title;
	@Nullable
    private Poster poster;
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
     * @param castingShortParam CastingShort
     * @param movieCertificateParam MovieCertificate
     * @param codeParam Integer
     * @param originalTitleParam String
     * @param releaseParam Release
     * @param linkParam List<Link>
     * @param productionYearParam Integer
     * @param titleParam String
     * @param posterParam Poster
     * @param statisticsParam Statistics
     */
    public Movie(@Nullable final CastingShort castingShortParam, @Nullable final MovieCertificate movieCertificateParam, @Nullable final Integer codeParam, @Nullable final String originalTitleParam, @Nullable final Release releaseParam, @NonNull final List<Link> linkParam, @Nullable final Integer productionYearParam, @Nullable final String titleParam, @Nullable final Poster posterParam, @Nullable final Statistics statisticsParam) {
        this.castingShort = castingShortParam;
        this.movieCertificate = movieCertificateParam;
        this.code = codeParam;
        this.originalTitle = originalTitleParam;
        this.release = releaseParam;
        this.link = linkParam;
        this.productionYear = productionYearParam;
        this.title = titleParam;
        this.poster = posterParam;
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
     * Get value of movieCertificate.
     *
     * @return MovieCertificate value of movieCertificate
     */
    @Nullable
    public final MovieCertificate getMovieCertificate() {
        return this.movieCertificate;
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
     * Get value of link.
     *
     * @return List<Link> value of link
     */
    @NonNull
    public final List<Link> getLink() {
        return this.link;
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
     * Get value of poster.
     *
     * @return Poster value of poster
     */
    @Nullable
    public final Poster getPoster() {
        return this.poster;
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
     * Set value of movieCertificate.
     *
     * @param movieCertificateParam
     */
    public final void setMovieCertificate(@Nullable final MovieCertificate movieCertificateParam) {
        this.movieCertificate = movieCertificateParam;
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
     * Set value of link.
     *
     * @param linkParam
     */
    public final void getLink(@NonNull final List<Link> linkParam) {
        this.link = linkParam;
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
     * Set value of poster.
     *
     * @param posterParam
     */
    public final void setPoster(@Nullable final Poster posterParam) {
        this.poster = posterParam;
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
