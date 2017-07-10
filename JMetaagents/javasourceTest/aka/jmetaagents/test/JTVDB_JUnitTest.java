package aka.jmetaagents.test;

import org.eclipse.jdt.annotation.Nullable;

import aka.jmetaagents.main.jtvdb.JTVDB;
import aka.jmetaagents.main.jtvdb.exceptions.JTVDBException;
import aka.jmetaagents.main.jtvdb.pojo.jtvshow.Data;
import aka.jmetaagents.main.jtvdb.pojo.jtvshow.JTVShow;
import aka.jmetaagents.test.resource.MetaagentConstants;

/**
 * Test classe
 *
 * @author Charlotte
 *
 */
public final class JTVDB_JUnitTest {

    /**
     * Tester
     * 
     * @throws JTVDBException
     */
    @org.junit.Test
    public void JTMDBTest() throws JTVDBException {
        final JTVDB jtvdb = new JTVDB(MetaagentConstants.TVDB_API_KEY, MetaagentConstants.TVDB_USERNAME, MetaagentConstants.TVDB_USER_KEY);
        @Nullable
        final JTVShow tvShow = jtvdb.getTVShow("73739", null);
        if (tvShow != null) {
            @Nullable
            final Data data = tvShow.getData();
            if (data != null) {
                System.err.println("[JTVDB_JUnitTest] JTMDBTest - " + data.getSeriesName());
            }
        }
//        jtvdb.getTVShowEpisode("5624261", new Locale("fr", "FR"));
//        jtvdb.searchTVShows("lost", null);
//        jtvdb.searchTVShowByIMDBid("tt0411008", null);
//        jtvdb.getTVShowActors("73739");
//        jtvdb.getTVShowSeason("73739", "1");
//        jtvdb.getTVShowImages("73739", KEY_TYPE.POSTER, null);
//        jtvdb.getImage("posters/73739-1.jpg");

    }
}
