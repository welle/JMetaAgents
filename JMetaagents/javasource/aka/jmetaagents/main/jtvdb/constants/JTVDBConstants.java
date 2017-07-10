package aka.jmetaagents.main.jtvdb.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * JTVDB related constants.
 *
 * @author Cha
 */
public final class JTVDBConstants {

    /**
     * Login URL.
     */
    @NonNull
    public static final String LOGIN_URL = "https://api-beta.thetvdb.com/login";
    /**
     * TV Show URL.
     */
    @NonNull
    public static final String TV_SHOW_URL = "https://api-beta.thetvdb.com/series/";
    /**
     * TV Show URL.
     */
    @NonNull
    public static final String TV_SHOW_EPISODE_URL = "https://api-beta.thetvdb.com/episodes/";
    /**
     * Search TV Shows URL.
     */
    @NonNull
    public static final String SEARCH_TV_SHOWS_URL = "https://api-beta.thetvdb.com/search/series?";
    /**
     * Image URL.
     */
    @NonNull
    public static final String IMAGE_URL = "http://thetvdb.com/banners/";

    /**
     * Name.
     */
    @NonNull
    public static final String NAME = "name";
    /**
     * Name.
     */
    @NonNull
    public static final String IMDB_ID = "imdbId";

    private JTVDBConstants() {
        // singleton
    }
}
