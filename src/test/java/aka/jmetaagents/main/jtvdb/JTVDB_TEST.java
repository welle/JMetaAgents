package aka.jmetaagents.main.jtvdb;

import java.awt.image.BufferedImage;
import java.util.Locale;

import aka.jmetaagents.main.jtvdb.constants.KEY_TYPE;
import aka.jmetaagents.main.jtvdb.exceptions.JTVDBException;
import aka.jmetaagents.main.jtvdb.pojo.jtvshow.JTVShow;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowactor.JTVShowActor;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowepisode.JTVShowEpisode;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowimage.JTVShowImage;
import aka.jmetaagents.main.jtvdb.pojo.jtvshowsearch.JTVShowSearch;
import aka.jmetaagents.test.resource.MetaagentConstants;

/**
 * JUnit tests for the class JTVDB.
 *
 * @author JunitTestGenerator
 */
public class JTVDB_TEST {

    /**
     * searchTVShowByIMDBid.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchTVShowByIMDBidWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        try {
            final JTVDB jTVDB = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
            final JTVShowSearch jTVShowSearchResult = jTVDB.searchTVShowByIMDBid(param0, param1);

            // Add assertions

        } catch (final JTVDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowImages.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>KEY_TYPE</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowImagesWithStringKEY_TYPELocale() {
        final String param0 = "";
        final KEY_TYPE param1 = KEY_TYPE.POSTER;
        final Locale param2 = null;
        try {
            final JTVDB jTVDB = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
            final JTVShowImage jTVShowImageResult = jTVDB.getTVShowImages(param0, param1, param2);

            // Add assertions

        } catch (final JTVDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowSeason.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowSeasonWithStringStringLocale() {
        final String param0 = "";
        final String param1 = "";
        final Locale param2 = null;
        try {
            final JTVDB jTVDB = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
            final JTVShowSearch jTVShowSearchResult = jTVDB.getTVShowSeason(param0, param1, param2);

            // Add assertions

        } catch (final JTVDBException e) {
            // Handle exception
        }
    }

    /**
     * getToken.
     */
    @org.junit.Test
    public void testGetToken() {
        try {
            final JTVDB jTVDB = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
            final String stringResult = jTVDB.getToken();

            // Add assertions
        } catch (final JTVDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShow.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        try {
            final JTVDB jTVDB = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
            final JTVShow jTVShowResult = jTVDB.getTVShow(param0, param1);

            // Add assertions

        } catch (final JTVDBException e) {
            // Handle exception
        }
    }

    /**
     * searchTVShows.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testSearchTVShowsWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        try {
            final JTVDB jTVDB = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
            final JTVShowSearch jTVShowSearchResult = jTVDB.searchTVShows(param0, param1);

            // Add assertions

        } catch (final JTVDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowEpisode.
     * With params:
     * <ul>
     * <li>String</li>
     * <li>Locale</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowEpisodeWithStringLocale() {
        final String param0 = "";
        final Locale param1 = null;
        try {
            final JTVDB jTVDB = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
            final JTVShowEpisode jTVShowEpisodeResult = jTVDB.getTVShowEpisode(param0, param1);

            // Add assertions

        } catch (final JTVDBException e) {
            // Handle exception
        }
    }

    /**
     * getTVShowActors.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetTVShowActorsWithString() {
        final String param0 = "";
        try {
            final JTVDB jTVDB = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
            final JTVShowActor jTVShowActorResult = jTVDB.getTVShowActors(param0);

            // Add assertions

        } catch (final JTVDBException e) {
            // Handle exception
        }
    }

    /**
     * getImage.
     * With params:
     * <ul>
     * <li>String</li>
     * </ul>
     */
    @org.junit.Test
    public void testGetImageWithString() {
        final String param0 = "";
        try {
            final JTVDB jTVDB = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
            final BufferedImage bufferedImageResult = jTVDB.getImage(param0);

            // Add assertions

        } catch (final JTVDBException e) {
            // Handle exception
        }
    }

}
