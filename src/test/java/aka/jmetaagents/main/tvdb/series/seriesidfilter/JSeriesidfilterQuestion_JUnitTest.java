package aka.jmetaagents.main.tvdb.series.seriesidfilter;

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
 * JUnit skeleton for the JSeriesidfilterQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidfilterQuestion.class })
public class JSeriesidfilterQuestion_JUnitTest {

    /**
     * getKeys with an new JSeriesidfilterQuestion.
     */
    @org.junit.Test
    public void testGetKeys() {
        // arrange : set up the test
        final JSeriesidfilterQuestion jSeriesidfilterQuestion = mock(JSeriesidfilterQuestion.class);
        assert jSeriesidfilterQuestion != null;

        // act : run the test
        final String result = jSeriesidfilterQuestion.getKeys();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setKeys with an new JSeriesidfilterQuestion.
     */
    @org.junit.Test
    public void testSetKeys() {
        // arrange : set up the test
        final JSeriesidfilterQuestion jSeriesidfilterQuestion = mock(JSeriesidfilterQuestion.class);
        assert jSeriesidfilterQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidfilterQuestion.setKeys(expectedValue);
        final String result = jSeriesidfilterQuestion.getKeys();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JSeriesidfilterQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidfilterQuestion jSeriesidfilterQuestion = mock(JSeriesidfilterQuestion.class);
        assert jSeriesidfilterQuestion != null;

        // act : run the test
        final Integer result = jSeriesidfilterQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidfilterQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidfilterQuestion jSeriesidfilterQuestion = mock(JSeriesidfilterQuestion.class);
        assert jSeriesidfilterQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidfilterQuestion.setId(expectedValue);
        final Integer result = jSeriesidfilterQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAcceptLanguage with an new JSeriesidfilterQuestion.
     */
    @org.junit.Test
    public void testGetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidfilterQuestion jSeriesidfilterQuestion = mock(JSeriesidfilterQuestion.class);
        assert jSeriesidfilterQuestion != null;

        // act : run the test
        final String result = jSeriesidfilterQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAcceptLanguage with an new JSeriesidfilterQuestion.
     */
    @org.junit.Test
    public void testSetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidfilterQuestion jSeriesidfilterQuestion = mock(JSeriesidfilterQuestion.class);
        assert jSeriesidfilterQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidfilterQuestion.setAcceptLanguage(expectedValue);
        final String result = jSeriesidfilterQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}