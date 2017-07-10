package aka.jmetaagents.main.jallocine.pojo.jperson;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jallocine.pojo.jperson.deserializers.DateYearMonthDayTHourDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Publication2 {

    @JsonDeserialize(using = DateYearMonthDayTHourDashDeserializer.class)
    private Date dateStart;

	/**
     * Empty Constructor.
     */
    public Publication2() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param dateStartParam Date
     */
    public Publication2(@Nullable final Date dateStartParam) {
        this.dateStart = dateStartParam;
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
     * Set value of dateStart.
     *
     * @param dateStartParam
     */
    public final void setDateStart(@Nullable final Date dateStartParam) {
        this.dateStart = dateStartParam;
    }
}
