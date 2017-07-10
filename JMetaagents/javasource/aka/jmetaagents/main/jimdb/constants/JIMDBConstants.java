package aka.jmetaagents.main.jimdb.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * JIMDB related constants.
 *
 * @author Cha
 */
public final class JIMDBConstants {

    /**
     * Movie URL.
     */
    @NonNull
    public static final String MOVIE_URL = "http://app.imdb.com/title/maindetails?";
    /**
     * Search URL.
     */
    @NonNull
    public static final String SEARCH_MOVIE_URL = "http://app.imdb.com/find?";

    /**
     * API.
     */
    @NonNull
    public static final String API = "api";

    /**
     * API ID.
     */
    @NonNull
    public static final String API_ID = "appid";

    /**
     * Sig.
     */
    @NonNull
    public static final String SIG = "sig";

    /**
     * Device.
     */
    @NonNull
    public static final String DEVICE = "device";

    /**
     * TConst.
     */
    @NonNull
    public static final String TCONST = "tconst";
    /**
     * Query.
     */
    @NonNull
    public static final String QUERY = "q";
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

    private JIMDBConstants() {
        // singleton
    }
}
