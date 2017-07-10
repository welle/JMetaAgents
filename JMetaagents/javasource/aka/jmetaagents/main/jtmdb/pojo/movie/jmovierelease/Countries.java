package aka.jmetaagents.main.jtmdb.pojo.movie.jmovierelease;

import java.util.Date;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import aka.jmetaagents.main.jtmdb.pojo.movie.jmovierelease.deserializers.DateYearMonthDayDashDeserializer;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class Countries {

    @JsonProperty("release_date")
    @JsonDeserialize(using = DateYearMonthDayDashDeserializer.class)
    private Date releaseDate;
    @JsonProperty("iso_3166_1")
	@Nullable
    private String iso31661;
	@Nullable
    private String certification;
	@Nullable
    private Boolean primary;

	/**
     * Empty Constructor.
     */
    public Countries() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param releaseDateParam Date
     * @param iso31661Param String
     * @param certificationParam String
     * @param primaryParam Boolean
     */
    public Countries(@Nullable final Date releaseDateParam, @Nullable final String iso31661Param, @Nullable final String certificationParam, @Nullable final Boolean primaryParam) {
        this.releaseDate = releaseDateParam;
        this.iso31661 = iso31661Param;
        this.certification = certificationParam;
        this.primary = primaryParam;
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
     * Get value of iso31661.
     *
     * @return String value of iso31661
     */
    @Nullable
    public final String getIso31661() {
        return this.iso31661;
    }
    
    /**
     * Get value of certification.
     *
     * @return String value of certification
     */
    @Nullable
    public final String getCertification() {
        return this.certification;
    }
    
    /**
     * Get value of primary.
     *
     * @return Boolean value of primary
     */
    @Nullable
    public final Boolean getPrimary() {
        return this.primary;
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
     * Set value of iso31661.
     *
     * @param iso31661Param
     */
    public final void setIso31661(@Nullable final String iso31661Param) {
        this.iso31661 = iso31661Param;
    }
    
    /**
     * Set value of certification.
     *
     * @param certificationParam
     */
    public final void setCertification(@Nullable final String certificationParam) {
        this.certification = certificationParam;
    }
    
    /**
     * Set value of primary.
     *
     * @param primaryParam
     */
    public final void setPrimary(@Nullable final Boolean primaryParam) {
        this.primary = primaryParam;
    }
}
