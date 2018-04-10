package aka.jmetaagents.main.tmdb.find.findbyimdbid;

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
 * JUnit skeleton for the JFindbyimdbidQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JFindbyimdbidQuestion.class })
public class JFindbyimdbidQuestion_JUnitTest {

    /**
     * getExternalId with an new JFindbyimdbidQuestion.
     */
    @org.junit.Test
    public void testGetExternalId() {
        // arrange : set up the test
        final JFindbyimdbidQuestion jFindbyimdbidQuestion = mock(JFindbyimdbidQuestion.class);
        assert jFindbyimdbidQuestion != null;

        // act : run the test
        final Integer result = jFindbyimdbidQuestion.getExternalId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setExternalId with an new JFindbyimdbidQuestion.
     */
    @org.junit.Test
    public void testSetExternalId() {
        // arrange : set up the test
        final JFindbyimdbidQuestion jFindbyimdbidQuestion = mock(JFindbyimdbidQuestion.class);
        assert jFindbyimdbidQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jFindbyimdbidQuestion.setExternalId(expectedValue);
        final Integer result = jFindbyimdbidQuestion.getExternalId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JFindbyimdbidQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JFindbyimdbidQuestion jFindbyimdbidQuestion = mock(JFindbyimdbidQuestion.class);
        assert jFindbyimdbidQuestion != null;

        // act : run the test
        final String result = jFindbyimdbidQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JFindbyimdbidQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JFindbyimdbidQuestion jFindbyimdbidQuestion = mock(JFindbyimdbidQuestion.class);
        assert jFindbyimdbidQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jFindbyimdbidQuestion.setLanguage(expectedValue);
        final String result = jFindbyimdbidQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}