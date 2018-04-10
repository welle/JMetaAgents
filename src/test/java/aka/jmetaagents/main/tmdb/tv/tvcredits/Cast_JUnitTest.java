package aka.jmetaagents.main.tmdb.tv.tvcredits;

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
 * JUnit skeleton for the Cast object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Cast.class })
public class Cast_JUnitTest {

    /**
     * getCharacter with an new Cast.
     */
    @org.junit.Test
    public void testGetCharacter() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        final String result = cast.getCharacter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCharacter with an new Cast.
     */
    @org.junit.Test
    public void testSetCharacter() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        cast.setCharacter(expectedValue);
        final String result = cast.getCharacter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getGender with an new Cast.
     */
    @org.junit.Test
    public void testGetGender() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        final Integer result = cast.getGender();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGender with an new Cast.
     */
    @org.junit.Test
    public void testSetGender() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        cast.setGender(expectedValue);
        final Integer result = cast.getGender();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCreditId with an new Cast.
     */
    @org.junit.Test
    public void testGetCreditId() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        final String result = cast.getCreditId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCreditId with an new Cast.
     */
    @org.junit.Test
    public void testSetCreditId() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        cast.setCreditId(expectedValue);
        final String result = cast.getCreditId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new Cast.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        final String result = cast.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Cast.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        cast.setName(expectedValue);
        final String result = cast.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProfilePath with an new Cast.
     */
    @org.junit.Test
    public void testGetProfilePath() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        final String result = cast.getProfilePath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProfilePath with an new Cast.
     */
    @org.junit.Test
    public void testSetProfilePath() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        cast.setProfilePath(expectedValue);
        final String result = cast.getProfilePath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Cast.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        final Integer result = cast.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Cast.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        cast.setId(expectedValue);
        final Integer result = cast.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOrder with an new Cast.
     */
    @org.junit.Test
    public void testGetOrder() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        final Integer result = cast.getOrder();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOrder with an new Cast.
     */
    @org.junit.Test
    public void testSetOrder() {
        // arrange : set up the test
        final Cast cast = mock(Cast.class);
        assert cast != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        cast.setOrder(expectedValue);
        final Integer result = cast.getOrder();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}