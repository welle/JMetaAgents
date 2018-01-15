package aka.jmetaagents.main.jtmdb.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * JTMDB related constants.
 *
 * @author Cha
 */
public final class JTMDBConstants {

    /**
     * Collection URL.
     */
    @NonNull
    public static final String COLLECTION_URL = "http://api.themoviedb.org/3/collection/";
    /**
     * Movie URL.
     */
    @NonNull
    public static final String MOVIE_URL = "http://api.themoviedb.org/3/movie/";
    /**
     * TV Show URL.
     */
    @NonNull
    public static final String TV_SHOW_URL = "http://api.themoviedb.org/3/tv/";
    /**
     * Popular movies URL.
     */
    @NonNull
    public static final String MOVIE_POPULAR_URL = "http://api.themoviedb.org/3/movie/popular";
    /**
     * TV Show URL.
     */
    @NonNull
    public static final String TV_SHOW_POPULAR_URL = "http://api.themoviedb.org/3/tv/popular";
    /**
     * Top rated movies URL.
     */
    @NonNull
    public static final String MOVIE_TOP_RATED_URL = "http://api.themoviedb.org/3/movie/top_rated";
    /**
     * Top rated TV shows URL.
     */
    @NonNull
    public static final String TV_SHOW_TOP_RATED_URL = "http://api.themoviedb.org/3/tv/top_rated";
    /**
     * Person URL.
     */
    @NonNull
    public static final String PERSON_URL = "http://api.themoviedb.org/3/person/";
    /**
     * Search movies URL.
     */
    @NonNull
    public static final String SEARCH_MOVIE = "http://api.themoviedb.org/3/search/movie";
    /**
     * Search persons URL.
     */
    @NonNull
    public static final String SEARCH_PERSON = "http://api.themoviedb.org/3/search/person";
    /**
     * Search collections URL.
     */
    @NonNull
    public static final String SEARCH_COLLECTION = "http://api.themoviedb.org/3/search/collection";
    /**
     * Search TV Shows URL.
     */
    @NonNull
    public static final String SEARCH_TV_SHOWS = "http://api.themoviedb.org/3/search/tv";
    /**
     * Image URL.
     */
    @NonNull
    public static final String IMAGE_URL = "http://cf2.imgobject.com/t/p/original";

    /**
     * API KEY.
     */
    @NonNull
    public static final String API_KEY = "api_key";
    /**
     * Language.
     */
    @NonNull
    public static final String LANGUAGE = "language";
    /**
     * Country.
     */
    @NonNull
    public static final String COUNTRY = "country";
    /**
     * Query.
     */
    @NonNull
    public static final String QUERY = "query";
    /**
     * Query.
     */
    @NonNull
    public static final String PAGE = "page";

    /**
     * Screenplay tag for The movie DB.
     */
    @NonNull
    public static final String THE_MOVIE_DB_JOB_SCREENPLAY = "Screenplay";

    /**
     * Director tag for The movie DB.
     */
    @NonNull
    public static final String THE_MOVIE_DB_JOB_DIRECTOR = "Director";

    private JTMDBConstants() {
        // singleton
    }
}
