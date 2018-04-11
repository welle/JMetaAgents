package aka.jmetaagents.main.omdb.movie.moviebysearch;

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
 * JUnit skeleton for the JMoviebysearchResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JMoviebysearchResponse.class })
public class JMoviebysearchResponse_JUnitTest {

    /**
     * getMetascore with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetMetascore() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getMetascore();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMetascore with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetMetascore() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setMetascore(expectedValue);
        final String result = jMoviebysearchResponse.getMetascore();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBoxOffice with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetBoxOffice() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBoxOffice with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetBoxOffice() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setBoxOffice(expectedValue);
        final String result = jMoviebysearchResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWebsite with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetWebsite() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final URI result = jMoviebysearchResponse.getWebsite();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWebsite with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetWebsite() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jMoviebysearchResponse.setWebsite(expectedValue);
        final URI result = jMoviebysearchResponse.getWebsite();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbRating with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetImdbRating() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbRating with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetImdbRating() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setImdbRating(expectedValue);
        final String result = jMoviebysearchResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbVotes with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetImdbVotes() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbVotes with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetImdbVotes() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setImdbVotes(expectedValue);
        final String result = jMoviebysearchResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRatings with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetRatings() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final List result = jMoviebysearchResponse.getRatings();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRatings with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetRatings() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Ratings> expectedValue = new ArrayList<>();
        Ratings ratingsItem = new Ratings();
        expectedValue.add(ratingsItem);
        jMoviebysearchResponse.setRatings(expectedValue);
        final List<Ratings> result = jMoviebysearchResponse.getRatings();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRuntime with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetRuntime() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getRuntime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRuntime with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetRuntime() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setRuntime(expectedValue);
        final String result = jMoviebysearchResponse.getRuntime();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setLanguage(expectedValue);
        final String result = jMoviebysearchResponse.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRated with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetRated() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getRated();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRated with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetRated() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setRated(expectedValue);
        final String result = jMoviebysearchResponse.getRated();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProduction with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetProduction() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getProduction();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProduction with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetProduction() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setProduction(expectedValue);
        final String result = jMoviebysearchResponse.getProduction();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getReleased with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetReleased() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getReleased();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setReleased with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetReleased() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setReleased(expectedValue);
        final String result = jMoviebysearchResponse.getReleased();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbID with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetImdbID() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getImdbID();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbID with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetImdbID() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setImdbID(expectedValue);
        final String result = jMoviebysearchResponse.getImdbID();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPlot with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetPlot() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getPlot();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPlot with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetPlot() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setPlot(expectedValue);
        final String result = jMoviebysearchResponse.getPlot();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDirector with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetDirector() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getDirector();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDirector with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetDirector() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setDirector(expectedValue);
        final String result = jMoviebysearchResponse.getDirector();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setTitle(expectedValue);
        final String result = jMoviebysearchResponse.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getActors with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetActors() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getActors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setActors with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetActors() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setActors(expectedValue);
        final String result = jMoviebysearchResponse.getActors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResponse with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetResponse() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getResponse();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResponse with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetResponse() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setResponse(expectedValue);
        final String result = jMoviebysearchResponse.getResponse();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getType with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetType() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setType with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetType() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setType(expectedValue);
        final String result = jMoviebysearchResponse.getType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAwards with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetAwards() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getAwards();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAwards with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetAwards() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setAwards(expectedValue);
        final String result = jMoviebysearchResponse.getAwards();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDVD with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetDVD() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getDVD();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDVD with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetDVD() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setDVD(expectedValue);
        final String result = jMoviebysearchResponse.getDVD();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getYear with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetYear() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final Date result = jMoviebysearchResponse.getYear();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setYear with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetYear() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jMoviebysearchResponse.setYear(expectedValue);
        final Date result = jMoviebysearchResponse.getYear();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPoster with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetPoster() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final URI result = jMoviebysearchResponse.getPoster();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPoster with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetPoster() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jMoviebysearchResponse.setPoster(expectedValue);
        final URI result = jMoviebysearchResponse.getPoster();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCountry with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetCountry() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCountry with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetCountry() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setCountry(expectedValue);
        final String result = jMoviebysearchResponse.getCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenre with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetGenre() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getGenre();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenre with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetGenre() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setGenre(expectedValue);
        final String result = jMoviebysearchResponse.getGenre();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWriter with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testGetWriter() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        final String result = jMoviebysearchResponse.getWriter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWriter with an new JMoviebysearchResponse.
     */
    @org.junit.Test
    public void testSetWriter() {
        // arrange : set up the test
        final JMoviebysearchResponse jMoviebysearchResponse = mock(JMoviebysearchResponse.class);
        assert jMoviebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jMoviebysearchResponse.setWriter(expectedValue);
        final String result = jMoviebysearchResponse.getWriter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}