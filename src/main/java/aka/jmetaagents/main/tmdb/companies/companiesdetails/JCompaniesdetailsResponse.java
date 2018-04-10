package aka.jmetaagents.main.tmdb.companies.companiesdetails;

import java.net.URI;
import org.eclipse.jdt.annotation.Nullable;
import aka.jmetaagents.main.tmdb.companies.companiesdetails.deserializers.URLDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JCompaniesdetailsResponse {

	@Nullable
    private String headquarters;
    @JsonProperty("parent_company")
	@Nullable
    private String parentCompany;
    @JsonProperty("logo_path")
	@Nullable
    private String logoPath;
	@Nullable
    private String name;
	@Nullable
    private String description;
	@Nullable
    private Integer id;
    @JsonDeserialize(using = URLDeserializer.class)
    private URI homepage;
    @JsonProperty("origin_country")
	@Nullable
    private String originCountry;

	/**
     * Empty Constructor.
     */
    public JCompaniesdetailsResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param headquartersParam String
     * @param parentCompanyParam String
     * @param logoPathParam String
     * @param nameParam String
     * @param descriptionParam String
     * @param idParam Integer
     * @param homepageParam URI
     * @param originCountryParam String
     */
    public JCompaniesdetailsResponse(@Nullable final String headquartersParam, @Nullable final String parentCompanyParam, @Nullable final String logoPathParam, @Nullable final String nameParam, @Nullable final String descriptionParam, @Nullable final Integer idParam, @Nullable final URI homepageParam, @Nullable final String originCountryParam) {
        this.headquarters = headquartersParam;
        this.parentCompany = parentCompanyParam;
        this.logoPath = logoPathParam;
        this.name = nameParam;
        this.description = descriptionParam;
        this.id = idParam;
        this.homepage = homepageParam;
        this.originCountry = originCountryParam;
    }
    
    /**
     * Get value of headquarters.
     *
     * @return String value of headquarters
     */
    @Nullable
    public final String getHeadquarters() {
        return this.headquarters;
    }
    
    /**
     * Get value of parentCompany.
     *
     * @return String value of parentCompany
     */
    @Nullable
    public final String getParentCompany() {
        return this.parentCompany;
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
     * Get value of description.
     *
     * @return String value of description
     */
    @Nullable
    public final String getDescription() {
        return this.description;
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
     * Get value of homepage.
     *
     * @return URI value of homepage
     */
    @Nullable
    public final URI getHomepage() {
        return this.homepage;
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
     * Set value of headquarters.
     *
     * @param headquartersParam
     */
    public final void setHeadquarters(@Nullable final String headquartersParam) {
        this.headquarters = headquartersParam;
    }
    
    /**
     * Set value of parentCompany.
     *
     * @param parentCompanyParam
     */
    public final void setParentCompany(@Nullable final String parentCompanyParam) {
        this.parentCompany = parentCompanyParam;
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
     * Set value of description.
     *
     * @param descriptionParam
     */
    public final void setDescription(@Nullable final String descriptionParam) {
        this.description = descriptionParam;
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
     * Set value of homepage.
     *
     * @param homepageParam
     */
    public final void setHomepage(@Nullable final URI homepageParam) {
        this.homepage = homepageParam;
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
