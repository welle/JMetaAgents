package aka.jmetaagents.main.tmdb.tv.tvdetails;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class ProductionCompanies {

    @JsonProperty("logo_path")
	@Nullable
    private String logoPath;
	@Nullable
    private String name;
	@Nullable
    private Integer id;
    @JsonProperty("origin_country")
	@Nullable
    private String originCountry;

	/**
     * Empty Constructor.
     */
    public ProductionCompanies() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param logoPathParam String
     * @param nameParam String
     * @param idParam Integer
     * @param originCountryParam String
     */
    public ProductionCompanies(@Nullable final String logoPathParam, @Nullable final String nameParam, @Nullable final Integer idParam, @Nullable final String originCountryParam) {
        this.logoPath = logoPathParam;
        this.name = nameParam;
        this.id = idParam;
        this.originCountry = originCountryParam;
    }
    
    /**
     * Get value of logoPath.
     *
     * @return String value of logoPath
     */
    @Nullable
    public final String getLogoPath() {
        return this.logoPath;
    }
    
    /**
     * Get value of name.
     *
     * @return String value of name
     */
    @Nullable
    public final String getName() {
        return this.name;
    }
    
    /**
     * Get value of id.
     *
     * @return Integer value of id
     */
    @Nullable
    public final Integer getId() {
        return this.id;
    }
    
    /**
     * Get value of originCountry.
     *
     * @return String value of originCountry
     */
    @Nullable
    public final String getOriginCountry() {
        return this.originCountry;
    }

    
    /**
     * Set value of logoPath.
     *
     * @param logoPathParam
     */
    public final void setLogoPath(@Nullable final String logoPathParam) {
        this.logoPath = logoPathParam;
    }
    
    /**
     * Set value of name.
     *
     * @param nameParam
     */
    public final void setName(@Nullable final String nameParam) {
        this.name = nameParam;
    }
    
    /**
     * Set value of id.
     *
     * @param idParam
     */
    public final void setId(@Nullable final Integer idParam) {
        this.id = idParam;
    }
    
    /**
     * Set value of originCountry.
     *
     * @param originCountryParam
     */
    public final void setOriginCountry(@Nullable final String originCountryParam) {
        this.originCountry = originCountryParam;
    }
}
