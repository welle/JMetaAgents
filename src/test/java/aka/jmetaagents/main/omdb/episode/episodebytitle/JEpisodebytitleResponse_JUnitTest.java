package aka.jmetaagents.main.omdb.episode.episodebytitle;

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
 * JUnit skeleton for the JEpisodebytitleResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JEpisodebytitleResponse.class })
public class JEpisodebytitleResponse_JUnitTest {

    /**
     * getMetascore with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetMetascore() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getMetascore();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setMetascore with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetMetascore() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setMetascore(expectedValue);
        final String result = jEpisodebytitleResponse.getMetascore();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBoxOffice with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetBoxOffice() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBoxOffice with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetBoxOffice() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setBoxOffice(expectedValue);
        final String result = jEpisodebytitleResponse.getBoxOffice();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWebsite with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetWebsite() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final URI result = jEpisodebytitleResponse.getWebsite();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWebsite with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetWebsite() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jEpisodebytitleResponse.setWebsite(expectedValue);
        final URI result = jEpisodebytitleResponse.getWebsite();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbRating with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetImdbRating() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbRating with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetImdbRating() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setImdbRating(expectedValue);
        final String result = jEpisodebytitleResponse.getImdbRating();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbVotes with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetImdbVotes() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbVotes with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetImdbVotes() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setImdbVotes(expectedValue);
        final String result = jEpisodebytitleResponse.getImdbVotes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRatings with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetRatings() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final List result = jEpisodebytitleResponse.getRatings();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRatings with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetRatings() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Ratings> expectedValue = new ArrayList<>();
        Ratings ratingsItem = new Ratings();
        expectedValue.add(ratingsItem);
        jEpisodebytitleResponse.setRatings(expectedValue);
        final List<Ratings> result = jEpisodebytitleResponse.getRatings();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRuntime with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetRuntime() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getRuntime();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRuntime with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetRuntime() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setRuntime(expectedValue);
        final String result = jEpisodebytitleResponse.getRuntime();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setLanguage(expectedValue);
        final String result = jEpisodebytitleResponse.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getRated with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetRated() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getRated();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setRated with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetRated() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setRated(expectedValue);
        final String result = jEpisodebytitleResponse.getRated();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProduction with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetProduction() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getProduction();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProduction with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetProduction() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setProduction(expectedValue);
        final String result = jEpisodebytitleResponse.getProduction();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getReleased with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetReleased() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getReleased();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setReleased with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetReleased() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setReleased(expectedValue);
        final String result = jEpisodebytitleResponse.getReleased();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbID with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetImdbID() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getImdbID();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbID with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetImdbID() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setImdbID(expectedValue);
        final String result = jEpisodebytitleResponse.getImdbID();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPlot with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetPlot() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getPlot();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPlot with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetPlot() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setPlot(expectedValue);
        final String result = jEpisodebytitleResponse.getPlot();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDirector with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetDirector() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getDirector();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDirector with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetDirector() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setDirector(expectedValue);
        final String result = jEpisodebytitleResponse.getDirector();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setTitle(expectedValue);
        final String result = jEpisodebytitleResponse.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getActors with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetActors() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getActors();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setActors with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetActors() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setActors(expectedValue);
        final String result = jEpisodebytitleResponse.getActors();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResponse with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetResponse() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getResponse();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResponse with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetResponse() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setResponse(expectedValue);
        final String result = jEpisodebytitleResponse.getResponse();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getType with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetType() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setType with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetType() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setType(expectedValue);
        final String result = jEpisodebytitleResponse.getType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAwards with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetAwards() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getAwards();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAwards with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetAwards() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setAwards(expectedValue);
        final String result = jEpisodebytitleResponse.getAwards();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDVD with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetDVD() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getDVD();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDVD with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetDVD() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setDVD(expectedValue);
        final String result = jEpisodebytitleResponse.getDVD();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getYear with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetYear() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final Date result = jEpisodebytitleResponse.getYear();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setYear with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetYear() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jEpisodebytitleResponse.setYear(expectedValue);
        final Date result = jEpisodebytitleResponse.getYear();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPoster with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetPoster() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final URI result = jEpisodebytitleResponse.getPoster();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPoster with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetPoster() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final URI expectedValue = null;
        jEpisodebytitleResponse.setPoster(expectedValue);
        final URI result = jEpisodebytitleResponse.getPoster();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCountry with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetCountry() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getCountry();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCountry with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetCountry() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setCountry(expectedValue);
        final String result = jEpisodebytitleResponse.getCountry();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGenre with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetGenre() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getGenre();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGenre with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetGenre() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setGenre(expectedValue);
        final String result = jEpisodebytitleResponse.getGenre();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getWriter with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testGetWriter() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        final String result = jEpisodebytitleResponse.getWriter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setWriter with an new JEpisodebytitleResponse.
     */
    @org.junit.Test
    public void testSetWriter() {
        // arrange : set up the test
        final JEpisodebytitleResponse jEpisodebytitleResponse = mock(JEpisodebytitleResponse.class);
        assert jEpisodebytitleResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleResponse.setWriter(expectedValue);
        final String result = jEpisodebytitleResponse.getWriter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}