package aka.jmetaagents.main.tmdb.tv.episode.tvepisodeexternalids;

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
 * JUnit skeleton for the JTvepisodeexternalidsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvepisodeexternalidsResponse.class })
public class JTvepisodeexternalidsResponse_JUnitTest {

    /**
     * getImdbId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testGetImdbId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        final String result = jTvepisodeexternalidsResponse.getImdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testSetImdbId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvepisodeexternalidsResponse.setImdbId(expectedValue);
        final String result = jTvepisodeexternalidsResponse.getImdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFreebaseMid with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testGetFreebaseMid() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        final String result = jTvepisodeexternalidsResponse.getFreebaseMid();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFreebaseMid with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testSetFreebaseMid() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvepisodeexternalidsResponse.setFreebaseMid(expectedValue);
        final String result = jTvepisodeexternalidsResponse.getFreebaseMid();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTvdbId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testGetTvdbId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        final Integer result = jTvepisodeexternalidsResponse.getTvdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvdbId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testSetTvdbId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeexternalidsResponse.setTvdbId(expectedValue);
        final Integer result = jTvepisodeexternalidsResponse.getTvdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFreebaseId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testGetFreebaseId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        final String result = jTvepisodeexternalidsResponse.getFreebaseId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFreebaseId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testSetFreebaseId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvepisodeexternalidsResponse.setFreebaseId(expectedValue);
        final String result = jTvepisodeexternalidsResponse.getFreebaseId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        final Integer result = jTvepisodeexternalidsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeexternalidsResponse.setId(expectedValue);
        final Integer result = jTvepisodeexternalidsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTvrageId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testGetTvrageId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        final Integer result = jTvepisodeexternalidsResponse.getTvrageId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvrageId with an new JTvepisodeexternalidsResponse.
     */
    @org.junit.Test
    public void testSetTvrageId() {
        // arrange : set up the test
        final JTvepisodeexternalidsResponse jTvepisodeexternalidsResponse = mock(JTvepisodeexternalidsResponse.class);
        assert jTvepisodeexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeexternalidsResponse.setTvrageId(expectedValue);
        final Integer result = jTvepisodeexternalidsResponse.getTvrageId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}