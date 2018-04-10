package aka.jmetaagents.main.tmdb.credits.creditsdetails;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.tmdb.credits.creditsdetails.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Seasons {

    @JsonProperty("air_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date airDate;
    @JsonProperty("season_number")
	@Nullable
    private Integer seasonNumber;
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
     * @param seasonNumberParam Integer
     * @param posterPathParam String
     */
    public Seasons(@Nullable final Date airDateParam, @Nullable final Integer seasonNumberParam, @Nullable final String posterPathParam) {
        this.airDate = airDateParam;
        this.seasonNumber = seasonNumberParam;
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
     * Get value of seasonNumber.
     *
     * @return Integer value of seasonNumber
     */
    @Nullable
    public final Integer getSeasonNumber() {
        return this.seasonNumber;
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
     * Set value of seasonNumber.
     *
     * @param seasonNumberParam
     */
    public final void setSeasonNumber(@Nullable final Integer seasonNumberParam) {
        this.seasonNumber = seasonNumberParam;
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
