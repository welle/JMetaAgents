package aka.jmetaagents.main.jtmdb.pojo.movie.jmovietrailer;

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
public final class JMovieTrailer {

	@NonNull
    private List<Youtube> youtube = new ArrayList<>();
	@Nullable
    private Integer id;
	@NonNull
    private List<String> quicktime = new ArrayList<>();

	/**
     * Empty Constructor.
     */
    public JMovieTrailer() {
    	// Nothing to do
    }

    /**
     * Filling Constructor.
     *
     * @param youtubeParam List<Youtube>
     * @param idParam Integer
     * @param quicktimeParam List<String>
     */
    public JMovieTrailer(@NonNull final List<Youtube> youtubeParam, @Nullable final Integer idParam, @NonNull final List<String> quicktimeParam) {
        this.youtube = youtubeParam;
        this.id = idParam;
        this.quicktime = quicktimeParam;
    }
    
    /**
     * Get value of youtube.
     *
     * @return List<Youtube> value of youtube
     */
    @NonNull
    public final List<Youtube> getYoutube() {
        return this.youtube;
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
     * Get value of quicktime.
     *
     * @return List<String> value of quicktime
     */
    @NonNull
    public final List<String> getQuicktime() {
        return this.quicktime;
    }

    
    /**
     * Set value of youtube.
     *
     * @param youtubeParam
     */
    public final void getYoutube(@NonNull final List<Youtube> youtubeParam) {
        this.youtube = youtubeParam;
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
     * Set value of quicktime.
     *
     * @param quicktimeParam
     */
    public final void getQuicktime(@NonNull final List<String> quicktimeParam) {
        this.quicktime = quicktimeParam;
    }
}
