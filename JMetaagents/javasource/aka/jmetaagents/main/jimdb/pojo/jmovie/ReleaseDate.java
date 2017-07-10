package aka.jmetaagents.main.jimdb.pojo.jmovie;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.jimdb.pojo.jmovie.deserializers.DateYearMonthDayDashDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class ReleaseDate {

    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date normal;

	/**
     * Empty Constructor.
     */
    public ReleaseDate() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param normalParam Date
     */
    public ReleaseDate(@Nullable final Date normalParam) {
        this.normal = normalParam;
    }
    
    /**
     * Get value of normal.
     *
     * @return Date value of normal
     */
    @Nullable
    public final Date getNormal() {
        return this.normal;
    }

    
    /**
     * Set value of normal.
     *
     * @param normalParam
     */
    public final void setNormal(@Nullable final Date normalParam) {
        this.normal = normalParam;
    }
}
