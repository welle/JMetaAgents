package aka.jmetaagents.main.tvdb.search.searchseries;

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
 * JUnit skeleton for the JSearchseriesQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JSearchseriesQuestion.class })
public class JSearchseriesQuestion_JUnitTest {

    /**
     * getZap2itId with an new JSearchseriesQuestion.
     */
    @org.junit.Test
    public void testGetZap2itId() {
        // arrange : set up the test
        final JSearchseriesQuestion jSearchseriesQuestion = mock(JSearchseriesQuestion.class);
        assert jSearchseriesQuestion != null;

        // act : run the test
        final String result = jSearchseriesQuestion.getZap2itId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setZap2itId with an new JSearchseriesQuestion.
     */
    @org.junit.Test
    public void testSetZap2itId() {
        // arrange : set up the test
        final JSearchseriesQuestion jSearchseriesQuestion = mock(JSearchseriesQuestion.class);
        assert jSearchseriesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesQuestion.setZap2itId(expectedValue);
        final String result = jSearchseriesQuestion.getZap2itId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getImdbId with an new JSearchseriesQuestion.
     */
    @org.junit.Test
    public void testGetImdbId() {
        // arrange : set up the test
        final JSearchseriesQuestion jSearchseriesQuestion = mock(JSearchseriesQuestion.class);
        assert jSearchseriesQuestion != null;

        // act : run the test
        final String result = jSearchseriesQuestion.getImdbId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setImdbId with an new JSearchseriesQuestion.
     */
    @org.junit.Test
    public void testSetImdbId() {
        // arrange : set up the test
        final JSearchseriesQuestion jSearchseriesQuestion = mock(JSearchseriesQuestion.class);
        assert jSearchseriesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesQuestion.setImdbId(expectedValue);
        final String result = jSearchseriesQuestion.getImdbId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new JSearchseriesQuestion.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final JSearchseriesQuestion jSearchseriesQuestion = mock(JSearchseriesQuestion.class);
        assert jSearchseriesQuestion != null;

        // act : run the test
        final String result = jSearchseriesQuestion.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new JSearchseriesQuestion.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final JSearchseriesQuestion jSearchseriesQuestion = mock(JSearchseriesQuestion.class);
        assert jSearchseriesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesQuestion.setName(expectedValue);
        final String result = jSearchseriesQuestion.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAcceptLanguage with an new JSearchseriesQuestion.
     */
    @org.junit.Test
    public void testGetAcceptLanguage() {
        // arrange : set up the test
        final JSearchseriesQuestion jSearchseriesQuestion = mock(JSearchseriesQuestion.class);
        assert jSearchseriesQuestion != null;

        // act : run the test
        final String result = jSearchseriesQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAcceptLanguage with an new JSearchseriesQuestion.
     */
    @org.junit.Test
    public void testSetAcceptLanguage() {
        // arrange : set up the test
        final JSearchseriesQuestion jSearchseriesQuestion = mock(JSearchseriesQuestion.class);
        assert jSearchseriesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jSearchseriesQuestion.setAcceptLanguage(expectedValue);
        final String result = jSearchseriesQuestion.getAcceptLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}