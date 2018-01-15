package aka.jmetaagents.main.jallocine.pojo.jmovie;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class BoxOffice {

	@Nullable
    private Period period;
	@Nullable
    private Integer week;
	@Nullable
    private Integer theaterCount;
    @JsonProperty("country")
	@Nullable
    private Country1 country1;
	@Nullable
    private Integer admissionCount;
    @JsonProperty("type")
	@Nullable
    private Type1 type1;

	/**
     * Empty Constructor.
     */
    public BoxOffice() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param periodParam Period
     * @param weekParam Integer
     * @param theaterCountParam Integer
     * @param country1Param Country1
     * @param admissionCountParam Integer
     * @param type1Param Type1
     */
    public BoxOffice(@Nullable final Period periodParam, @Nullable final Integer weekParam, @Nullable final Integer theaterCountParam, @Nullable final Country1 country1Param, @Nullable final Integer admissionCountParam, @Nullable final Type1 type1Param) {
        this.period = periodParam;
        this.week = weekParam;
        this.theaterCount = theaterCountParam;
        this.country1 = country1Param;
        this.admissionCount = admissionCountParam;
        this.type1 = type1Param;
    }
    
    /**
     * Get value of period.
     *
     * @return Period value of period
     */
    @Nullable
    public final Period getPeriod() {
        return this.period;
    }
    
    /**
     * Get value of week.
     *
     * @return Integer value of week
     */
    @Nullable
    public final Integer getWeek() {
        return this.week;
    }
    
    /**
     * Get value of theaterCount.
     *
     * @return Integer value of theaterCount
     */
    @Nullable
    public final Integer getTheaterCount() {
        return this.theaterCount;
    }
    
    /**
     * Get value of country1.
     *
     * @return Country1 value of country1
     */
    @Nullable
    public final Country1 getCountry1() {
        return this.country1;
    }
    
    /**
     * Get value of admissionCount.
     *
     * @return Integer value of admissionCount
     */
    @Nullable
    public final Integer getAdmissionCount() {
        return this.admissionCount;
    }
    
    /**
     * Get value of type1.
     *
     * @return Type1 value of type1
     */
    @Nullable
    public final Type1 getType1() {
        return this.type1;
    }

    
    /**
     * Set value of period.
     *
     * @param periodParam
     */
    public final void setPeriod(@Nullable final Period periodParam) {
        this.period = periodParam;
    }
    
    /**
     * Set value of week.
     *
     * @param weekParam
     */
    public final void setWeek(@Nullable final Integer weekParam) {
        this.week = weekParam;
    }
    
    /**
     * Set value of theaterCount.
     *
     * @param theaterCountParam
     */
    public final void setTheaterCount(@Nullable final Integer theaterCountParam) {
        this.theaterCount = theaterCountParam;
    }
    
    /**
     * Set value of country1.
     *
     * @param country1Param
     */
    public final void setCountry1(@Nullable final Country1 country1Param) {
        this.country1 = country1Param;
    }
    
    /**
     * Set value of admissionCount.
     *
     * @param admissionCountParam
     */
    public final void setAdmissionCount(@Nullable final Integer admissionCountParam) {
        this.admissionCount = admissionCountParam;
    }
    
    /**
     * Set value of type1.
     *
     * @param type1Param
     */
    public final void setType1(@Nullable final Type1 type1Param) {
        this.type1 = type1Param;
    }
}
