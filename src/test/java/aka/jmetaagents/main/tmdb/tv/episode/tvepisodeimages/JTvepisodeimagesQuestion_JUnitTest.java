package aka.jmetaagents.main.tmdb.tv.episode.tvepisodeimages;

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
 * JUnit skeleton for the JTvepisodeimagesQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvepisodeimagesQuestion.class })
public class JTvepisodeimagesQuestion_JUnitTest {

    /**
     * getTvId with an new JTvepisodeimagesQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvepisodeimagesQuestion jTvepisodeimagesQuestion = mock(JTvepisodeimagesQuestion.class);
        assert jTvepisodeimagesQuestion != null;

        // act : run the test
        final Integer result = jTvepisodeimagesQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvepisodeimagesQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvepisodeimagesQuestion jTvepisodeimagesQuestion = mock(JTvepisodeimagesQuestion.class);
        assert jTvepisodeimagesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeimagesQuestion.setTvId(expectedValue);
        final Integer result = jTvepisodeimagesQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodeNumber with an new JTvepisodeimagesQuestion.
     */
    @org.junit.Test
    public void testGetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodeimagesQuestion jTvepisodeimagesQuestion = mock(JTvepisodeimagesQuestion.class);
        assert jTvepisodeimagesQuestion != null;

        // act : run the test
        final Integer result = jTvepisodeimagesQuestion.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodeNumber with an new JTvepisodeimagesQuestion.
     */
    @org.junit.Test
    public void testSetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodeimagesQuestion jTvepisodeimagesQuestion = mock(JTvepisodeimagesQuestion.class);
        assert jTvepisodeimagesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeimagesQuestion.setEpisodeNumber(expectedValue);
        final Integer result = jTvepisodeimagesQuestion.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonNumber with an new JTvepisodeimagesQuestion.
     */
    @org.junit.Test
    public void testGetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodeimagesQuestion jTvepisodeimagesQuestion = mock(JTvepisodeimagesQuestion.class);
        assert jTvepisodeimagesQuestion != null;

        // act : run the test
        final Integer result = jTvepisodeimagesQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonNumber with an new JTvepisodeimagesQuestion.
     */
    @org.junit.Test
    public void testSetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodeimagesQuestion jTvepisodeimagesQuestion = mock(JTvepisodeimagesQuestion.class);
        assert jTvepisodeimagesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodeimagesQuestion.setSeasonNumber(expectedValue);
        final Integer result = jTvepisodeimagesQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}