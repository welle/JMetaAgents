package aka.jmetaagents.main.tmdb.tv.tvexternalids;

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
 * JUnit skeleton for the JTvexternalidsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvexternalidsResponse.class })
public class JTvexternalidsResponse_JUnitTest {

    /**
     * getImdbId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testGetImdbId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        final String result = jTvexternalidsResponse.getImdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testSetImdbId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvexternalidsResponse.setImdbId(expectedValue);
        final String result = jTvexternalidsResponse.getImdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFreebaseMid with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testGetFreebaseMid() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        final String result = jTvexternalidsResponse.getFreebaseMid();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFreebaseMid with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testSetFreebaseMid() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvexternalidsResponse.setFreebaseMid(expectedValue);
        final String result = jTvexternalidsResponse.getFreebaseMid();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTvdbId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testGetTvdbId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        final Integer result = jTvexternalidsResponse.getTvdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvdbId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testSetTvdbId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvexternalidsResponse.setTvdbId(expectedValue);
        final Integer result = jTvexternalidsResponse.getTvdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFreebaseId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testGetFreebaseId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        final String result = jTvexternalidsResponse.getFreebaseId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFreebaseId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testSetFreebaseId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvexternalidsResponse.setFreebaseId(expectedValue);
        final String result = jTvexternalidsResponse.getFreebaseId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        final Integer result = jTvexternalidsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvexternalidsResponse.setId(expectedValue);
        final Integer result = jTvexternalidsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTwitterId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testGetTwitterId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        final String result = jTvexternalidsResponse.getTwitterId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTwitterId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testSetTwitterId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvexternalidsResponse.setTwitterId(expectedValue);
        final String result = jTvexternalidsResponse.getTwitterId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTvrageId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testGetTvrageId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        final Integer result = jTvexternalidsResponse.getTvrageId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvrageId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testSetTvrageId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvexternalidsResponse.setTvrageId(expectedValue);
        final Integer result = jTvexternalidsResponse.getTvrageId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getFacebookId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testGetFacebookId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        final String result = jTvexternalidsResponse.getFacebookId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setFacebookId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testSetFacebookId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvexternalidsResponse.setFacebookId(expectedValue);
        final String result = jTvexternalidsResponse.getFacebookId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getInstagramId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testGetInstagramId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        final String result = jTvexternalidsResponse.getInstagramId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setInstagramId with an new JTvexternalidsResponse.
     */
    @org.junit.Test
    public void testSetInstagramId() {
        // arrange : set up the test
        final JTvexternalidsResponse jTvexternalidsResponse = mock(JTvexternalidsResponse.class);
        assert jTvexternalidsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvexternalidsResponse.setInstagramId(expectedValue);
        final String result = jTvexternalidsResponse.getInstagramId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}