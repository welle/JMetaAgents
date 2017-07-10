package aka.jmetaagents.main.jallocine.pojo.jtvshowepisode;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jallocine.pojo.jtvshowepisode.deserializers.DateYearMonthDayTHourDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Broadcast {

    @JsonDeserialize(using = DateYearMonthDayTHourDashDeserializer.class)
    private Date datetime;
	@Nullable
    private ParentChannel parentChannel;

	/**
     * Empty Constructor.
     */
    public Broadcast() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param datetimeParam Date
     * @param parentChannelParam ParentChannel
     */
    public Broadcast(@Nullable final Date datetimeParam, @Nullable final ParentChannel parentChannelParam) {
        this.datetime = datetimeParam;
        this.parentChannel = parentChannelParam;
    }
    
    /**
     * Get value of datetime.
     *
     * @return Date value of datetime
     */
    @Nullable
    public final Date getDatetime() {
        return this.datetime;
    }
    
    /**
     * Get value of parentChannel.
     *
     * @return ParentChannel value of parentChannel
     */
    @Nullable
    public final ParentChannel getParentChannel() {
        return this.parentChannel;
    }

    
    /**
     * Set value of datetime.
     *
     * @param datetimeParam
     */
    public final void setDatetime(@Nullable final Date datetimeParam) {
        this.datetime = datetimeParam;
    }
    
    /**
     * Set value of parentChannel.
     *
     * @param parentChannelParam
     */
    public final void setParentChannel(@Nullable final ParentChannel parentChannelParam) {
        this.parentChannel = parentChannelParam;
    }
}
