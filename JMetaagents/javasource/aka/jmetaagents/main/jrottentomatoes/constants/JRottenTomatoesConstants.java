package aka.jmetaagents.main.jrottentomatoes.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * JRottenTomatoes related constants.
 *
 * @author Cha
 */
public final class JRottenTomatoesConstants {

    /**
     * Movie URL.
     */
    @NonNull
    public final static String MOVIE_URL = "http://api.rottentomatoes.com/api/public/v1.0/movies/";
    /**
     * Movie alias URL.
     */
    @NonNull
    public final static String MOVIE_ALIAS_URL = "http://api.rottentomatoes.com/api/public/v1.0/movie_alias.json?";
    /**
     * Search movie URL.
     */
    @NonNull
    public final static String SEARCH_MOVIE_URL = "http://api.rottentomatoes.com/api/public/v1.0/movies.json?";

    /**
     * Type.
     */
    @NonNull
    static public final String TYPE = "type";
    /**
     * Type value.
     */
    @NonNull
    static public final String TYPE_VALUE = "imdb";

    /**
     * Starting IMDB Id.
     */
    @NonNull
    static public final String TT = "tt";
    /**
     * API key.
     */
    @NonNull
    static public final String API_KEY = "apikey";
    /**
     * Id.
     */
    @NonNull
    static public final String ID = "id";
    /**
     * Query.
     */
    @NonNull
    static public final String QUERY = "q";
    /**
     * Page limit.
     */
    @NonNull
    static public final String PAGE_LIMIT = "page_limit";
    /**
     * Page.
     */
    @NonNull
    static public final String PAGE = "page";
    /**
     * Limit.
     */
    @NonNull
    static public final String LIMIT = "limit";

    /**
     * release tag for rotten tomatoes.
     */
    @NonNull
    public static final String ROTTENTOMATOES_MOVIE_RELEASEDATE = "theater";

    /**
     * original tag for rotten tomatoes.
     */
    @NonNull
    public static final String ROTTENTOMATOES_MOVIE_POSTER = "original";

    private JRottenTomatoesConstants() {
        // singleton
    }

}
