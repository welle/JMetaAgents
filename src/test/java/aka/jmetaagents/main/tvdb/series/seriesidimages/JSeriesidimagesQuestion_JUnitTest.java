package aka.jmetaagents.main.tvdb.series.seriesidimages;

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
 * JUnit skeleton for the JSeriesidimagesQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidimagesQuestion.class })
public class JSeriesidimagesQuestion_JUnitTest {

    /**
     * getId with an new JSeriesidimagesQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidimagesQuestion jSeriesidimagesQuestion = mock(JSeriesidimagesQuestion.class);
        assert jSeriesidimagesQuestion != null;

        // act : run the test
        final Integer result = jSeriesidimagesQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidimagesQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidimagesQuestion jSeriesidimagesQuestion = mock(JSeriesidimagesQuestion.class);
        assert jSeriesidimagesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidimagesQuestion.setId(expectedValue);
        final Integer result = jSeriesidimagesQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAcceptLanguage with an new JSeriesidimagesQuestion.
     */
    @org.junit.Test
    public void testGetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidimagesQuestion jSeriesidimagesQuestion = mock(JSeriesidimagesQuestion.class);
        assert jSeriesidimagesQuestion != null;

        // act : run the test
        final String result = jSeriesidimagesQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAcceptLanguage with an new JSeriesidimagesQuestion.
     */
    @org.junit.Test
    public void testSetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidimagesQuestion jSeriesidimagesQuestion = mock(JSeriesidimagesQuestion.class);
        assert jSeriesidimagesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidimagesQuestion.setAcceptLanguage(expectedValue);
        final String result = jSeriesidimagesQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}