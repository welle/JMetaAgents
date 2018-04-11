package aka.jmetaagents.main.omdb.series.seriesbyidimdb;

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
 * JUnit skeleton for the JSeriesbyidimdbResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesbyidimdbResponse.class })
public class JSeriesbyidimdbResponse_JUnitTest {

    /**
     * getMetascore with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetMetascore() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getMetascore();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMetascore with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetMetascore() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setMetascore(expectedValue);
        final String result = jSeriesbyidimdbResponse.getMetascore();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBoxOffice with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetBoxOffice() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBoxOffice with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetBoxOffice() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setBoxOffice(expectedValue);
        final String result = jSeriesbyidimdbResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWebsite with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetWebsite() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final URI result = jSeriesbyidimdbResponse.getWebsite();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWebsite with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetWebsite() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jSeriesbyidimdbResponse.setWebsite(expectedValue);
        final URI result = jSeriesbyidimdbResponse.getWebsite();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbRating with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetImdbRating() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbRating with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetImdbRating() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setImdbRating(expectedValue);
        final String result = jSeriesbyidimdbResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbVotes with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetImdbVotes() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbVotes with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetImdbVotes() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setImdbVotes(expectedValue);
        final String result = jSeriesbyidimdbResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRatings with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetRatings() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final List result = jSeriesbyidimdbResponse.getRatings();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRatings with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetRatings() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Ratings> expectedValue = new ArrayList<>();
        Ratings ratingsItem = new Ratings();
        expectedValue.add(ratingsItem);
        jSeriesbyidimdbResponse.setRatings(expectedValue);
        final List<Ratings> result = jSeriesbyidimdbResponse.getRatings();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRuntime with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetRuntime() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getRuntime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRuntime with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetRuntime() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setRuntime(expectedValue);
        final String result = jSeriesbyidimdbResponse.getRuntime();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setLanguage(expectedValue);
        final String result = jSeriesbyidimdbResponse.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRated with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetRated() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getRated();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRated with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetRated() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setRated(expectedValue);
        final String result = jSeriesbyidimdbResponse.getRated();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProduction with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetProduction() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getProduction();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProduction with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetProduction() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setProduction(expectedValue);
        final String result = jSeriesbyidimdbResponse.getProduction();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getReleased with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetReleased() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getReleased();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setReleased with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetReleased() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setReleased(expectedValue);
        final String result = jSeriesbyidimdbResponse.getReleased();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbID with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetImdbID() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getImdbID();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbID with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetImdbID() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setImdbID(expectedValue);
        final String result = jSeriesbyidimdbResponse.getImdbID();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPlot with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetPlot() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getPlot();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPlot with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetPlot() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setPlot(expectedValue);
        final String result = jSeriesbyidimdbResponse.getPlot();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDirector with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetDirector() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getDirector();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDirector with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetDirector() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setDirector(expectedValue);
        final String result = jSeriesbyidimdbResponse.getDirector();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setTitle(expectedValue);
        final String result = jSeriesbyidimdbResponse.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getActors with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetActors() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getActors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setActors with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetActors() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setActors(expectedValue);
        final String result = jSeriesbyidimdbResponse.getActors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResponse with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetResponse() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getResponse();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResponse with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetResponse() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setResponse(expectedValue);
        final String result = jSeriesbyidimdbResponse.getResponse();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getType with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetType() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setType with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetType() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setType(expectedValue);
        final String result = jSeriesbyidimdbResponse.getType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAwards with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetAwards() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getAwards();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAwards with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetAwards() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setAwards(expectedValue);
        final String result = jSeriesbyidimdbResponse.getAwards();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDVD with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetDVD() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getDVD();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDVD with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetDVD() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setDVD(expectedValue);
        final String result = jSeriesbyidimdbResponse.getDVD();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getYear with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetYear() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final Date result = jSeriesbyidimdbResponse.getYear();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setYear with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetYear() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jSeriesbyidimdbResponse.setYear(expectedValue);
        final Date result = jSeriesbyidimdbResponse.getYear();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPoster with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetPoster() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final URI result = jSeriesbyidimdbResponse.getPoster();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPoster with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetPoster() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jSeriesbyidimdbResponse.setPoster(expectedValue);
        final URI result = jSeriesbyidimdbResponse.getPoster();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCountry with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetCountry() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCountry with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetCountry() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setCountry(expectedValue);
        final String result = jSeriesbyidimdbResponse.getCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenre with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetGenre() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getGenre();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenre with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetGenre() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setGenre(expectedValue);
        final String result = jSeriesbyidimdbResponse.getGenre();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWriter with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testGetWriter() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        final String result = jSeriesbyidimdbResponse.getWriter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWriter with an new JSeriesbyidimdbResponse.
     */
    @org.junit.Test
    public void testSetWriter() {
        // arrange : set up the test
        final JSeriesbyidimdbResponse jSeriesbyidimdbResponse = mock(JSeriesbyidimdbResponse.class);
        assert jSeriesbyidimdbResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbyidimdbResponse.setWriter(expectedValue);
        final String result = jSeriesbyidimdbResponse.getWriter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}