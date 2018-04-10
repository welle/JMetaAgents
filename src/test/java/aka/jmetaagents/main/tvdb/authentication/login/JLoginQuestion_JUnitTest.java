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
 * JUnit skeleton for the JLoginQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JLoginQuestion.class })
public class JLoginQuestion_JUnitTest {

    /**
     * getApikey with an new JLoginQuestion.
     */
    @org.junit.Test
    public void testGetApikey() {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = mock(JLoginQuestion.class);
        assert jLoginQuestion != null;

        // act : run the test
        final String result = jLoginQuestion.getApikey();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setApikey with an new JLoginQuestion.
     */
    @org.junit.Test
    public void testSetApikey() {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = mock(JLoginQuestion.class);
        assert jLoginQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jLoginQuestion.setApikey(expectedValue);
        final String result = jLoginQuestion.getApikey();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getUserkey with an new JLoginQuestion.
     */
    @org.junit.Test
    public void testGetUserkey() {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = mock(JLoginQuestion.class);
        assert jLoginQuestion != null;

        // act : run the test
        final String result = jLoginQuestion.getUserkey();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setUserkey with an new JLoginQuestion.
     */
    @org.junit.Test
    public void testSetUserkey() {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = mock(JLoginQuestion.class);
        assert jLoginQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jLoginQuestion.setUserkey(expectedValue);
        final String result = jLoginQuestion.getUserkey();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getUsername with an new JLoginQuestion.
     */
    @org.junit.Test
    public void testGetUsername() {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = mock(JLoginQuestion.class);
        assert jLoginQuestion != null;

        // act : run the test
        final String result = jLoginQuestion.getUsername();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setUsername with an new JLoginQuestion.
     */
    @org.junit.Test
    public void testSetUsername() {
        // arrange : set up the test
        final JLoginQuestion jLoginQuestion = mock(JLoginQuestion.class);
        assert jLoginQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jLoginQuestion.setUsername(expectedValue);
        final String result = jLoginQuestion.getUsername();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}