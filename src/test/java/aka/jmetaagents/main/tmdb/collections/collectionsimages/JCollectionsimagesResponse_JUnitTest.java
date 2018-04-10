package aka.jmetaagents.main.tmdb.collections.collectionsimages;

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
 * JUnit skeleton for the JCollectionsimagesResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCollectionsimagesResponse.class })
public class JCollectionsimagesResponse_JUnitTest {

    /**
     * getBackdrops with an new JCollectionsimagesResponse.
     */
    @org.junit.Test
    public void testGetBackdrops() {
        // arrange : set up the test
        final JCollectionsimagesResponse jCollectionsimagesResponse = mock(JCollectionsimagesResponse.class);
        assert jCollectionsimagesResponse != null;

        // act : run the test
        final List result = jCollectionsimagesResponse.getBackdrops();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBackdrops with an new JCollectionsimagesResponse.
     */
    @org.junit.Test
    public void testSetBackdrops() {
        // arrange : set up the test
        final JCollectionsimagesResponse jCollectionsimagesResponse = mock(JCollectionsimagesResponse.class);
        assert jCollectionsimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Backdrops> expectedValue = new ArrayList<>();
        Backdrops backdropsItem = new Backdrops();
        expectedValue.add(backdropsItem);
        jCollectionsimagesResponse.setBackdrops(expectedValue);
        final List<Backdrops> result = jCollectionsimagesResponse.getBackdrops();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPosters with an new JCollectionsimagesResponse.
     */
    @org.junit.Test
    public void testGetPosters() {
        // arrange : set up the test
        final JCollectionsimagesResponse jCollectionsimagesResponse = mock(JCollectionsimagesResponse.class);
        assert jCollectionsimagesResponse != null;

        // act : run the test
        final List result = jCollectionsimagesResponse.getPosters();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosters with an new JCollectionsimagesResponse.
     */
    @org.junit.Test
    public void testSetPosters() {
        // arrange : set up the test
        final JCollectionsimagesResponse jCollectionsimagesResponse = mock(JCollectionsimagesResponse.class);
        assert jCollectionsimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Posters> expectedValue = new ArrayList<>();
        Posters postersItem = new Posters();
        expectedValue.add(postersItem);
        jCollectionsimagesResponse.setPosters(expectedValue);
        final List<Posters> result = jCollectionsimagesResponse.getPosters();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JCollectionsimagesResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JCollectionsimagesResponse jCollectionsimagesResponse = mock(JCollectionsimagesResponse.class);
        assert jCollectionsimagesResponse != null;

        // act : run the test
        final Integer result = jCollectionsimagesResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JCollectionsimagesResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JCollectionsimagesResponse jCollectionsimagesResponse = mock(JCollectionsimagesResponse.class);
        assert jCollectionsimagesResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCollectionsimagesResponse.setId(expectedValue);
        final Integer result = jCollectionsimagesResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}