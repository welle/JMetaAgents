package aka.jmetaagents.main.tmdb.tv.tvdetails;

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
 * JUnit skeleton for the CreatedBy object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ CreatedBy.class })
public class CreatedBy_JUnitTest {

    /**
     * getGender with an new CreatedBy.
     */
    @org.junit.Test
    public void testGetGender() {
        // arrange : set up the test
        final CreatedBy createdBy = mock(CreatedBy.class);
        assert createdBy != null;

        // act : run the test
        final Integer result = createdBy.getGender();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setGender with an new CreatedBy.
     */
    @org.junit.Test
    public void testSetGender() {
        // arrange : set up the test
        final CreatedBy createdBy = mock(CreatedBy.class);
        assert createdBy != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        createdBy.setGender(expectedValue);
        final Integer result = createdBy.getGender();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new CreatedBy.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final CreatedBy createdBy = mock(CreatedBy.class);
        assert createdBy != null;

        // act : run the test
        final String result = createdBy.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new CreatedBy.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final CreatedBy createdBy = mock(CreatedBy.class);
        assert createdBy != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        createdBy.setName(expectedValue);
        final String result = createdBy.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getProfilePath with an new CreatedBy.
     */
    @org.junit.Test
    public void testGetProfilePath() {
        // arrange : set up the test
        final CreatedBy createdBy = mock(CreatedBy.class);
        assert createdBy != null;

        // act : run the test
        final String result = createdBy.getProfilePath();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setProfilePath with an new CreatedBy.
     */
    @org.junit.Test
    public void testSetProfilePath() {
        // arrange : set up the test
        final CreatedBy createdBy = mock(CreatedBy.class);
        assert createdBy != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        createdBy.setProfilePath(expectedValue);
        final String result = createdBy.getProfilePath();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new CreatedBy.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final CreatedBy createdBy = mock(CreatedBy.class);
        assert createdBy != null;

        // act : run the test
        final Integer result = createdBy.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new CreatedBy.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final CreatedBy createdBy = mock(CreatedBy.class);
        assert createdBy != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        createdBy.setId(expectedValue);
        final Integer result = createdBy.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}