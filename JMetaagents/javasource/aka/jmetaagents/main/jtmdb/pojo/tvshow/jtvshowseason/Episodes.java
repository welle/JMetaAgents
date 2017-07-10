package aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseason;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshowseason.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Episodes {

    @JsonProperty("production_code")
	@Nullable
    private String productionCode;
    @JsonProperty("air_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date airDate;
	@Nullable
    private String overview;
    @JsonProperty("episode_number")
	@Nullable
    private Integer episodeNumber;
    @JsonProperty("vote_average")
	@Nullable
    private Double voteAverage;
	@Nullable
    private String name;
    @JsonProperty("season_number")
	@Nullable
    private Integer seasonNumber;
	@Nullable
    private Integer id;
    @JsonProperty("still_path")
	@Nullable
    private String stillPath;
    @JsonProperty("vote_count")
	@Nullable
    private Integer voteCount;
	@NonNull
    private List<Crew> crew = new ArrayList<>();
    @JsonProperty("guest_stars")
	@NonNull
    private List<GuestStars> guestStars = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public Episodes() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param productionCodeParam String
     * @param airDateParam Date
     * @param overviewParam String
     * @param episodeNumberParam Integer
     * @param voteAverageParam Double
     * @param nameParam String
     * @param seasonNumberParam Integer
     * @param idParam Integer
     * @param stillPathParam String
     * @param voteCountParam Integer
     * @param crewParam List<Crew>
     * @param guestStarsParam List<GuestStars>
     */
    public Episodes(@Nullable final String productionCodeParam, @Nullable final Date airDateParam, @Nullable final String overviewParam, @Nullable final Integer episodeNumberParam, @Nullable final Double voteAverageParam, @Nullable final String nameParam, @Nullable final Integer seasonNumberParam, @Nullable final Integer idParam, @Nullable final String stillPathParam, @Nullable final Integer voteCountParam, @NonNull final List<Crew> crewParam, @NonNull final List<GuestStars> guestStarsParam) {
        this.productionCode = productionCodeParam;
        this.airDate = airDateParam;
        this.overview = overviewParam;
        this.episodeNumber = episodeNumberParam;
        this.voteAverage = voteAverageParam;
        this.name = nameParam;
        this.seasonNumber = seasonNumberParam;
        this.id = idParam;
        this.stillPath = stillPathParam;
        this.voteCount = voteCountParam;
        this.crew = crewParam;
        this.guestStars = guestStarsParam;
    }
    
    /**
     * Get value of productionCode.
     *
     * @return String value of productionCode
     */
    @Nullable
    public final String getProductionCode() {
        return this.productionCode;
    }
    
    /**
     * Get value of airDate.
     *
     * @return Date value of airDate
     */
    @Nullable
    public final Date getAirDate() {
        return this.airDate;
    }
    
    /**
     * Get value of overview.
     *
     * @return String value of overview
     */
    @Nullable
    public final String getOverview() {
        return this.overview;
    }
    
    /**
     * Get value of episodeNumber.
     *
     * @return Integer value of episodeNumber
     */
    @Nullable
    public final Integer getEpisodeNumber() {
        return this.episodeNumber;
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
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
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
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }
    
    /**
     * Get value of stillPath.
     *
     * @return String value of stillPath
     */
    @Nullable
    public final String getStillPath() {
        return this.stillPath;
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
     * Get value of crew.
     *
     * @return List<Crew> value of crew
     */
    @NonNull
    public final List<Crew> getCrew() {
        return this.crew;
    }
    
    /**
     * Get value of guestStars.
     *
     * @return List<GuestStars> value of guestStars
     */
    @NonNull
    public final List<GuestStars> getGuestStars() {
        return this.guestStars;
    }

    
    /**
     * Set value of productionCode.
     *
     * @param productionCodeParam
     */
    public final void setProductionCode(@Nullable final String productionCodeParam) {
        this.productionCode = productionCodeParam;
    }
    
    /**
     * Set value of airDate.
     *
     * @param airDateParam
     */
    public final void setAirDate(@Nullable final Date airDateParam) {
        this.airDate = airDateParam;
    }
    
    /**
     * Set value of overview.
     *
     * @param overviewParam
     */
    public final void setOverview(@Nullable final String overviewParam) {
        this.overview = overviewParam;
    }
    
    /**
     * Set value of episodeNumber.
     *
     * @param episodeNumberParam
     */
    public final void setEpisodeNumber(@Nullable final Integer episodeNumberParam) {
        this.episodeNumber = episodeNumberParam;
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
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
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
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of stillPath.
     *
     * @param stillPathParam
     */
    public final void setStillPath(@Nullable final String stillPathParam) {
        this.stillPath = stillPathParam;
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
     * Set value of crew.
     *
     * @param crewParam
     */
    public final void getCrew(@NonNull final List<Crew> crewParam) {
        this.crew = crewParam;
    }
    
    /**
     * Set value of guestStars.
     *
     * @param guestStarsParam
     */
    public final void getGuestStars(@NonNull final List<GuestStars> guestStarsParam) {
        this.guestStars = guestStarsParam;
    }
}
