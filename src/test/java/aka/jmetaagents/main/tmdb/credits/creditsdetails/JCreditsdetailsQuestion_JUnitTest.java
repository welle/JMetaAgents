package aka.jmetaagents.main.tmdb.credits.creditsdetails;

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
 * JUnit skeleton for the JCreditsdetailsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCreditsdetailsQuestion.class })
public class JCreditsdetailsQuestion_JUnitTest {

    /**
     * getCreditId with an new JCreditsdetailsQuestion.
     */
    @org.junit.Test
    public void testGetCreditId() {
        // arrange : set up the test
        final JCreditsdetailsQuestion jCreditsdetailsQuestion = mock(JCreditsdetailsQuestion.class);
        assert jCreditsdetailsQuestion != null;

        // act : run the test
        final Integer result = jCreditsdetailsQuestion.getCreditId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCreditId with an new JCreditsdetailsQuestion.
     */
    @org.junit.Test
    public void testSetCreditId() {
        // arrange : set up the test
        final JCreditsdetailsQuestion jCreditsdetailsQuestion = mock(JCreditsdetailsQuestion.class);
        assert jCreditsdetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCreditsdetailsQuestion.setCreditId(expectedValue);
        final Integer result = jCreditsdetailsQuestion.getCreditId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}