package aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshow;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jtmdb.pojo.tvshow.jtvshow.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Seasons {

    @JsonProperty("air_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date airDate;
    @JsonProperty("episode_count")
	@Nullable
    private Integer episodeCount;
    @JsonProperty("season_number")
	@Nullable
    private Integer seasonNumber;
	@Nullable
    private Integer id;
    @JsonProperty("poster_path")
	@Nullable
    private String posterPath;

	/**
     * Empty Constructor.
     */
    public Seasons() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param airDateParam Date
     * @param episodeCountParam Integer
     * @param seasonNumberParam Integer
     * @param idParam Integer
     * @param posterPathParam String
     */
    public Seasons(@Nullable final Date airDateParam, @Nullable final Integer episodeCountParam, @Nullable final Integer seasonNumberParam, @Nullable final Integer idParam, @Nullable final String posterPathParam) {
        this.airDate = airDateParam;
        this.episodeCount = episodeCountParam;
        this.seasonNumber = seasonNumberParam;
        this.id = idParam;
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
     * Get value of episodeCount.
     *
     * @return Integer value of episodeCount
     */
    @Nullable
    public final Integer getEpisodeCount() {
        return this.episodeCount;
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
     * Set value of episodeCount.
     *
     * @param episodeCountParam
     */
    public final void setEpisodeCount(@Nullable final Integer episodeCountParam) {
        this.episodeCount = episodeCountParam;
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
     * Set value of posterPath.
     *
     * @param posterPathParam
     */
    public final void setPosterPath(@Nullable final String posterPathParam) {
        this.posterPath = posterPathParam;
    }
}
