package aka.jmetaagents.main.tmdb.authentification.guest;

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
 * JUnit skeleton for the JGuestResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JGuestResponse.class })
public class JGuestResponse_JUnitTest {

    /**
     * getExpiresAt with an new JGuestResponse.
     */
    @org.junit.Test
    public void testGetExpiresAt() {
        // arrange : set up the test
        final JGuestResponse jGuestResponse = mock(JGuestResponse.class);
        assert jGuestResponse != null;

        // act : run the test
        final String result = jGuestResponse.getExpiresAt();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setExpiresAt with an new JGuestResponse.
     */
    @org.junit.Test
    public void testSetExpiresAt() {
        // arrange : set up the test
        final JGuestResponse jGuestResponse = mock(JGuestResponse.class);
        assert jGuestResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jGuestResponse.setExpiresAt(expectedValue);
        final String result = jGuestResponse.getExpiresAt();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGuestSessionId with an new JGuestResponse.
     */
    @org.junit.Test
    public void testGetGuestSessionId() {
        // arrange : set up the test
        final JGuestResponse jGuestResponse = mock(JGuestResponse.class);
        assert jGuestResponse != null;

        // act : run the test
        final String result = jGuestResponse.getGuestSessionId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGuestSessionId with an new JGuestResponse.
     */
    @org.junit.Test
    public void testSetGuestSessionId() {
        // arrange : set up the test
        final JGuestResponse jGuestResponse = mock(JGuestResponse.class);
        assert jGuestResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jGuestResponse.setGuestSessionId(expectedValue);
        final String result = jGuestResponse.getGuestSessionId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSuccess with an new JGuestResponse.
     */
    @org.junit.Test
    public void testGetSuccess() {
        // arrange : set up the test
        final JGuestResponse jGuestResponse = mock(JGuestResponse.class);
        assert jGuestResponse != null;

        // act : run the test
        final Boolean result = jGuestResponse.getSuccess();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSuccess with an new JGuestResponse.
     */
    @org.junit.Test
    public void testSetSuccess() {
        // arrange : set up the test
        final JGuestResponse jGuestResponse = mock(JGuestResponse.class);
        assert jGuestResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Boolean expectedValue = null;
        jGuestResponse.setSuccess(expectedValue);
        final Boolean result = jGuestResponse.getSuccess();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}