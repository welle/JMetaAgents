package aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JTvepisodecreditsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvepisodecreditsResponse.class })
public class JTvepisodecreditsResponse_JUnitTest {

    /**
     * getProductionCode with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetProductionCode() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final String result = jTvepisodecreditsResponse.getProductionCode();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProductionCode with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetProductionCode() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvepisodecreditsResponse.setProductionCode(expectedValue);
        final String result = jTvepisodecreditsResponse.getProductionCode();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAirDate with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetAirDate() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final Date result = jTvepisodecreditsResponse.getAirDate();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAirDate with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetAirDate() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jTvepisodecreditsResponse.setAirDate(expectedValue);
        final Date result = jTvepisodecreditsResponse.getAirDate();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOverview with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetOverview() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final String result = jTvepisodecreditsResponse.getOverview();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOverview with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetOverview() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvepisodecreditsResponse.setOverview(expectedValue);
        final String result = jTvepisodecreditsResponse.getOverview();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodeNumber with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final Integer result = jTvepisodecreditsResponse.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodeNumber with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodecreditsResponse.setEpisodeNumber(expectedValue);
        final Integer result = jTvepisodecreditsResponse.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteAverage with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetVoteAverage() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final Double result = jTvepisodecreditsResponse.getVoteAverage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteAverage with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetVoteAverage() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Double expectedValue = Double.valueOf(24);
        jTvepisodecreditsResponse.setVoteAverage(expectedValue);
        final Double result = jTvepisodecreditsResponse.getVoteAverage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final String result = jTvepisodecreditsResponse.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvepisodecreditsResponse.setName(expectedValue);
        final String result = jTvepisodecreditsResponse.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonNumber with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final Integer result = jTvepisodecreditsResponse.getSeasonNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonNumber with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodecreditsResponse.setSeasonNumber(expectedValue);
        final Integer result = jTvepisodecreditsResponse.getSeasonNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final Integer result = jTvepisodecreditsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodecreditsResponse.setId(expectedValue);
        final Integer result = jTvepisodecreditsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getStillPath with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetStillPath() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final String result = jTvepisodecreditsResponse.getStillPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setStillPath with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetStillPath() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvepisodecreditsResponse.setStillPath(expectedValue);
        final String result = jTvepisodecreditsResponse.getStillPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getVoteCount with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetVoteCount() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final Integer result = jTvepisodecreditsResponse.getVoteCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setVoteCount with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetVoteCount() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodecreditsResponse.setVoteCount(expectedValue);
        final Integer result = jTvepisodecreditsResponse.getVoteCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCrew with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetCrew() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final List result = jTvepisodecreditsResponse.getCrew();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCrew with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetCrew() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Crew> expectedValue = new ArrayList<>();
        Crew crewItem = new Crew();
        expectedValue.add(crewItem);
        jTvepisodecreditsResponse.setCrew(expectedValue);
        final List<Crew> result = jTvepisodecreditsResponse.getCrew();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGuestStars with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testGetGuestStars() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        final List result = jTvepisodecreditsResponse.getGuestStars();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGuestStars with an new JTvepisodecreditsResponse.
     */
    @org.junit.Test
    public void testSetGuestStars() {
        // arrange : set up the test
        final JTvepisodecreditsResponse jTvepisodecreditsResponse = mock(JTvepisodecreditsResponse.class);
        assert jTvepisodecreditsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<GuestStars> expectedValue = new ArrayList<>();
        GuestStars guestStarsItem = new GuestStars();
        expectedValue.add(guestStarsItem);
        jTvepisodecreditsResponse.setGuestStars(expectedValue);
        final List<GuestStars> result = jTvepisodecreditsResponse.getGuestStars();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}