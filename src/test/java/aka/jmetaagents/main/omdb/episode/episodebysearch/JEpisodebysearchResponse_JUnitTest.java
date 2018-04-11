package aka.jmetaagents.main.omdb.episode.episodebysearch;

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
 * JUnit skeleton for the JEpisodebysearchResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JEpisodebysearchResponse.class })
public class JEpisodebysearchResponse_JUnitTest {

    /**
     * getMetascore with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetMetascore() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getMetascore();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMetascore with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetMetascore() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setMetascore(expectedValue);
        final String result = jEpisodebysearchResponse.getMetascore();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBoxOffice with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetBoxOffice() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBoxOffice with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetBoxOffice() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setBoxOffice(expectedValue);
        final String result = jEpisodebysearchResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWebsite with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetWebsite() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final URI result = jEpisodebysearchResponse.getWebsite();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWebsite with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetWebsite() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jEpisodebysearchResponse.setWebsite(expectedValue);
        final URI result = jEpisodebysearchResponse.getWebsite();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbRating with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetImdbRating() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbRating with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetImdbRating() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setImdbRating(expectedValue);
        final String result = jEpisodebysearchResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbVotes with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetImdbVotes() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbVotes with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetImdbVotes() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setImdbVotes(expectedValue);
        final String result = jEpisodebysearchResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRatings with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetRatings() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final List result = jEpisodebysearchResponse.getRatings();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRatings with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetRatings() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Ratings> expectedValue = new ArrayList<>();
        Ratings ratingsItem = new Ratings();
        expectedValue.add(ratingsItem);
        jEpisodebysearchResponse.setRatings(expectedValue);
        final List<Ratings> result = jEpisodebysearchResponse.getRatings();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRuntime with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetRuntime() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getRuntime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRuntime with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetRuntime() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setRuntime(expectedValue);
        final String result = jEpisodebysearchResponse.getRuntime();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setLanguage(expectedValue);
        final String result = jEpisodebysearchResponse.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRated with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetRated() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getRated();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRated with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetRated() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setRated(expectedValue);
        final String result = jEpisodebysearchResponse.getRated();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProduction with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetProduction() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getProduction();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProduction with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetProduction() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setProduction(expectedValue);
        final String result = jEpisodebysearchResponse.getProduction();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getReleased with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetReleased() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getReleased();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setReleased with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetReleased() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setReleased(expectedValue);
        final String result = jEpisodebysearchResponse.getReleased();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbID with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetImdbID() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getImdbID();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbID with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetImdbID() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setImdbID(expectedValue);
        final String result = jEpisodebysearchResponse.getImdbID();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPlot with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetPlot() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getPlot();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPlot with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetPlot() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setPlot(expectedValue);
        final String result = jEpisodebysearchResponse.getPlot();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDirector with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetDirector() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getDirector();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDirector with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetDirector() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setDirector(expectedValue);
        final String result = jEpisodebysearchResponse.getDirector();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setTitle(expectedValue);
        final String result = jEpisodebysearchResponse.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getActors with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetActors() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getActors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setActors with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetActors() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setActors(expectedValue);
        final String result = jEpisodebysearchResponse.getActors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResponse with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetResponse() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getResponse();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResponse with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetResponse() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setResponse(expectedValue);
        final String result = jEpisodebysearchResponse.getResponse();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getType with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetType() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setType with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetType() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setType(expectedValue);
        final String result = jEpisodebysearchResponse.getType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAwards with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetAwards() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getAwards();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAwards with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetAwards() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setAwards(expectedValue);
        final String result = jEpisodebysearchResponse.getAwards();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDVD with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetDVD() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getDVD();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDVD with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetDVD() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setDVD(expectedValue);
        final String result = jEpisodebysearchResponse.getDVD();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getYear with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetYear() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final Date result = jEpisodebysearchResponse.getYear();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setYear with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetYear() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jEpisodebysearchResponse.setYear(expectedValue);
        final Date result = jEpisodebysearchResponse.getYear();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPoster with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetPoster() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final URI result = jEpisodebysearchResponse.getPoster();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPoster with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetPoster() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jEpisodebysearchResponse.setPoster(expectedValue);
        final URI result = jEpisodebysearchResponse.getPoster();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCountry with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetCountry() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCountry with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetCountry() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setCountry(expectedValue);
        final String result = jEpisodebysearchResponse.getCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenre with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetGenre() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getGenre();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenre with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetGenre() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setGenre(expectedValue);
        final String result = jEpisodebysearchResponse.getGenre();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWriter with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testGetWriter() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        final String result = jEpisodebysearchResponse.getWriter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWriter with an new JEpisodebysearchResponse.
     */
    @org.junit.Test
    public void testSetWriter() {
        // arrange : set up the test
        final JEpisodebysearchResponse jEpisodebysearchResponse = mock(JEpisodebysearchResponse.class);
        assert jEpisodebysearchResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebysearchResponse.setWriter(expectedValue);
        final String result = jEpisodebysearchResponse.getWriter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}