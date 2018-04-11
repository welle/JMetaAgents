package aka.jmetaagents.main.omdb.series.seriesbyidimdb;

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
 * JUnit skeleton for the JSeriesbyidimdbQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSeriesbyidimdbQuestion.class })
public class JSeriesbyidimdbQuestion_JUnitTest {

    /**
     * getImdbid with an new JSeriesbyidimdbQuestion.
     */
    @org.junit.Test
    public void testGetImdbid() {
        // arrange : set up the test
        final JSeriesbyidimdbQuestion jSeriesbyidimdbQuestion = mock(JSeriesbyidimdbQuestion.class);
        assert jSeriesbyidimdbQuestion != null;

        // act : run the test
        final Integer result = jSeriesbyidimdbQuestion.getImdbid();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbid with an new JSeriesbyidimdbQuestion.
     */
    @org.junit.Test
    public void testSetImdbid() {
        // arrange : set up the test
        final JSeriesbyidimdbQuestion jSeriesbyidimdbQuestion = mock(JSeriesbyidimdbQuestion.class);
        assert jSeriesbyidimdbQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesbyidimdbQuestion.setImdbid(expectedValue);
        final Integer result = jSeriesbyidimdbQuestion.getImdbid();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getY with an new JSeriesbyidimdbQuestion.
     */
    @org.junit.Test
    public void testGetY() {
        // arrange : set up the test
        final JSeriesbyidimdbQuestion jSeriesbyidimdbQuestion = mock(JSeriesbyidimdbQuestion.class);
        assert jSeriesbyidimdbQuestion != null;

        // act : run the test
        final Integer result = jSeriesbyidimdbQuestion.getY();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setY with an new JSeriesbyidimdbQuestion.
     */
    @org.junit.Test
    public void testSetY() {
        // arrange : set up the test
        final JSeriesbyidimdbQuestion jSeriesbyidimdbQuestion = mock(JSeriesbyidimdbQuestion.class);
        assert jSeriesbyidimdbQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jSeriesbyidimdbQuestion.setY(expectedValue);
        final Integer result = jSeriesbyidimdbQuestion.getY();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}