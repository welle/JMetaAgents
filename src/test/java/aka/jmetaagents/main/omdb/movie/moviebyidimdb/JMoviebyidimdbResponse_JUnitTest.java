package aka.jmetaagents.main.omdb.movie.moviebyidimdb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JMoviebyidimdbResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviebyidimdbResponse.class })
public class JMoviebyidimdbResponse_JUnitTest {

    /**
     * getMetascore with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetMetascore() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getMetascore();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMetascore with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetMetascore() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setMetascore(expectedValue);
        final String result = jMoviebyidimdbResponse.getMetascore();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBoxOffice with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetBoxOffice() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBoxOffice with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetBoxOffice() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setBoxOffice(expectedValue);
        final String result = jMoviebyidimdbResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWebsite with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetWebsite() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final URI result = jMoviebyidimdbResponse.getWebsite();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWebsite with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetWebsite() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jMoviebyidimdbResponse.setWebsite(expectedValue);
        final URI result = jMoviebyidimdbResponse.getWebsite();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbRating with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetImdbRating() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbRating with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetImdbRating() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setImdbRating(expectedValue);
        final String result = jMoviebyidimdbResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbVotes with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetImdbVotes() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbVotes with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetImdbVotes() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setImdbVotes(expectedValue);
        final String result = jMoviebyidimdbResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRatings with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetRatings() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final List result = jMoviebyidimdbResponse.getRatings();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRatings with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetRatings() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Ratings> expectedValue = new ArrayList<>();
        Ratings ratingsItem = new Ratings();
        expectedValue.add(ratingsItem);
        jMoviebyidimdbResponse.setRatings(expectedValue);
        final List<Ratings> result = jMoviebyidimdbResponse.getRatings();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRuntime with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetRuntime() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getRuntime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRuntime with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetRuntime() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setRuntime(expectedValue);
        final String result = jMoviebyidimdbResponse.getRuntime();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setLanguage(expectedValue);
        final String result = jMoviebyidimdbResponse.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRated with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetRated() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getRated();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRated with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetRated() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setRated(expectedValue);
        final String result = jMoviebyidimdbResponse.getRated();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProduction with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetProduction() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getProduction();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProduction with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetProduction() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setProduction(expectedValue);
        final String result = jMoviebyidimdbResponse.getProduction();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getReleased with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetReleased() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getReleased();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setReleased with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetReleased() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setReleased(expectedValue);
        final String result = jMoviebyidimdbResponse.getReleased();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbID with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetImdbID() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getImdbID();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbID with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetImdbID() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setImdbID(expectedValue);
        final String result = jMoviebyidimdbResponse.getImdbID();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPlot with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetPlot() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getPlot();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPlot with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetPlot() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setPlot(expectedValue);
        final String result = jMoviebyidimdbResponse.getPlot();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDirector with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetDirector() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getDirector();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDirector with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetDirector() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setDirector(expectedValue);
        final String result = jMoviebyidimdbResponse.getDirector();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setTitle(expectedValue);
        final String result = jMoviebyidimdbResponse.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getActors with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetActors() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getActors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setActors with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetActors() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setActors(expectedValue);
        final String result = jMoviebyidimdbResponse.getActors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResponse with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetResponse() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getResponse();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResponse with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetResponse() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setResponse(expectedValue);
        final String result = jMoviebyidimdbResponse.getResponse();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getType with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetType() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setType with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetType() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setType(expectedValue);
        final String result = jMoviebyidimdbResponse.getType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAwards with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetAwards() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getAwards();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAwards with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetAwards() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setAwards(expectedValue);
        final String result = jMoviebyidimdbResponse.getAwards();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDVD with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetDVD() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getDVD();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDVD with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetDVD() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setDVD(expectedValue);
        final String result = jMoviebyidimdbResponse.getDVD();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getYear with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetYear() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final Date result = jMoviebyidimdbResponse.getYear();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setYear with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetYear() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jMoviebyidimdbResponse.setYear(expectedValue);
        final Date result = jMoviebyidimdbResponse.getYear();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPoster with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetPoster() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final URI result = jMoviebyidimdbResponse.getPoster();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPoster with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetPoster() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jMoviebyidimdbResponse.setPoster(expectedValue);
        final URI result = jMoviebyidimdbResponse.getPoster();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCountry with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetCountry() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCountry with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetCountry() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setCountry(expectedValue);
        final String result = jMoviebyidimdbResponse.getCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenre with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetGenre() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getGenre();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenre with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetGenre() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setGenre(expectedValue);
        final String result = jMoviebyidimdbResponse.getGenre();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWriter with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testGetWriter() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        final String result = jMoviebyidimdbResponse.getWriter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWriter with an new JMoviebyidimdbResponse.
     */
    @org.junit.Test
    public void testSetWriter() {
        // arrange : set up the test
        final JMoviebyidimdbResponse jMoviebyidimdbResponse = mock(JMoviebyidimdbResponse.class);
        assert jMoviebyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebyidimdbResponse.setWriter(expectedValue);
        final String result = jMoviebyidimdbResponse.getWriter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}