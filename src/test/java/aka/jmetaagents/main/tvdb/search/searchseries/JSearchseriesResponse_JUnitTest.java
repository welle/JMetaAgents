package aka.jmetaagents.main.tvdb.search.searchseries;

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
 * JUnit skeleton for the JSearchseriesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSearchseriesResponse.class })
public class JSearchseriesResponse_JUnitTest {

    /**
     * getOverview with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testGetOverview() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        final String result = jSearchseriesResponse.getOverview();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOverview with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testSetOverview() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesResponse.setOverview(expectedValue);
        final String result = jSearchseriesResponse.getOverview();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAliases with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testGetAliases() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        final List result = jSearchseriesResponse.getAliases();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAliases with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testSetAliases() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        jSearchseriesResponse.setAliases(expectedValue);
        final List<String> result = jSearchseriesResponse.getAliases();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeriesName with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testGetSeriesName() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        final String result = jSearchseriesResponse.getSeriesName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeriesName with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testSetSeriesName() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesResponse.setSeriesName(expectedValue);
        final String result = jSearchseriesResponse.getSeriesName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFirstAired with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testGetFirstAired() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        final String result = jSearchseriesResponse.getFirstAired();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFirstAired with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testSetFirstAired() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesResponse.setFirstAired(expectedValue);
        final String result = jSearchseriesResponse.getFirstAired();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getBanner with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testGetBanner() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        final String result = jSearchseriesResponse.getBanner();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBanner with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testSetBanner() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesResponse.setBanner(expectedValue);
        final String result = jSearchseriesResponse.getBanner();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        final Integer result = jSearchseriesResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSearchseriesResponse.setId(expectedValue);
        final Integer result = jSearchseriesResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getNetwork with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testGetNetwork() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        final String result = jSearchseriesResponse.getNetwork();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setNetwork with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testSetNetwork() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesResponse.setNetwork(expectedValue);
        final String result = jSearchseriesResponse.getNetwork();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getStatus with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testGetStatus() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        final String result = jSearchseriesResponse.getStatus();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setStatus with an new JSearchseriesResponse.
     */
    @org.junit.Test
    public void testSetStatus() {
        // arrange : set up the test
        final JSearchseriesResponse jSearchseriesResponse = mock(JSearchseriesResponse.class);
        assert jSearchseriesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesResponse.setStatus(expectedValue);
        final String result = jSearchseriesResponse.getStatus();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}