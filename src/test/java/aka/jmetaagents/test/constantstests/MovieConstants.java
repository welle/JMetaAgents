package aka.jmetaagents.test.constantstests;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Movie constants
 */
public final class MovieConstants {

    /**
     * Certification general : {@value}
     */
    public static final String MOVIE_CERTIFICATION_GENERAL = "mpaa_general";
    /**
     * Certification NC17 : {@value}
     */
    public static final String MOVIE_CERTIFICATION_NC17 = "mpaa_nc17";
    /**
     * Certification norated : {@value}
     */
    public static final String MOVIE_CERTIFICATION_NORATED = "mpaa_notrated";
    /**
     * Certification PG : {@value}
     */
    public static final String MOVIE_CERTIFICATION_PG = "mpaa_pg";
    /**
     * Certification PG-13 : {@value}
     */
    public static final String MOVIE_CERTIFICATION_PG13 = "mpaa_pg13";
    /**
     * Certification restricted : {@value}
     */
    public static final String MOVIE_CERTIFICATION_RESTRICTED = "mpaa_restricted";

    /**
     * Mapping between TheMovieDb certification string and {@link MovieConstants} certification constants.
     *
     * Map<String, String> corresponding to TheMovieDb certification as key with media certification as value
     */
    @NonNull
    public static final Map<@NonNull String, String> MOVIEDB_MOVIE_CERTIFICATION_MAP;

    static {
        MOVIEDB_MOVIE_CERTIFICATION_MAP = new HashMap<>();
        MOVIEDB_MOVIE_CERTIFICATION_MAP.put("G", "mpaa_general");
        MOVIEDB_MOVIE_CERTIFICATION_MAP.put("NC17", "mpaa_nc17");
        MOVIEDB_MOVIE_CERTIFICATION_MAP.put("", "mpaa_notrated");
        MOVIEDB_MOVIE_CERTIFICATION_MAP.put("PG", "mpaa_pg");
        MOVIEDB_MOVIE_CERTIFICATION_MAP.put("PG-13", "mpaa_pg13");
        MOVIEDB_MOVIE_CERTIFICATION_MAP.put("R", "mpaa_restricted");
    }

    private MovieConstants() {
        // singleton
    }

}
