package aka.jmetaagents.main.jtmdb.pojo.movie.jmovierelease;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Charlotte
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JMovieRelease {

	@Nullable
    private Integer id;
	@NonNull
    private List<Countries> countries = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JMovieRelease() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param idParam Integer
     * @param countriesParam List<Countries>
     */
    public JMovieRelease(@Nullable final Integer idParam, @NonNull final List<Countries> countriesParam) {
        this.id = idParam;
        this.countries = countriesParam;
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
     * Get value of countries.
     *
     * @return List<Countries> value of countries
     */
    @NonNull
    public final List<Countries> getCountries() {
        return this.countries;
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
     * Set value of countries.
     *
     * @param countriesParam
     */
    public final void getCountries(@NonNull final List<Countries> countriesParam) {
        this.countries = countriesParam;
    }
}
