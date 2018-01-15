package aka.jmetaagents.test.resource;

import org.eclipse.jdt.annotation.NonNull;

/**
 * List of constants for the differents helpers.
 *
 * @author Charlotte
 *
 */
public final class MetaagentConstants {

    /**
     * The movie DB API key.
     */
    @NonNull
    public static final String THE_MOVIE_DB_API_KEY = "807efd13f0a812f03dba245d261e2b65";

    /**
     * The allocine DB API key.
     */
    @NonNull
    public static final String ALLOCINE_API_KEY = "${ALLOCINEAPIKEY_VALUE}";

    /**
     * TVDB API key value.
     */
    @NonNull
    public static final String TVDB_API_KEY = "${TVDB_API_KEY_VALUE}";

    /**
     * TVDB Username value.
     */
    @NonNull
    public static final String TVDB_USERNAME = "${TVDB_USERNAME_VALUE}";

    /**
     * TVDB User key value.
     */
    @NonNull
    public static final String TVDB_USER_KEY = "${TVDB_USER_KEY_VALUE}";

    private MetaagentConstants() {
        // singleton
    }
}
