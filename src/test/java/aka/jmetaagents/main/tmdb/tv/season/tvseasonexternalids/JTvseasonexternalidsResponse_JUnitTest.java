package aka.jmetaagents.main.tmdb.tv.season.tvseasonexternalids;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the JTvseasonexternalidsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvseasonexternalidsResponse.class })
public class JTvseasonexternalidsResponse_JUnitTest {

    /**
     * getFreebaseMid with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testGetFreebaseMid() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        final String result = jTvseasonexternalidsResponse.getFreebaseMid();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFreebaseMid with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testSetFreebaseMid() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvseasonexternalidsResponse.setFreebaseMid(expectedValue);
        final String result = jTvseasonexternalidsResponse.getFreebaseMid();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTvdbId with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testGetTvdbId() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        final Integer result = jTvseasonexternalidsResponse.getTvdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvdbId with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testSetTvdbId() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasonexternalidsResponse.setTvdbId(expectedValue);
        final Integer result = jTvseasonexternalidsResponse.getTvdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFreebaseId with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testGetFreebaseId() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        final String result = jTvseasonexternalidsResponse.getFreebaseId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFreebaseId with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testSetFreebaseId() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvseasonexternalidsResponse.setFreebaseId(expectedValue);
        final String result = jTvseasonexternalidsResponse.getFreebaseId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        final Integer result = jTvseasonexternalidsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasonexternalidsResponse.setId(expectedValue);
        final Integer result = jTvseasonexternalidsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTvrageId with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testGetTvrageId() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        final String result = jTvseasonexternalidsResponse.getTvrageId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvrageId with an new JTvseasonexternalidsResponse.
     */
    @org.junit.Test
    public void testSetTvrageId() {
        // arrange : set up the test
        final JTvseasonexternalidsResponse jTvseasonexternalidsResponse = mock(JTvseasonexternalidsResponse.class);
        assert jTvseasonexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvseasonexternalidsResponse.setTvrageId(expectedValue);
        final String result = jTvseasonexternalidsResponse.getTvrageId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}