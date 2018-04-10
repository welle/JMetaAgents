package aka.jmetaagents.main.tmdb.tv.season.tvseasondetails;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.tmdb.tv.season.tvseasondetails.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JTvseasondetailsResponse {

    @JsonProperty("air_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date airDate;
	@Nullable
    private String overview;
	@Nullable
    private String name;
    @JsonProperty("season_number")
	@Nullable
    private Integer seasonNumber;
    @JsonProperty("_id")
	@Nullable
    private String id;
    @JsonProperty("id")
	@Nullable
    private Integer id1;
	@NonNull
    private List<Episodes> episodes = new ArrayList<>();
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;

	/**
     * Empty Constructor.
     */
    public JTvseasondetailsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param airDateParam Date
     * @param overviewParam String
     * @param nameParam String
     * @param seasonNumberParam Integer
     * @param idParam String
     * @param id1Param Integer
     * @param episodesParam List<Episodes>
     * @param posterPathParam String
     */
    public JTvseasondetailsResponse(@Nullable final Date airDateParam, @Nullable final String overviewParam, @Nullable final String nameParam, @Nullable final Integer seasonNumberParam, @Nullable final String idParam, @Nullable final Integer id1Param, @NonNull final List<Episodes> episodesParam, @Nullable final String posterPathParam) {
        this.airDate = airDateParam;
        this.overview = overviewParam;
        this.name = nameParam;
        this.seasonNumber = seasonNumberParam;
        this.id = idParam;
        this.id1 = id1Param;
        this.episodes = episodesParam;
        this.posterPath = posterPathParam;
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
     * @return String value of id
     */
    @Nullable
    public final String getId() {
        return this.id;
    }
    
    /**
     * Get value of id1.
     *
     * @return Integer value of id1
     */
    @Nullable
    public final Integer getId1() {
        return this.id1;
    }
    
    /**
     * Get value of episodes.
     *
     * @return List<Episodes> value of episodes
     */
    @NonNull
    public final List<Episodes> getEpisodes() {
        return this.episodes;
    }
    
    /**
     * Get value of posterPath.
     *
     * @return String value of posterPath
     */
    @Nullable
    public final String getPosterPath() {
        return this.posterPath;
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
    public final void setId(@Nullable final String idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of id1.
     *
     * @param id1Param
     */
    public final void setId1(@Nullable final Integer id1Param) {
        this.id1 = id1Param;
    }
    
    /**
     * Set value of episodes.
     *
     * @param episodesParam
     */
    public final void setEpisodes(@NonNull final List<Episodes> episodesParam) {
        this.episodes = episodesParam;
    }
    
    /**
     * Set value of posterPath.
     *
     * @param posterPathParam
     */
    public final void setPosterPath(@Nullable final String posterPathParam) {
        this.posterPath = posterPathParam;
    }
}
