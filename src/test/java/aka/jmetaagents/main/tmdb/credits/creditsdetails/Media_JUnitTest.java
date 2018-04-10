package aka.jmetaagents.main.tmdb.credits.creditsdetails;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * JUnit skeleton for the Media object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Media.class })
public class Media_JUnitTest {

    /**
     * getCharacter with an new Media.
     */
    @org.junit.Test
    public void testGetCharacter() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        final String result = media.getCharacter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCharacter with an new Media.
     */
    @org.junit.Test
    public void testSetCharacter() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        media.setCharacter(expectedValue);
        final String result = media.getCharacter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSeasons with an new Media.
     */
    @org.junit.Test
    public void testGetSeasons() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        final List result = media.getSeasons();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSeasons with an new Media.
     */
    @org.junit.Test
    public void testSetSeasons() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        // TODO set proper expected value
        final List<Seasons> expectedValue = new ArrayList<>();
        Seasons seasonsItem = new Seasons();
        expectedValue.add(seasonsItem);
        media.setSeasons(expectedValue);
        final List<Seasons> result = media.getSeasons();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOriginalName with an new Media.
     */
    @org.junit.Test
    public void testGetOriginalName() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        final String result = media.getOriginalName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOriginalName with an new Media.
     */
    @org.junit.Test
    public void testSetOriginalName() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        media.setOriginalName(expectedValue);
        final String result = media.getOriginalName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new Media.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        final String result = media.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Media.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        media.setName(expectedValue);
        final String result = media.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Media.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        final Integer result = media.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Media.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        media.setId(expectedValue);
        final Integer result = media.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEpisodes with an new Media.
     */
    @org.junit.Test
    public void testGetEpisodes() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        final List result = media.getEpisodes();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEpisodes with an new Media.
     */
    @org.junit.Test
    public void testSetEpisodes() {
        // arrange : set up the test
        final Media media = mock(Media.class);
        assert media != null;

        // act : run the test
        // TODO set proper expected value
        final List<String> expectedValue = new ArrayList<>();
        String stringItem = new String();
        expectedValue.add(stringItem);
        media.setEpisodes(expectedValue);
        final List<String> result = media.getEpisodes();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}