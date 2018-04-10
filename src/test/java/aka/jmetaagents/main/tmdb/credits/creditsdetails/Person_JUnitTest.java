package aka.jmetaagents.main.tmdb.credits.creditsdetails;

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
 * JUnit skeleton for the Person object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Person.class })
public class Person_JUnitTest {

    /**
     * getName with an new Person.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Person person = mock(Person.class);
        assert person != null;

        // act : run the test
        final String result = person.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Person.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Person person = mock(Person.class);
        assert person != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        person.setName(expectedValue);
        final String result = person.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new Person.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final Person person = mock(Person.class);
        assert person != null;

        // act : run the test
        final Integer result = person.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new Person.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final Person person = mock(Person.class);
        assert person != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        person.setId(expectedValue);
        final Integer result = person.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}