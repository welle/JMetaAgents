package aka.jmetaagents.main.tvdb.authentication.login;

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
 * JUnit skeleton for the JLoginResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JLoginResponse.class })
public class JLoginResponse_JUnitTest {

    /**
     * getToken with an new JLoginResponse.
     */
    @org.junit.Test
    public void testGetToken() {
        // arrange : set up the test
        final JLoginResponse jLoginResponse = mock(JLoginResponse.class);
        assert jLoginResponse != null;

        // act : run the test
        final String result = jLoginResponse.getToken();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setToken with an new JLoginResponse.
     */
    @org.junit.Test
    public void testSetToken() {
        // arrange : set up the test
        final JLoginResponse jLoginResponse = mock(JLoginResponse.class);
        assert jLoginResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jLoginResponse.setToken(expectedValue);
        final String result = jLoginResponse.getToken();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}