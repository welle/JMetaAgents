package aka.jmetaagents.main.jrottentomatoes.pojo.jmovie;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jrottentomatoes.pojo.jmovie.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class ReleaseDates {

    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date dvd;
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date theater;

	/**
     * Empty Constructor.
     */
    public ReleaseDates() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dvdParam Date
     * @param theaterParam Date
     */
    public ReleaseDates(@Nullable final Date dvdParam, @Nullable final Date theaterParam) {
        this.dvd = dvdParam;
        this.theater = theaterParam;
    }
    
    /**
     * Get value of dvd.
     *
     * @return Date value of dvd
     */
    @Nullable
    public final Date getDvd() {
        return this.dvd;
    }
    
    /**
     * Get value of theater.
     *
     * @return Date value of theater
     */
    @Nullable
    public final Date getTheater() {
        return this.theater;
    }

    
    /**
     * Set value of dvd.
     *
     * @param dvdParam
     */
    public final void setDvd(@Nullable final Date dvdParam) {
        this.dvd = dvdParam;
    }
    
    /**
     * Set value of theater.
     *
     * @param theaterParam
     */
    public final void setTheater(@Nullable final Date theaterParam) {
        this.theater = theaterParam;
    }
}
