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
 * JUnit skeleton for the JGuestQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JGuestQuestion.class })
public class JGuestQuestion_JUnitTest {

    /**
     * getApikey with an new JGuestQuestion.
     */
    @org.junit.Test
    public void testGetApikey() {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = mock(JGuestQuestion.class);
        assert jGuestQuestion != null;

        // act : run the test
        final String result = jGuestQuestion.getApikey();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setApikey with an new JGuestQuestion.
     */
    @org.junit.Test
    public void testSetApikey() {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = mock(JGuestQuestion.class);
        assert jGuestQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jGuestQuestion.setApikey(expectedValue);
        final String result = jGuestQuestion.getApikey();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}