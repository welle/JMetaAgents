package aka.jmetaagents.main.tmdb.movies.moviesalternativetitles;

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
public final class JMoviesalternativetitlesResponse {

	@Nullable
    private Integer id;
	@NonNull
    private List<Titles> titles = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JMoviesalternativetitlesResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param idParam Integer
     * @param titlesParam List<Titles>
     */
    public JMoviesalternativetitlesResponse(@Nullable final Integer idParam, @NonNull final List<Titles> titlesParam) {
        this.id = idParam;
        this.titles = titlesParam;
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
     * Get value of titles.
     *
     * @return List<Titles> value of titles
     */
    @NonNull
    public final List<Titles> getTitles() {
        return this.titles;
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
     * Set value of titles.
     *
     * @param titlesParam
     */
    public final void setTitles(@NonNull final List<Titles> titlesParam) {
        this.titles = titlesParam;
    }
}
