package aka.jmetaagents.main.tmdb.collections.collectionsdetails;

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
 * JUnit skeleton for the JCollectionsdetailsResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCollectionsdetailsResponse.class })
public class JCollectionsdetailsResponse_JUnitTest {

    /**
     * getBackdropPath with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testGetBackdropPath() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        final String result = jCollectionsdetailsResponse.getBackdropPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setBackdropPath with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testSetBackdropPath() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCollectionsdetailsResponse.setBackdropPath(expectedValue);
        final String result = jCollectionsdetailsResponse.getBackdropPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOverview with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testGetOverview() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        final String result = jCollectionsdetailsResponse.getOverview();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOverview with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testSetOverview() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCollectionsdetailsResponse.setOverview(expectedValue);
        final String result = jCollectionsdetailsResponse.getOverview();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        final String result = jCollectionsdetailsResponse.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCollectionsdetailsResponse.setName(expectedValue);
        final String result = jCollectionsdetailsResponse.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getParts with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testGetParts() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        final List result = jCollectionsdetailsResponse.getParts();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setParts with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testSetParts() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final List<Parts> expectedValue = new ArrayList<>();
        Parts partsItem = new Parts();
        expectedValue.add(partsItem);
        jCollectionsdetailsResponse.setParts(expectedValue);
        final List<Parts> result = jCollectionsdetailsResponse.getParts();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        final Integer result = jCollectionsdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCollectionsdetailsResponse.setId(expectedValue);
        final Integer result = jCollectionsdetailsResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getPosterPath with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testGetPosterPath() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        final String result = jCollectionsdetailsResponse.getPosterPath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setPosterPath with an new JCollectionsdetailsResponse.
     */
    @org.junit.Test
    public void testSetPosterPath() {
        // arrange : set up the test
        final JCollectionsdetailsResponse jCollectionsdetailsResponse = mock(JCollectionsdetailsResponse.class);
        assert jCollectionsdetailsResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCollectionsdetailsResponse.setPosterPath(expectedValue);
        final String result = jCollectionsdetailsResponse.getPosterPath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}