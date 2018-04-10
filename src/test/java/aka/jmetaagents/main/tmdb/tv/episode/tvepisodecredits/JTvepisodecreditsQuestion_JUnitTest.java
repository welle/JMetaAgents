package aka.jmetaagents.main.tmdb.tv.episode.tvepisodecredits;

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
 * JUnit skeleton for the JTvepisodecreditsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JTvepisodecreditsQuestion.class })
public class JTvepisodecreditsQuestion_JUnitTest {

    /**
     * getTvId with an new JTvepisodecreditsQuestion.
     */
    @org.junit.Test
    public void testGetTvId() {
        // arrange : set up the test
        final JTvepisodecreditsQuestion jTvepisodecreditsQuestion = mock(JTvepisodecreditsQuestion.class);
        assert jTvepisodecreditsQuestion != null;

        // act : run the test
        final Integer result = jTvepisodecreditsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTvId with an new JTvepisodecreditsQuestion.
     */
    @org.junit.Test
    public void testSetTvId() {
        // arrange : set up the test
        final JTvepisodecreditsQuestion jTvepisodecreditsQuestion = mock(JTvepisodecreditsQuestion.class);
        assert jTvepisodecreditsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodecreditsQuestion.setTvId(expectedValue);
        final Integer result = jTvepisodecreditsQuestion.getTvId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodeNumber with an new JTvepisodecreditsQuestion.
     */
    @org.junit.Test
    public void testGetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodecreditsQuestion jTvepisodecreditsQuestion = mock(JTvepisodecreditsQuestion.class);
        assert jTvepisodecreditsQuestion != null;

        // act : run the test
        final Integer result = jTvepisodecreditsQuestion.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodeNumber with an new JTvepisodecreditsQuestion.
     */
    @org.junit.Test
    public void testSetEpisodeNumber() {
        // arrange : set up the test
        final JTvepisodecreditsQuestion jTvepisodecreditsQuestion = mock(JTvepisodecreditsQuestion.class);
        assert jTvepisodecreditsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodecreditsQuestion.setEpisodeNumber(expectedValue);
        final Integer result = jTvepisodecreditsQuestion.getEpisodeNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasonNumber with an new JTvepisodecreditsQuestion.
     */
    @org.junit.Test
    public void testGetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodecreditsQuestion jTvepisodecreditsQuestion = mock(JTvepisodecreditsQuestion.class);
        assert jTvepisodecreditsQuestion != null;

        // act : run the test
        final Integer result = jTvepisodecreditsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasonNumber with an new JTvepisodecreditsQuestion.
     */
    @org.junit.Test
    public void testSetSeasonNumber() {
        // arrange : set up the test
        final JTvepisodecreditsQuestion jTvepisodecreditsQuestion = mock(JTvepisodecreditsQuestion.class);
        assert jTvepisodecreditsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jTvepisodecreditsQuestion.setSeasonNumber(expectedValue);
        final Integer result = jTvepisodecreditsQuestion.getSeasonNumber();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}