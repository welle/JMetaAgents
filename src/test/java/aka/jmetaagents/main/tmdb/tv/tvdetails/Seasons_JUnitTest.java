package aka.jmetaagents.main.tmdb.tv.tvdetails;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.Date;

import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the Seasons object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Seasons.class })
public class Seasons_JUnitTest {

    /**
     * getAirDate with an new Seasons.
     */
    @org.junit.Test
    public void testGetAirDate() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        final Date result = seasons.getAirDate();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAirDate with an new Seasons.
     */
    @org.junit.Test
    public void testSetAirDate() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        seasons.setAirDate(expectedValue);
        final Date result = seasons.getAirDate();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodeCount with an new Seasons.
     */
    @org.junit.Test
    public void testGetEpisodeCount() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        final Integer result = seasons.getEpisodeCount();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodeCount with an new Seasons.
     */
    @org.junit.Test
    public void testSetEpisodeCount() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        seasons.setEpisodeCount(expectedValue);
        final Integer result = seasons.getEpisodeCount();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonNumber with an new Seasons.
     */
    @org.junit.Test
    public void testGetSeasonNumber() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        final Integer result = seasons.getSeasonNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonNumber with an new Seasons.
     */
    @org.junit.Test
    public void testSetSeasonNumber() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        seasons.setSeasonNumber(expectedValue);
        final Integer result = seasons.getSeasonNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Seasons.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        final Integer result = seasons.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Seasons.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        seasons.setId(expectedValue);
        final Integer result = seasons.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPosterPath with an new Seasons.
     */
    @org.junit.Test
    public void testGetPosterPath() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        final String result = seasons.getPosterPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosterPath with an new Seasons.
     */
    @org.junit.Test
    public void testSetPosterPath() {
        // arrange : set up the test
        final Seasons seasons = mock(Seasons.class);
        assert seasons != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        seasons.setPosterPath(expectedValue);
        final String result = seasons.getPosterPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}