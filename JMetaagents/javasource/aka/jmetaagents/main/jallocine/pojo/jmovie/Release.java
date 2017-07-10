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
public final class Release {

	@Nullable
    private Country country;
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date releaseDate;
	@Nullable
    private ReleaseState releaseState;
	@Nullable
    private Distributor distributor;

	/**
     * Empty Constructor.
     */
    public Release() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param countryParam Country
     * @param releaseDateParam Date
     * @param releaseStateParam ReleaseState
     * @param distributorParam Distributor
     */
    public Release(@Nullable final Country countryParam, @Nullable final Date releaseDateParam, @Nullable final ReleaseState releaseStateParam, @Nullable final Distributor distributorParam) {
        this.country = countryParam;
        this.releaseDate = releaseDateParam;
        this.releaseState = releaseStateParam;
        this.distributor = distributorParam;
    }
    
    /**
     * Get value of country.
     *
     * @return Country value of country
     */
    @Nullable
    public final Country getCountry() {
        return this.country;
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
     * Get value of releaseState.
     *
     * @return ReleaseState value of releaseState
     */
    @Nullable
    public final ReleaseState getReleaseState() {
        return this.releaseState;
    }
    
    /**
     * Get value of distributor.
     *
     * @return Distributor value of distributor
     */
    @Nullable
    public final Distributor getDistributor() {
        return this.distributor;
    }

    
    /**
     * Set value of country.
     *
     * @param countryParam
     */
    public final void setCountry(@Nullable final Country countryParam) {
        this.country = countryParam;
    }
    
    /**
     * Set value of releaseDate.
     *
     * @param releaseDateParam
     */
    public final void setReleaseDate(@Nullable final Date releaseDateParam) {
        this.releaseDate = releaseDateParam;
    }
    
    /**
     * Set value of releaseState.
     *
     * @param releaseStateParam
     */
    public final void setReleaseState(@Nullable final ReleaseState releaseStateParam) {
        this.releaseState = releaseStateParam;
    }
    
    /**
     * Set value of distributor.
     *
     * @param distributorParam
     */
    public final void setDistributor(@Nullable final Distributor distributorParam) {
        this.distributor = distributorParam;
    }
}
