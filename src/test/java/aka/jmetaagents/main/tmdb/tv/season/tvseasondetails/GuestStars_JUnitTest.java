package aka.jmetaagents.main.tmdb.tv.season.tvseasondetails;

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
 * JUnit skeleton for the GuestStars object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ GuestStars.class })
public class GuestStars_JUnitTest {

    /**
     * getCharacter with an new GuestStars.
     */
    @org.junit.Test
    public void testGetCharacter() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        final String result = guestStars.getCharacter();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCharacter with an new GuestStars.
     */
    @org.junit.Test
    public void testSetCharacter() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        guestStars.setCharacter(expectedValue);
        final String result = guestStars.getCharacter();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getCreditId with an new GuestStars.
     */
    @org.junit.Test
    public void testGetCreditId() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        final String result = guestStars.getCreditId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCreditId with an new GuestStars.
     */
    @org.junit.Test
    public void testSetCreditId() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        guestStars.setCreditId(expectedValue);
        final String result = guestStars.getCreditId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new GuestStars.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        final String result = guestStars.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new GuestStars.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        guestStars.setName(expectedValue);
        final String result = guestStars.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProfilePath with an new GuestStars.
     */
    @org.junit.Test
    public void testGetProfilePath() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        final String result = guestStars.getProfilePath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProfilePath with an new GuestStars.
     */
    @org.junit.Test
    public void testSetProfilePath() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        guestStars.setProfilePath(expectedValue);
        final String result = guestStars.getProfilePath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new GuestStars.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        final Integer result = guestStars.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new GuestStars.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        guestStars.setId(expectedValue);
        final Integer result = guestStars.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getOrder with an new GuestStars.
     */
    @org.junit.Test
    public void testGetOrder() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        final Integer result = guestStars.getOrder();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setOrder with an new GuestStars.
     */
    @org.junit.Test
    public void testSetOrder() {
        // arrange : set up the test
        final GuestStars guestStars = mock(GuestStars.class);
        assert guestStars != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        guestStars.setOrder(expectedValue);
        final Integer result = guestStars.getOrder();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}