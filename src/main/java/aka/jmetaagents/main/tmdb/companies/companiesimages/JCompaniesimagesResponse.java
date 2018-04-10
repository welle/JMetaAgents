package aka.jmetaagents.main.tmdb.companies.companiesimages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JCompaniesimagesResponse {

	@Nullable
    private Integer id;
	@NonNull
    private List<Logos> logos = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JCompaniesimagesResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param idParam Integer
     * @param logosParam List<Logos>
     */
    public JCompaniesimagesResponse(@Nullable final Integer idParam, @NonNull final List<Logos> logosParam) {
        this.id = idParam;
        this.logos = logosParam;
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
     * Get value of logos.
     *
     * @return List<Logos> value of logos
     */
    @NonNull
    public final List<Logos> getLogos() {
        return this.logos;
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
     * Set value of logos.
     *
     * @param logosParam
     */
    public final void setLogos(@NonNull final List<Logos> logosParam) {
        this.logos = logosParam;
    }
}
