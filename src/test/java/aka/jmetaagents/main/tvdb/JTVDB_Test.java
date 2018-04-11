package aka.jmetaagents.main.tvdb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.awt.image.BufferedImage;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetaagents.main.MetaagentConstants;
import aka.jmetaagents.main.tvdb.exceptions.JtvdbException;
import aka.jmetaagents.main.tvdb.JTVDB;
import aka.jmetaagents.main.tvdb.authentication.login.JLoginQuestion;
import aka.jmetaagents.main.tvdb.authentication.login.JLoginResponse;
import aka.jmetaagents.main.tvdb.authentication.refreshtoken.JRefreshtokenResponse;
import aka.jmetaagents.main.tvdb.episodes.episodesid.JEpisodesidQuestion;
import aka.jmetaagents.main.tvdb.episodes.episodesid.JEpisodesidResponse;
import aka.jmetaagents.main.tvdb.languages.languages.JLanguagesResponse;
import aka.jmetaagents.main.tvdb.languages.languagesid.JLanguagesidQuestion;
import aka.jmetaagents.main.tvdb.languages.languagesid.JLanguagesidResponse;
import aka.jmetaagents.main.tvdb.search.searchseries.JSearchseriesQuestion;
import aka.jmetaagents.main.tvdb.search.searchseries.JSearchseriesResponse;
import aka.jmetaagents.main.tvdb.search.searchseriesparams.JSearchseriesparamsResponse;
import aka.jmetaagents.main.tvdb.series.seriesid.JSeriesidQuestion;
import aka.jmetaagents.main.tvdb.series.seriesid.JSeriesidResponse;
import aka.jmetaagents.main.tvdb.series.seriesidactors.JSeriesidactorsQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidactors.JSeriesidactorsResponse;
import aka.jmetaagents.main.tvdb.series.seriesidepisodes.JSeriesidepisodesQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidepisodes.JSeriesidepisodesResponse;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesquery.JSeriesidepisodesqueryQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesquery.JSeriesidepisodesqueryResponse;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesqueryparams.JSeriesidepisodesqueryparamsQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidepisodesqueryparams.JSeriesidepisodesqueryparamsResponse;
import aka.jmetaagents.main.tvdb.series.seriesidepisodessummary.JSeriesidepisodessummaryQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidepisodessummary.JSeriesidepisodessummaryResponse;
import aka.jmetaagents.main.tvdb.series.seriesidfilter.JSeriesidfilterQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidfilter.JSeriesidfilterResponse;
import aka.jmetaagents.main.tvdb.series.seriesidfilterparams.JSeriesidfilterparamsQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidfilterparams.JSeriesidfilterparamsResponse;
import aka.jmetaagents.main.tvdb.series.seriesidimages.JSeriesidimagesQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidimages.JSeriesidimagesResponse;
import aka.jmetaagents.main.tvdb.series.seriesidimagesquery.JSeriesidimagesqueryQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidimagesquery.JSeriesidimagesqueryResponse;
import aka.jmetaagents.main.tvdb.series.seriesidimagesqueryparams.JSeriesidimagesqueryparamsQuestion;
import aka.jmetaagents.main.tvdb.series.seriesidimagesqueryparams.JSeriesidimagesqueryparamsResponse;

/**
 * Generated JTVDB Tests unit.
 */
public final class JTVDB_Test {

    private @NonNull String apiKey = MetaagentConstants.TVDB_API_KEY;
    private @NonNull String userKey = MetaagentConstants.TVDB_USER_KEY;
    private @NonNull String userName = MetaagentConstants.TVDB_USERNAME;

