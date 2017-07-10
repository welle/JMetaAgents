package aka.jmetaagents.main.jallocine.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * All constants related to JAllocine.
 *
 * @author Cha
 */
public final class JAllocineConstants {

    /**
     * Movie URL.
     */
    @NonNull
    public static final String MOVIE_URL = "http://api.allocine.fr/rest/v3/movie?";
    /**
     * TV Show URL.
     */
    @NonNull
    public static final String TV_SHOW_URL = "http://api.allocine.fr/rest/v3/tvseries?";
    /**
     * TV Show season URL.
     */
    @NonNull
    public static final String TV_SHOW_SEASON_URL = "http://api.allocine.fr/rest/v3/season?";
    /**
     * TV Show episode URL.
     */
    @NonNull
    public static final String TV_SHOW_EPISODE_URL = "http://api.allocine.fr/rest/v3/episode?";
    /**
     * Person URL.
     */
    @NonNull
    public static final String PERSON_URL = "http://api.allocine.fr/rest/v3/person?";
    /**
     * Filmography URL.
     */
    @NonNull
    public static final String FILMO_URL = "http://api.allocine.fr/rest/v3/filmography?";
    /**
     * Search URL.
     */
    @NonNull
    public static final String SEARCH_URL = "http://api.allocine.fr/rest/v3/search?";
    /**
     * Image URL.
     */
    @NonNull
    public static final String IMAGE_URL = "http:\\images.allocine.fr";

    /**
     * Profile.
     */
    @NonNull
    public static final String PROFILE = "profile";
    /**
     * Profile value.
     */
    @NonNull
    public static final String PROFILE_VALUE = "large";

    /**
     * Format.
     */
    @NonNull
    public static final String FORMAT = "format";
    /**
     * Format value.
     */
    @NonNull
    public static final String FORMAT_VALUE = "json";

    /**
     * Partner key.
     */
    @NonNull
    public static final String PARTNER = "partner";

    /**
     * Media.
     */
    @NonNull
    public static final String MEDIAFMT = "mediafmt";
    /**
     * Media value.
     */
    @NonNull
    public static final String MEDIAFMT_VALUE = "mp4-lc";

    /**
     * Filter.
     */
    @NonNull
    public static final String FILTER = "filter";
    /**
     * Filter movie.
     */
    @NonNull
    public static final String FILTER_MOVIE = "movie";
    /**
     * Filter TV show.
     */
    @NonNull
    public static final String FILTER_TV_SHOW = "tvseries";
    /**
     * Filter person.
     */
    @NonNull
    public static final String FILTER_PERSON = "person";

    /**
     * Code.
     */
    @NonNull
    public static final String CODE = "code";
    /**
     * Count.
     */
    @NonNull
    public static final String COUNT = "count";
    /**
     * Page.
     */
    @NonNull
    public static final String PAGE = "page";
    /**
     * Query value.
     */
    @NonNull
    public static final String QUERY = "q";

    /**
     * Activity code for Actor.
     */
    public static final int ACTOR_ACTIVITY_CODE = 8001;
    /**
     * Activity code for director.
     */
    public static final int DIRECTOR_ACTIVITY_CODE = 8002;
    /**
     * Activity code for writer.
     */
    public static final int WRITER_ACTIVITY_CODE = 8004;
    /**
     * Activity code for script.
     */
    public static final int SCRIPT_ACTIVITY_CODE = 8043;
    /**
     * Code for poster media.
     */
    public static final int POSTER_MEDIA_CODE = 31001;

    private JAllocineConstants() {
        // singleton
    }
}
