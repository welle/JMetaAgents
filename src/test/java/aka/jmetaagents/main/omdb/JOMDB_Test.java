package aka.jmetaagents.main.omdb;

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
import aka.jmetaagents.main.omdb.exceptions.JomdbException;
import aka.jmetaagents.main.omdb.JOMDB;
import aka.jmetaagents.main.omdb.episode.episodebyidimdb.JEpisodebyidimdbQuestion;
import aka.jmetaagents.main.omdb.episode.episodebyidimdb.JEpisodebyidimdbResponse;
import aka.jmetaagents.main.omdb.episode.episodebysearch.JEpisodebysearchQuestion;
import aka.jmetaagents.main.omdb.episode.episodebysearch.JEpisodebysearchResponse;
import aka.jmetaagents.main.omdb.episode.episodebytitle.JEpisodebytitleQuestion;
import aka.jmetaagents.main.omdb.episode.episodebytitle.JEpisodebytitleResponse;
import aka.jmetaagents.main.omdb.movie.moviebyidimdb.JMoviebyidimdbQuestion;
import aka.jmetaagents.main.omdb.movie.moviebyidimdb.JMoviebyidimdbResponse;
import aka.jmetaagents.main.omdb.movie.moviebysearch.JMoviebysearchQuestion;
import aka.jmetaagents.main.omdb.movie.moviebysearch.JMoviebysearchResponse;
import aka.jmetaagents.main.omdb.movie.moviebytitle.JMoviebytitleQuestion;
import aka.jmetaagents.main.omdb.movie.moviebytitle.JMoviebytitleResponse;
import aka.jmetaagents.main.omdb.series.seriesbyidimdb.JSeriesbyidimdbQuestion;
import aka.jmetaagents.main.omdb.series.seriesbyidimdb.JSeriesbyidimdbResponse;
import aka.jmetaagents.main.omdb.series.seriesbysearch.JSeriesbysearchQuestion;
import aka.jmetaagents.main.omdb.series.seriesbysearch.JSeriesbysearchResponse;
import aka.jmetaagents.main.omdb.series.seriesbytitle.JSeriesbytitleQuestion;
import aka.jmetaagents.main.omdb.series.seriesbytitle.JSeriesbytitleResponse;

/**
 * Generated JOMDB Tests unit.
 */
public final class JOMDB_Test {

    private @NonNull String apiKey = MetaagentConstants.THE_OMDB_API_KEY;

    /**
     * Test getJEpisodebyidimdb method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getJEpisodebyidimdb_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        final Integer imdbid = null;
        final Integer y = null;
        final JEpisodebyidimdbQuestion jOMDBQuestion = new JEpisodebyidimdbQuestion(imdbid, y);
        final JEpisodebyidimdbResponse result = jOMDB.getJEpisodebyidimdb(jOMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJEpisodebysearch method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getJEpisodebysearch_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        final Integer y = null;
        final Integer page = null;
        final String title = null;
        final JEpisodebysearchQuestion jOMDBQuestion = new JEpisodebysearchQuestion(y, page, title);
        final JEpisodebysearchResponse result = jOMDB.getJEpisodebysearch(jOMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJEpisodebytitle method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getJEpisodebytitle_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        final Integer y = null;
        final String title = null;
        final JEpisodebytitleQuestion jOMDBQuestion = new JEpisodebytitleQuestion(y, title);
        final JEpisodebytitleResponse result = jOMDB.getJEpisodebytitle(jOMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviebyidimdb method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getJMoviebyidimdb_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        final Integer imdbid = null;
        final Integer y = null;
        final JMoviebyidimdbQuestion jOMDBQuestion = new JMoviebyidimdbQuestion(imdbid, y);
        final JMoviebyidimdbResponse result = jOMDB.getJMoviebyidimdb(jOMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviebysearch method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getJMoviebysearch_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        final Integer y = null;
        final Integer page = null;
        final String title = null;
        final JMoviebysearchQuestion jOMDBQuestion = new JMoviebysearchQuestion(y, page, title);
        final JMoviebysearchResponse result = jOMDB.getJMoviebysearch(jOMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJMoviebytitle method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getJMoviebytitle_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        final Integer y = null;
        final String title = null;
        final JMoviebytitleQuestion jOMDBQuestion = new JMoviebytitleQuestion(y, title);
        final JMoviebytitleResponse result = jOMDB.getJMoviebytitle(jOMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesbyidimdb method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getJSeriesbyidimdb_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        final Integer imdbid = null;
        final Integer y = null;
        final JSeriesbyidimdbQuestion jOMDBQuestion = new JSeriesbyidimdbQuestion(imdbid, y);
        final JSeriesbyidimdbResponse result = jOMDB.getJSeriesbyidimdb(jOMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesbysearch method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getJSeriesbysearch_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        final Integer y = null;
        final Integer page = null;
        final String title = null;
        final JSeriesbysearchQuestion jOMDBQuestion = new JSeriesbysearchQuestion(y, page, title);
        final JSeriesbysearchResponse result = jOMDB.getJSeriesbysearch(jOMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJSeriesbytitle method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getJSeriesbytitle_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        final Integer y = null;
        final String title = null;
        final JSeriesbytitleQuestion jOMDBQuestion = new JSeriesbytitleQuestion(y, title);
        final JSeriesbytitleResponse result = jOMDB.getJSeriesbytitle(jOMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getImage method.
     *
     * @throws JomdbException
     */
    @org.junit.Test 
    public void getImage_Test() throws JomdbException {
        // arrange : set up the test
        final JOMDB jOMDB = new JOMDB(this.apiKey);
        
        // act : run the test
        String urlImage = "";
        final BufferedImage result = jOMDB.getImage(urlImage);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

}
