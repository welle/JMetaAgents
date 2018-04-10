package aka.jmetaagents.main.tvdb.series.seriesidepisodessummary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JSeriesidepisodessummaryResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidepisodessummaryResponse.class })
public class JSeriesidepisodessummaryResponse_JUnitTest {

    /**
     * getDvdEpisodes with an new JSeriesidepisodessummaryResponse.
     */
    @org.junit.Test
    public void testGetDvdEpisodes() {
        // arrange : set up the test
        final JSeriesidepisodessummaryResponse jSeriesidepisodessummaryResponse = mock(JSeriesidepisodessummaryResponse.class);
        assert jSeriesidepisodessummaryResponse != null;

        // act : run the test
        final String result = jSeriesidepisodessummaryResponse.getDvdEpisodes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDvdEpisodes with an new JSeriesidepisodessummaryResponse.
     */
    @org.junit.Test
    public void testSetDvdEpisodes() {
        // arrange : set up the test
        final JSeriesidepisodessummaryResponse jSeriesidepisodessummaryResponse = mock(JSeriesidepisodessummaryResponse.class);
        assert jSeriesidepisodessummaryResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodessummaryResponse.setDvdEpisodes(expectedValue);
        final String result = jSeriesidepisodessummaryResponse.getDvdEpisodes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getDvdSeasons with an new JSeriesidepisodessummaryResponse.
     */
    @org.junit.Test
    public void testGetDvdSeasons() {
        // arrange : set up the test
        final JSeriesidepisodessummaryResponse jSeriesidepisodessummaryResponse = mock(JSeriesidepisodessummaryResponse.class);
        assert jSeriesidepisodessummaryResponse != null;

        // act : run the test
        final List result = jSeriesidepisodessummaryResponse.getDvdSeasons();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setDvdSeasons with an new JSeriesidepisodessummaryResponse.
     */
    @org.junit.Test
    public void testSetDvdSeasons() {
        // arrange : set up the test
        final JSeriesidepisodessummaryResponse jSeriesidepisodessummaryResponse = mock(JSeriesidepisodessummaryResponse.class);
        assert jSeriesidepisodessummaryResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jSeriesidepisodessummaryResponse.setDvdSeasons(expectedValue);
        final List<String> result = jSeriesidepisodessummaryResponse.getDvdSeasons();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAiredSeasons with an new JSeriesidepisodessummaryResponse.
     */
    @org.junit.Test
    public void testGetAiredSeasons() {
        // arrange : set up the test
        final JSeriesidepisodessummaryResponse jSeriesidepisodessummaryResponse = mock(JSeriesidepisodessummaryResponse.class);
        assert jSeriesidepisodessummaryResponse != null;

        // act : run the test
        final List result = jSeriesidepisodessummaryResponse.getAiredSeasons();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAiredSeasons with an new JSeriesidepisodessummaryResponse.
     */
    @org.junit.Test
    public void testSetAiredSeasons() {
        // arrange : set up the test
        final JSeriesidepisodessummaryResponse jSeriesidepisodessummaryResponse = mock(JSeriesidepisodessummaryResponse.class);
        assert jSeriesidepisodessummaryResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jSeriesidepisodessummaryResponse.setAiredSeasons(expectedValue);
        final List<String> result = jSeriesidepisodessummaryResponse.getAiredSeasons();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAiredEpisodes with an new JSeriesidepisodessummaryResponse.
     */
    @org.junit.Test
    public void testGetAiredEpisodes() {
        // arrange : set up the test
        final JSeriesidepisodessummaryResponse jSeriesidepisodessummaryResponse = mock(JSeriesidepisodessummaryResponse.class);
        assert jSeriesidepisodessummaryResponse != null;

        // act : run the test
        final String result = jSeriesidepisodessummaryResponse.getAiredEpisodes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAiredEpisodes with an new JSeriesidepisodessummaryResponse.
     */
    @org.junit.Test
    public void testSetAiredEpisodes() {
        // arrange : set up the test
        final JSeriesidepisodessummaryResponse jSeriesidepisodessummaryResponse = mock(JSeriesidepisodessummaryResponse.class);
        assert jSeriesidepisodessummaryResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidepisodessummaryResponse.setAiredEpisodes(expectedValue);
        final String result = jSeriesidepisodessummaryResponse.getAiredEpisodes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}