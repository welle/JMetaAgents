package aka.jmetaagents.main.tmdb.genres.genresgetmovies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This is a generated file.
 *
 * @author Welle
 */ 
@JsonIgnoreProperties(ignoreUnknown = true) 
public final class JGenresgetmoviesResponse {

	@NonNull
    private List<Genres> genres = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JGenresgetmoviesResponse() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param genresParam List<Genres>
     */
    public JGenresgetmoviesResponse(@NonNull final List<Genres> genresParam) {
        this.genres = genresParam;
    }
    
    /**
     * Get value of genres.
     *
     * @return List<Genres> value of genres
     */
    @NonNull
    public final List<Genres> getGenres() {
        return this.genres;
    }

    
    /**
     * Set value of genres.
     *
     * @param genresParam
     */
    public final void setGenres(@NonNull final List<Genres> genresParam) {
        this.genres = genresParam;
    }
}
