package aka.jmetaagents.main.omdb.series.seriesbytitle;

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
 * JUnit skeleton for the JSeriesbytitleQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesbytitleQuestion.class })
public class JSeriesbytitleQuestion_JUnitTest {

    /**
     * getY with an new JSeriesbytitleQuestion.
     */
    @org.junit.Test
    public void testGetY() {
        // arrange : set up the test
        final JSeriesbytitleQuestion jSeriesbytitleQuestion = mock(JSeriesbytitleQuestion.class);
        assert jSeriesbytitleQuestion != null;

        // act : run the test
        final Integer result = jSeriesbytitleQuestion.getY();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setY with an new JSeriesbytitleQuestion.
     */
    @org.junit.Test
    public void testSetY() {
        // arrange : set up the test
        final JSeriesbytitleQuestion jSeriesbytitleQuestion = mock(JSeriesbytitleQuestion.class);
        assert jSeriesbytitleQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesbytitleQuestion.setY(expectedValue);
        final Integer result = jSeriesbytitleQuestion.getY();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JSeriesbytitleQuestion.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JSeriesbytitleQuestion jSeriesbytitleQuestion = mock(JSeriesbytitleQuestion.class);
        assert jSeriesbytitleQuestion != null;

        // act : run the test
        final String result = jSeriesbytitleQuestion.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JSeriesbytitleQuestion.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JSeriesbytitleQuestion jSeriesbytitleQuestion = mock(JSeriesbytitleQuestion.class);
        assert jSeriesbytitleQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesbytitleQuestion.setTitle(expectedValue);
        final String result = jSeriesbytitleQuestion.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}