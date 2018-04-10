package aka.jmetaagents.main.tvdb.series.seriesidfilterparams;

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
 * JUnit skeleton for the JSeriesidfilterparamsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidfilterparamsQuestion.class })
public class JSeriesidfilterparamsQuestion_JUnitTest {

    /**
     * getId with an new JSeriesidfilterparamsQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidfilterparamsQuestion jSeriesidfilterparamsQuestion = mock(JSeriesidfilterparamsQuestion.class);
        assert jSeriesidfilterparamsQuestion != null;

        // act : run the test
        final Integer result = jSeriesidfilterparamsQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidfilterparamsQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidfilterparamsQuestion jSeriesidfilterparamsQuestion = mock(JSeriesidfilterparamsQuestion.class);
        assert jSeriesidfilterparamsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidfilterparamsQuestion.setId(expectedValue);
        final Integer result = jSeriesidfilterparamsQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAcceptLanguage with an new JSeriesidfilterparamsQuestion.
     */
    @org.junit.Test
    public void testGetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidfilterparamsQuestion jSeriesidfilterparamsQuestion = mock(JSeriesidfilterparamsQuestion.class);
        assert jSeriesidfilterparamsQuestion != null;

        // act : run the test
        final String result = jSeriesidfilterparamsQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAcceptLanguage with an new JSeriesidfilterparamsQuestion.
     */
    @org.junit.Test
    public void testSetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidfilterparamsQuestion jSeriesidfilterparamsQuestion = mock(JSeriesidfilterparamsQuestion.class);
        assert jSeriesidfilterparamsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidfilterparamsQuestion.setAcceptLanguage(expectedValue);
        final String result = jSeriesidfilterparamsQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}