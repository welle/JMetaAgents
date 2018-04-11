package aka.jmetaagents.main.omdb.episode.episodebytitle;

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
 * JUnit skeleton for the JEpisodebytitleQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JEpisodebytitleQuestion.class })
public class JEpisodebytitleQuestion_JUnitTest {

    /**
     * getY with an new JEpisodebytitleQuestion.
     */
    @org.junit.Test
    public void testGetY() {
        // arrange : set up the test
        final JEpisodebytitleQuestion jEpisodebytitleQuestion = mock(JEpisodebytitleQuestion.class);
        assert jEpisodebytitleQuestion != null;

        // act : run the test
        final Integer result = jEpisodebytitleQuestion.getY();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setY with an new JEpisodebytitleQuestion.
     */
    @org.junit.Test
    public void testSetY() {
        // arrange : set up the test
        final JEpisodebytitleQuestion jEpisodebytitleQuestion = mock(JEpisodebytitleQuestion.class);
        assert jEpisodebytitleQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jEpisodebytitleQuestion.setY(expectedValue);
        final Integer result = jEpisodebytitleQuestion.getY();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getTitle with an new JEpisodebytitleQuestion.
     */
    @org.junit.Test
    public void testGetTitle() {
        // arrange : set up the test
        final JEpisodebytitleQuestion jEpisodebytitleQuestion = mock(JEpisodebytitleQuestion.class);
        assert jEpisodebytitleQuestion != null;

        // act : run the test
        final String result = jEpisodebytitleQuestion.getTitle();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setTitle with an new JEpisodebytitleQuestion.
     */
    @org.junit.Test
    public void testSetTitle() {
        // arrange : set up the test
        final JEpisodebytitleQuestion jEpisodebytitleQuestion = mock(JEpisodebytitleQuestion.class);
        assert jEpisodebytitleQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jEpisodebytitleQuestion.setTitle(expectedValue);
        final String result = jEpisodebytitleQuestion.getTitle();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}