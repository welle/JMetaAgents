package aka.jmetaagents.main.tmdb.tv.season.tvseasoncredits;

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
 * JUnit skeleton for the JTvseasoncreditsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvseasoncreditsQuestion.class })
public class JTvseasoncreditsQuestion_JUnitTest {

    /**
     * getTvId with an new JTvseasoncreditsQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvseasoncreditsQuestion jTvseasoncreditsQuestion = mock(JTvseasoncreditsQuestion.class);
        assert jTvseasoncreditsQuestion != null;

        // act : run the test
        final Integer result = jTvseasoncreditsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvseasoncreditsQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvseasoncreditsQuestion jTvseasoncreditsQuestion = mock(JTvseasoncreditsQuestion.class);
        assert jTvseasoncreditsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasoncreditsQuestion.setTvId(expectedValue);
        final Integer result = jTvseasoncreditsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonNumber with an new JTvseasoncreditsQuestion.
     */
    @org.junit.Test
    public void testGetSeasonNumber() {
        // arrange : set up the test
        final JTvseasoncreditsQuestion jTvseasoncreditsQuestion = mock(JTvseasoncreditsQuestion.class);
        assert jTvseasoncreditsQuestion != null;

        // act : run the test
        final Integer result = jTvseasoncreditsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonNumber with an new JTvseasoncreditsQuestion.
     */
    @org.junit.Test
    public void testSetSeasonNumber() {
        // arrange : set up the test
        final JTvseasoncreditsQuestion jTvseasoncreditsQuestion = mock(JTvseasoncreditsQuestion.class);
        assert jTvseasoncreditsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvseasoncreditsQuestion.setSeasonNumber(expectedValue);
        final Integer result = jTvseasoncreditsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JTvseasoncreditsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JTvseasoncreditsQuestion jTvseasoncreditsQuestion = mock(JTvseasoncreditsQuestion.class);
        assert jTvseasoncreditsQuestion != null;

        // act : run the test
        final String result = jTvseasoncreditsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JTvseasoncreditsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JTvseasoncreditsQuestion jTvseasoncreditsQuestion = mock(JTvseasoncreditsQuestion.class);
        assert jTvseasoncreditsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvseasoncreditsQuestion.setLanguage(expectedValue);
        final String result = jTvseasoncreditsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}