    /**
     * Test getJRefreshtoken method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJRefreshtoken_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final JRefreshtokenResponse result = jTVDB.getJRefreshtoken();
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJEpisodesid method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJEpisodesid_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final String acceptLanguage = null;
        final JEpisodesidQuestion jTVDBQuestion = new JEpisodesidQuestion(id, acceptLanguage);
        final JEpisodesidResponse result = jTVDB.getJEpisodesid(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJLanguages method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJLanguages_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final JLanguagesResponse result = jTVDB.getJLanguages();
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJLanguagesid method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJLanguagesid_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final JLanguagesidQuestion jTVDBQuestion = new JLanguagesidQuestion(id);
        final JLanguagesidResponse result = jTVDB.getJLanguagesid(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSearchseries method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSearchseries_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final String zap2itId = null;
        final String imdbId = null;
        final String name = null;
        final String acceptLanguage = null;
        final JSearchseriesQuestion jTVDBQuestion = new JSearchseriesQuestion(zap2itId, imdbId, name, acceptLanguage);
        final JSearchseriesResponse result = jTVDB.getJSearchseries(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSearchseriesparams method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSearchseriesparams_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final JSearchseriesparamsResponse result = jTVDB.getJSearchseriesparams();
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesid method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesid_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final String acceptLanguage = null;
        final JSeriesidQuestion jTVDBQuestion = new JSeriesidQuestion(id, acceptLanguage);
        final JSeriesidResponse result = jTVDB.getJSeriesid(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidactors method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidactors_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final JSeriesidactorsQuestion jTVDBQuestion = new JSeriesidactorsQuestion(id);
        final JSeriesidactorsResponse result = jTVDB.getJSeriesidactors(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidepisodes method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidepisodes_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final String acceptLanguage = null;
        final JSeriesidepisodesQuestion jTVDBQuestion = new JSeriesidepisodesQuestion(id, acceptLanguage);
        final JSeriesidepisodesResponse result = jTVDB.getJSeriesidepisodes(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidepisodesquery method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidepisodesquery_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final String dvdSeason = null;
        final String dvdEpisode = null;
        final String airedEpisode = null;
        final String absoluteNumber = null;
        final String imdbId = null;
        final String airedSeason = null;
        final Integer id = null;
        final String acceptLanguage = null;
        final String page = null;
        final JSeriesidepisodesqueryQuestion jTVDBQuestion = new JSeriesidepisodesqueryQuestion(dvdSeason, dvdEpisode, airedEpisode, absoluteNumber, imdbId, airedSeason, id, acceptLanguage, page);
        final JSeriesidepisodesqueryResponse result = jTVDB.getJSeriesidepisodesquery(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidepisodesqueryparams method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidepisodesqueryparams_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final JSeriesidepisodesqueryparamsQuestion jTVDBQuestion = new JSeriesidepisodesqueryparamsQuestion(id);
        final JSeriesidepisodesqueryparamsResponse result = jTVDB.getJSeriesidepisodesqueryparams(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidepisodessummary method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidepisodessummary_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final JSeriesidepisodessummaryQuestion jTVDBQuestion = new JSeriesidepisodessummaryQuestion(id);
        final JSeriesidepisodessummaryResponse result = jTVDB.getJSeriesidepisodessummary(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidfilter method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidfilter_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final String keys = null;
        final Integer id = null;
        final String acceptLanguage = null;
        final JSeriesidfilterQuestion jTVDBQuestion = new JSeriesidfilterQuestion(keys, id, acceptLanguage);
        final JSeriesidfilterResponse result = jTVDB.getJSeriesidfilter(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidfilterparams method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidfilterparams_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final String acceptLanguage = null;
        final JSeriesidfilterparamsQuestion jTVDBQuestion = new JSeriesidfilterparamsQuestion(id, acceptLanguage);
        final JSeriesidfilterparamsResponse result = jTVDB.getJSeriesidfilterparams(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidimages method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidimages_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final String acceptLanguage = null;
        final JSeriesidimagesQuestion jTVDBQuestion = new JSeriesidimagesQuestion(id, acceptLanguage);
        final JSeriesidimagesResponse result = jTVDB.getJSeriesidimages(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidimagesquery method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidimagesquery_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final String subKey = null;
        final Integer id = null;
        final String acceptLanguage = null;
        final String keyType = null;
        final String resolution = null;
        final JSeriesidimagesqueryQuestion jTVDBQuestion = new JSeriesidimagesqueryQuestion(subKey, id, acceptLanguage, keyType, resolution);
        final JSeriesidimagesqueryResponse result = jTVDB.getJSeriesidimagesquery(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesidimagesqueryparams method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getJSeriesidimagesqueryparams_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        final Integer id = null;
        final String acceptLanguage = null;
        final JSeriesidimagesqueryparamsQuestion jTVDBQuestion = new JSeriesidimagesqueryparamsQuestion(id, acceptLanguage);
        final JSeriesidimagesqueryparamsResponse result = jTVDB.getJSeriesidimagesqueryparams(jTVDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getImage method.
     *
     * @throws JtvdbException
     */
    @org.junit.Test 
    public void getImage_Test() throws JtvdbException {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = new JLoginQuestion(this.apiKey, this.userKey, this.userName);
        final JTVDB jTVDB = new JTVDB(jLoginQuestion);
        
        // act : run the test
        String urlImage = "";
        final BufferedImage result = jTVDB.getImage(urlImage);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

}
