package aka.jmetaagents.main.tvdb.series.seriesidimagesquery;

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
 * JUnit skeleton for the JSeriesidimagesqueryQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesidimagesqueryQuestion.class })
public class JSeriesidimagesqueryQuestion_JUnitTest {

    /**
     * getSubKey with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testGetSubKey() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidimagesqueryQuestion.getSubKey();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSubKey with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testSetSubKey() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidimagesqueryQuestion.setSubKey(expectedValue);
        final String result = jSeriesidimagesqueryQuestion.getSubKey();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        final Integer result = jSeriesidimagesqueryQuestion.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesidimagesqueryQuestion.setId(expectedValue);
        final Integer result = jSeriesidimagesqueryQuestion.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAcceptLanguage with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testGetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidimagesqueryQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAcceptLanguage with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testSetAcceptLanguage() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidimagesqueryQuestion.setAcceptLanguage(expectedValue);
        final String result = jSeriesidimagesqueryQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getKeyType with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testGetKeyType() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidimagesqueryQuestion.getKeyType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setKeyType with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testSetKeyType() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidimagesqueryQuestion.setKeyType(expectedValue);
        final String result = jSeriesidimagesqueryQuestion.getKeyType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getResolution with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testGetResolution() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        final String result = jSeriesidimagesqueryQuestion.getResolution();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setResolution with an new JSeriesidimagesqueryQuestion.
     */
    @org.junit.Test
    public void testSetResolution() {
        // arrange : set up the test
        final JSeriesidimagesqueryQuestion jSeriesidimagesqueryQuestion = mock(JSeriesidimagesqueryQuestion.class);
        assert jSeriesidimagesqueryQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSeriesidimagesqueryQuestion.setResolution(expectedValue);
        final String result = jSeriesidimagesqueryQuestion.getResolution();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}