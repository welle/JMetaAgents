package aka.jmetaagents.main.jallocine.pojo.jmovie;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jmovie.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Period {

    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date dateStart;
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date dateEnd;

	/**
     * Empty Constructor.
     */
    public Period() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dateStartParam Date
     * @param dateEndParam Date
     */
    public Period(@Nullable final Date dateStartParam, @Nullable final Date dateEndParam) {
        this.dateStart = dateStartParam;
        this.dateEnd = dateEndParam;
    }
    
    /**
     * Get value of dateStart.
     *
     * @return Date value of dateStart
     */
    @Nullable
    public final Date getDateStart() {
        return this.dateStart;
    }
    
    /**
     * Get value of dateEnd.
     *
     * @return Date value of dateEnd
     */
    @Nullable
    public final Date getDateEnd() {
        return this.dateEnd;
    }

    
    /**
     * Set value of dateStart.
     *
     * @param dateStartParam
     */
    public final void setDateStart(@Nullable final Date dateStartParam) {
        this.dateStart = dateStartParam;
    }
    
    /**
     * Set value of dateEnd.
     *
     * @param dateEndParam
     */
    public final void setDateEnd(@Nullable final Date dateEndParam) {
        this.dateEnd = dateEndParam;
    }
}
