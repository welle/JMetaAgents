package aka.jmetaagents.main.tvdb.series.seriesidactors;

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
public final class Errors {

	@Nullable
    private String invalidLanguage;
	@NonNull
    private List<String> invalidQueryParams = new ArrayList<>();
	@NonNull
    private List<String> invalidFilters = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public Errors() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param invalidLanguageParam String
     * @param invalidQueryParamsParam List<String>
     * @param invalidFiltersParam List<String>
     */
    public Errors(@Nullable final String invalidLanguageParam, @NonNull final List<String> invalidQueryParamsParam, @NonNull final List<String> invalidFiltersParam) {
        this.invalidLanguage = invalidLanguageParam;
        this.invalidQueryParams = invalidQueryParamsParam;
        this.invalidFilters = invalidFiltersParam;
    }
    
    /**
     * Get value of invalidLanguage.
     *
     * @return String value of invalidLanguage
     */
    @Nullable
    public final String getInvalidLanguage() {
        return this.invalidLanguage;
    }
    
    /**
     * Get value of invalidQueryParams.
     *
     * @return List<String> value of invalidQueryParams
     */
    @NonNull
    public final List<String> getInvalidQueryParams() {
        return this.invalidQueryParams;
    }
    
    /**
     * Get value of invalidFilters.
     *
     * @return List<String> value of invalidFilters
     */
    @NonNull
    public final List<String> getInvalidFilters() {
        return this.invalidFilters;
    }

    
    /**
     * Set value of invalidLanguage.
     *
     * @param invalidLanguageParam
     */
    public final void setInvalidLanguage(@Nullable final String invalidLanguageParam) {
        this.invalidLanguage = invalidLanguageParam;
    }
    
    /**
     * Set value of invalidQueryParams.
     *
     * @param invalidQueryParamsParam
     */
    public final void setInvalidQueryParams(@NonNull final List<String> invalidQueryParamsParam) {
        this.invalidQueryParams = invalidQueryParamsParam;
    }
    
    /**
     * Set value of invalidFilters.
     *
     * @param invalidFiltersParam
     */
    public final void setInvalidFilters(@NonNull final List<String> invalidFiltersParam) {
        this.invalidFilters = invalidFiltersParam;
    }
}
