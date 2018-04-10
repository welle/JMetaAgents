package aka.jmetaagents.main.tmdb.tv.episode.tvepisodedetails;

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
 * JUnit skeleton for the JTvepisodedetailsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvepisodedetailsQuestion.class })
public class JTvepisodedetailsQuestion_JUnitTest {

    /**
     * getTvId with an new JTvepisodedetailsQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvepisodedetailsQuestion jTvepisodedetailsQuestion = mock(JTvepisodedetailsQuestion.class);
        assert jTvepisodedetailsQuestion != null;

        // act : run the test
        final Integer result = jTvepisodedetailsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvepisodedetailsQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvepisodedetailsQuestion jTvepisodedetailsQuestion = mock(JTvepisodedetailsQuestion.class);
        assert jTvepisodedetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodedetailsQuestion.setTvId(expectedValue);
        final Integer result = jTvepisodedetailsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodeNumber with an new JTvepisodedetailsQuestion.
     */
    @org.junit.Test
    public void testGetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodedetailsQuestion jTvepisodedetailsQuestion = mock(JTvepisodedetailsQuestion.class);
        assert jTvepisodedetailsQuestion != null;

        // act : run the test
        final Integer result = jTvepisodedetailsQuestion.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodeNumber with an new JTvepisodedetailsQuestion.
     */
    @org.junit.Test
    public void testSetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodedetailsQuestion jTvepisodedetailsQuestion = mock(JTvepisodedetailsQuestion.class);
        assert jTvepisodedetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodedetailsQuestion.setEpisodeNumber(expectedValue);
        final Integer result = jTvepisodedetailsQuestion.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonNumber with an new JTvepisodedetailsQuestion.
     */
    @org.junit.Test
    public void testGetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodedetailsQuestion jTvepisodedetailsQuestion = mock(JTvepisodedetailsQuestion.class);
        assert jTvepisodedetailsQuestion != null;

        // act : run the test
        final Integer result = jTvepisodedetailsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonNumber with an new JTvepisodedetailsQuestion.
     */
    @org.junit.Test
    public void testSetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodedetailsQuestion jTvepisodedetailsQuestion = mock(JTvepisodedetailsQuestion.class);
        assert jTvepisodedetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodedetailsQuestion.setSeasonNumber(expectedValue);
        final Integer result = jTvepisodedetailsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JTvepisodedetailsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JTvepisodedetailsQuestion jTvepisodedetailsQuestion = mock(JTvepisodedetailsQuestion.class);
        assert jTvepisodedetailsQuestion != null;

        // act : run the test
        final String result = jTvepisodedetailsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JTvepisodedetailsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JTvepisodedetailsQuestion jTvepisodedetailsQuestion = mock(JTvepisodedetailsQuestion.class);
        assert jTvepisodedetailsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jTvepisodedetailsQuestion.setLanguage(expectedValue);
        final String result = jTvepisodedetailsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}