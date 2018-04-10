package aka.jmetaagents.main.tvdb.series.seriesidepisodessummary;

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
 * JUnit skeleton for the JSeriesidepisodessummaryQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidepisodessummaryQuestion.class })
public class JSeriesidepisodessummaryQuestion_JUnitTest {

    /**
     * getId with an new JSeriesidepisodessummaryQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidepisodessummaryQuestion jSeriesidepisodessummaryQuestion = mock(JSeriesidepisodessummaryQuestion.class);
        assert jSeriesidepisodessummaryQuestion != null;

        // act : run the test
        final Integer result = jSeriesidepisodessummaryQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidepisodessummaryQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidepisodessummaryQuestion jSeriesidepisodessummaryQuestion = mock(JSeriesidepisodessummaryQuestion.class);
        assert jSeriesidepisodessummaryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidepisodessummaryQuestion.setId(expectedValue);
        final Integer result = jSeriesidepisodessummaryQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}