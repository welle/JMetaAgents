package aka.jmetaagents.main.tmdb.tv.season.tvseasondetails;

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
 * JUnit skeleton for the JTvseasondetailsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvseasondetailsQuestion.class })
public class JTvseasondetailsQuestion_JUnitTest {

    /**
     * getTvId with an new JTvseasondetailsQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvseasondetailsQuestion jTvseasondetailsQuestion = mock(JTvseasondetailsQuestion.class);
        assert jTvseasondetailsQuestion != null;

        // act : run the test
        final Integer result = jTvseasondetailsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvseasondetailsQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvseasondetailsQuestion jTvseasondetailsQuestion = mock(JTvseasondetailsQuestion.class);
        assert jTvseasondetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasondetailsQuestion.setTvId(expectedValue);
        final Integer result = jTvseasondetailsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonNumber with an new JTvseasondetailsQuestion.
     */
    @org.junit.Test
    public void testGetSeasonNumber() {
        // arrange : set up the test
        final JTvseasondetailsQuestion jTvseasondetailsQuestion = mock(JTvseasondetailsQuestion.class);
        assert jTvseasondetailsQuestion != null;

        // act : run the test
        final Integer result = jTvseasondetailsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonNumber with an new JTvseasondetailsQuestion.
     */
    @org.junit.Test
    public void testSetSeasonNumber() {
        // arrange : set up the test
        final JTvseasondetailsQuestion jTvseasondetailsQuestion = mock(JTvseasondetailsQuestion.class);
        assert jTvseasondetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasondetailsQuestion.setSeasonNumber(expectedValue);
        final Integer result = jTvseasondetailsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JTvseasondetailsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JTvseasondetailsQuestion jTvseasondetailsQuestion = mock(JTvseasondetailsQuestion.class);
        assert jTvseasondetailsQuestion != null;

        // act : run the test
        final String result = jTvseasondetailsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JTvseasondetailsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JTvseasondetailsQuestion jTvseasondetailsQuestion = mock(JTvseasondetailsQuestion.class);
        assert jTvseasondetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvseasondetailsQuestion.setLanguage(expectedValue);
        final String result = jTvseasondetailsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}