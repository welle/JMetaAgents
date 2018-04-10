package aka.jmetaagents.main.tmdb.companies.companiesdetails;

import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JCompaniesdetailsQuestion {

    @JsonProperty("company_id")
	@Nullable
    private Integer companyId;

	/**
     * Empty Constructor.
     */
    public JCompaniesdetailsQuestion() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param companyIdParam Integer
     */
    public JCompaniesdetailsQuestion(@Nullable final Integer companyIdParam) {
        this.companyId = companyIdParam;
    }
    
    /**
     * Get value of companyId.
     *
     * @return Integer value of companyId
     */
    @Nullable
    public final Integer getCompanyId() {
        return this.companyId;
    }

    
    /**
     * Set value of companyId.
     *
     * @param companyIdParam
     */
    public final void setCompanyId(@Nullable final Integer companyIdParam) {
        this.companyId = companyIdParam;
    }
}
