package aka.jmetaagents.main.tvdb.series.seriesid;

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
 * JUnit skeleton for the JSeriesidQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidQuestion.class })
public class JSeriesidQuestion_JUnitTest {

    /**
     * getId with an new JSeriesidQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidQuestion jSeriesidQuestion = mock(JSeriesidQuestion.class);
        assert jSeriesidQuestion != null;

        // act : run the test
        final Integer result = jSeriesidQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidQuestion jSeriesidQuestion = mock(JSeriesidQuestion.class);
        assert jSeriesidQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidQuestion.setId(expectedValue);
        final Integer result = jSeriesidQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAcceptLanguage with an new JSeriesidQuestion.
     */
    @org.junit.Test
    public void testGetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidQuestion jSeriesidQuestion = mock(JSeriesidQuestion.class);
        assert jSeriesidQuestion != null;

        // act : run the test
        final String result = jSeriesidQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAcceptLanguage with an new JSeriesidQuestion.
     */
    @org.junit.Test
    public void testSetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidQuestion jSeriesidQuestion = mock(JSeriesidQuestion.class);
        assert jSeriesidQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidQuestion.setAcceptLanguage(expectedValue);
        final String result = jSeriesidQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}