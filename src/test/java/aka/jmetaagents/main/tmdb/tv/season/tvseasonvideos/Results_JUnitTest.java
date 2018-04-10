package aka.jmetaagents.main.tmdb.tv.season.tvseasonvideos;

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
 * JUnit skeleton for the Results object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Results.class })
public class Results_JUnitTest {

    /**
     * getSite with an new Results.
     */
    @org.junit.Test
    public void testGetSite() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getSite();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSite with an new Results.
     */
    @org.junit.Test
    public void testSetSite() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setSite(expectedValue);
        final String result = results.getSite();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getSize with an new Results.
     */
    @org.junit.Test
    public void testGetSize() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final Integer result = results.getSize();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setSize with an new Results.
     */
    @org.junit.Test
    public void testSetSize() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        results.setSize(expectedValue);
        final Integer result = results.getSize();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getIso31661 with an new Results.
     */
    @org.junit.Test
    public void testGetIso31661() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getIso31661();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso31661 with an new Results.
     */
    @org.junit.Test
    public void testSetIso31661() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setIso31661(expectedValue);
        final String result = results.getIso31661();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new Results.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Results.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setName(expectedValue);
        final String result = results.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Results.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Results.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setId(expectedValue);
        final String result = results.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getType with an new Results.
     */
    @org.junit.Test
    public void testGetType() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getType();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setType with an new Results.
     */
    @org.junit.Test
    public void testSetType() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setType(expectedValue);
        final String result = results.getType();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getIso6391 with an new Results.
     */
    @org.junit.Test
    public void testGetIso6391() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getIso6391();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso6391 with an new Results.
     */
    @org.junit.Test
    public void testSetIso6391() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setIso6391(expectedValue);
        final String result = results.getIso6391();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getKey with an new Results.
     */
    @org.junit.Test
    public void testGetKey() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        final String result = results.getKey();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setKey with an new Results.
     */
    @org.junit.Test
    public void testSetKey() {
        // arrange : set up the test
        final Results results = mock(Results.class);
        assert results != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        results.setKey(expectedValue);
        final String result = results.getKey();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}