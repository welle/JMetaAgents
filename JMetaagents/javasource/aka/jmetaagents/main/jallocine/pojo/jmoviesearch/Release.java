package aka.jmetaagents.main.jallocine.pojo.jmoviesearch;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jmoviesearch.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Release {

    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date releaseDate;

	/**
     * Empty Constructor.
     */
    public Release() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param releaseDateParam Date
     */
    public Release(@Nullable final Date releaseDateParam) {
        this.releaseDate = releaseDateParam;
    }
    
    /**
     * Get value of releaseDate.
     *
     * @return Date value of releaseDate
     */
    @Nullable
    public final Date getReleaseDate() {
        return this.releaseDate;
    }

    
    /**
     * Set value of releaseDate.
     *
     * @param releaseDateParam
     */
    public final void setReleaseDate(@Nullable final Date releaseDateParam) {
        this.releaseDate = releaseDateParam;
    }
}
