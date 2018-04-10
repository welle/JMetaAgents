package aka.jmetaagents.main.tmdb.tv.season.tvseasondetails;

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
 * JUnit skeleton for the JTvseasondetailsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvseasondetailsResponse.class })
public class JTvseasondetailsResponse_JUnitTest {

    /**
     * getAirDate with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testGetAirDate() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        final Date result = jTvseasondetailsResponse.getAirDate();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAirDate with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testSetAirDate() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Date expectedValue = new Date();
        jTvseasondetailsResponse.setAirDate(expectedValue);
        final Date result = jTvseasondetailsResponse.getAirDate();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOverview with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testGetOverview() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        final String result = jTvseasondetailsResponse.getOverview();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOverview with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testSetOverview() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvseasondetailsResponse.setOverview(expectedValue);
        final String result = jTvseasondetailsResponse.getOverview();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        final String result = jTvseasondetailsResponse.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvseasondetailsResponse.setName(expectedValue);
        final String result = jTvseasondetailsResponse.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonNumber with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testGetSeasonNumber() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        final Integer result = jTvseasondetailsResponse.getSeasonNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonNumber with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testSetSeasonNumber() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasondetailsResponse.setSeasonNumber(expectedValue);
        final Integer result = jTvseasondetailsResponse.getSeasonNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        final String result = jTvseasondetailsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvseasondetailsResponse.setId(expectedValue);
        final String result = jTvseasondetailsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId1 with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testGetId1() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        final Integer result = jTvseasondetailsResponse.getId1();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId1 with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testSetId1() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasondetailsResponse.setId1(expectedValue);
        final Integer result = jTvseasondetailsResponse.getId1();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodes with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testGetEpisodes() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        final List result = jTvseasondetailsResponse.getEpisodes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodes with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testSetEpisodes() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Episodes> expectedValue = new ArrayList<>();
        Episodes episodesItem = new Episodes();
        expectedValue.add(episodesItem);
        jTvseasondetailsResponse.setEpisodes(expectedValue);
        final List<Episodes> result = jTvseasondetailsResponse.getEpisodes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPosterPath with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testGetPosterPath() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        final String result = jTvseasondetailsResponse.getPosterPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosterPath with an new JTvseasondetailsResponse.
     */
    @org.junit.Test
    public void testSetPosterPath() {
        // arrange : set up the test
        final JTvseasondetailsResponse jTvseasondetailsResponse = mock(JTvseasondetailsResponse.class);
        assert jTvseasondetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvseasondetailsResponse.setPosterPath(expectedValue);
        final String result = jTvseasondetailsResponse.getPosterPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}