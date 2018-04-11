package aka.jmetaagents.main.omdb.series.seriesbytitle;

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
 * JUnit skeleton for the JSeriesbytitleResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesbytitleResponse.class })
public class JSeriesbytitleResponse_JUnitTest {

    /**
     * getMetascore with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetMetascore() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getMetascore();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMetascore with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetMetascore() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setMetascore(expectedValue);
        final String result = jSeriesbytitleResponse.getMetascore();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBoxOffice with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetBoxOffice() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBoxOffice with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetBoxOffice() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setBoxOffice(expectedValue);
        final String result = jSeriesbytitleResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWebsite with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetWebsite() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final URI result = jSeriesbytitleResponse.getWebsite();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWebsite with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetWebsite() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jSeriesbytitleResponse.setWebsite(expectedValue);
        final URI result = jSeriesbytitleResponse.getWebsite();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbRating with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetImdbRating() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbRating with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetImdbRating() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setImdbRating(expectedValue);
        final String result = jSeriesbytitleResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbVotes with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetImdbVotes() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbVotes with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetImdbVotes() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setImdbVotes(expectedValue);
        final String result = jSeriesbytitleResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRatings with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetRatings() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final List result = jSeriesbytitleResponse.getRatings();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRatings with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetRatings() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Ratings> expectedValue = new ArrayList<>();
        Ratings ratingsItem = new Ratings();
        expectedValue.add(ratingsItem);
        jSeriesbytitleResponse.setRatings(expectedValue);
        final List<Ratings> result = jSeriesbytitleResponse.getRatings();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRuntime with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetRuntime() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getRuntime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRuntime with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetRuntime() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setRuntime(expectedValue);
        final String result = jSeriesbytitleResponse.getRuntime();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setLanguage(expectedValue);
        final String result = jSeriesbytitleResponse.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRated with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetRated() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getRated();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRated with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetRated() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setRated(expectedValue);
        final String result = jSeriesbytitleResponse.getRated();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProduction with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetProduction() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getProduction();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProduction with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetProduction() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setProduction(expectedValue);
        final String result = jSeriesbytitleResponse.getProduction();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getReleased with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetReleased() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getReleased();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setReleased with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetReleased() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setReleased(expectedValue);
        final String result = jSeriesbytitleResponse.getReleased();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbID with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetImdbID() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getImdbID();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbID with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetImdbID() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setImdbID(expectedValue);
        final String result = jSeriesbytitleResponse.getImdbID();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPlot with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetPlot() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getPlot();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPlot with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetPlot() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setPlot(expectedValue);
        final String result = jSeriesbytitleResponse.getPlot();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDirector with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetDirector() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getDirector();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDirector with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetDirector() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setDirector(expectedValue);
        final String result = jSeriesbytitleResponse.getDirector();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setTitle(expectedValue);
        final String result = jSeriesbytitleResponse.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getActors with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetActors() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getActors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setActors with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetActors() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setActors(expectedValue);
        final String result = jSeriesbytitleResponse.getActors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResponse with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetResponse() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getResponse();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResponse with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetResponse() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setResponse(expectedValue);
        final String result = jSeriesbytitleResponse.getResponse();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getType with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetType() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setType with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetType() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setType(expectedValue);
        final String result = jSeriesbytitleResponse.getType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAwards with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetAwards() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getAwards();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAwards with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetAwards() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setAwards(expectedValue);
        final String result = jSeriesbytitleResponse.getAwards();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDVD with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetDVD() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getDVD();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDVD with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetDVD() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setDVD(expectedValue);
        final String result = jSeriesbytitleResponse.getDVD();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getYear with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetYear() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final Date result = jSeriesbytitleResponse.getYear();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setYear with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetYear() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jSeriesbytitleResponse.setYear(expectedValue);
        final Date result = jSeriesbytitleResponse.getYear();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPoster with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetPoster() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final URI result = jSeriesbytitleResponse.getPoster();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPoster with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetPoster() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jSeriesbytitleResponse.setPoster(expectedValue);
        final URI result = jSeriesbytitleResponse.getPoster();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCountry with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetCountry() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCountry with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetCountry() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setCountry(expectedValue);
        final String result = jSeriesbytitleResponse.getCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenre with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetGenre() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getGenre();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenre with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetGenre() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setGenre(expectedValue);
        final String result = jSeriesbytitleResponse.getGenre();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWriter with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testGetWriter() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        final String result = jSeriesbytitleResponse.getWriter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWriter with an new JSeriesbytitleResponse.
     */
    @org.junit.Test
    public void testSetWriter() {
        // arrange : set up the test
        final JSeriesbytitleResponse jSeriesbytitleResponse = mock(JSeriesbytitleResponse.class);
        assert jSeriesbytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleResponse.setWriter(expectedValue);
        final String result = jSeriesbytitleResponse.getWriter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}