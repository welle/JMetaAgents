package aka.jmetaagents.main.tvdb.authentication.refreshtoken;

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
 * JUnit skeleton for the JRefreshtokenResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JRefreshtokenResponse.class })
public class JRefreshtokenResponse_JUnitTest {

    /**
     * getToken with an new JRefreshtokenResponse.
     */
    @org.junit.Test
    public void testGetToken() {
        // arrange : set up the test
        final JRefreshtokenResponse jRefreshtokenResponse = mock(JRefreshtokenResponse.class);
        assert jRefreshtokenResponse != null;

        // act : run the test
        final String result = jRefreshtokenResponse.getToken();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setToken with an new JRefreshtokenResponse.
     */
    @org.junit.Test
    public void testSetToken() {
        // arrange : set up the test
        final JRefreshtokenResponse jRefreshtokenResponse = mock(JRefreshtokenResponse.class);
        assert jRefreshtokenResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jRefreshtokenResponse.setToken(expectedValue);
        final String result = jRefreshtokenResponse.getToken();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}