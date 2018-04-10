package aka.jmetaagents.main.tvdb.languages.languagesid;

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
 * JUnit skeleton for the JLanguagesidResponse object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JLanguagesidResponse.class })
public class JLanguagesidResponse_JUnitTest {

    /**
     * getEnglishName with an new JLanguagesidResponse.
     */
    @org.junit.Test
    public void testGetEnglishName() {
        // arrange : set up the test
        final JLanguagesidResponse jLanguagesidResponse = mock(JLanguagesidResponse.class);
        assert jLanguagesidResponse != null;

        // act : run the test
        final String result = jLanguagesidResponse.getEnglishName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEnglishName with an new JLanguagesidResponse.
     */
    @org.junit.Test
    public void testSetEnglishName() {
        // arrange : set up the test
        final JLanguagesidResponse jLanguagesidResponse = mock(JLanguagesidResponse.class);
        assert jLanguagesidResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jLanguagesidResponse.setEnglishName(expectedValue);
        final String result = jLanguagesidResponse.getEnglishName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new JLanguagesidResponse.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final JLanguagesidResponse jLanguagesidResponse = mock(JLanguagesidResponse.class);
        assert jLanguagesidResponse != null;

        // act : run the test
        final String result = jLanguagesidResponse.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new JLanguagesidResponse.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final JLanguagesidResponse jLanguagesidResponse = mock(JLanguagesidResponse.class);
        assert jLanguagesidResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jLanguagesidResponse.setName(expectedValue);
        final String result = jLanguagesidResponse.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getId with an new JLanguagesidResponse.
     */
    @org.junit.Test
    public void testGetId() {
        // arrange : set up the test
        final JLanguagesidResponse jLanguagesidResponse = mock(JLanguagesidResponse.class);
        assert jLanguagesidResponse != null;

        // act : run the test
        final Integer result = jLanguagesidResponse.getId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setId with an new JLanguagesidResponse.
     */
    @org.junit.Test
    public void testSetId() {
        // arrange : set up the test
        final JLanguagesidResponse jLanguagesidResponse = mock(JLanguagesidResponse.class);
        assert jLanguagesidResponse != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jLanguagesidResponse.setId(expectedValue);
        final Integer result = jLanguagesidResponse.getId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getAbbreviation with an new JLanguagesidResponse.
     */
    @org.junit.Test
    public void testGetAbbreviation() {
        // arrange : set up the test
        final JLanguagesidResponse jLanguagesidResponse = mock(JLanguagesidResponse.class);
        assert jLanguagesidResponse != null;

        // act : run the test
        final String result = jLanguagesidResponse.getAbbreviation();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setAbbreviation with an new JLanguagesidResponse.
     */
    @org.junit.Test
    public void testSetAbbreviation() {
        // arrange : set up the test
        final JLanguagesidResponse jLanguagesidResponse = mock(JLanguagesidResponse.class);
        assert jLanguagesidResponse != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jLanguagesidResponse.setAbbreviation(expectedValue);
        final String result = jLanguagesidResponse.getAbbreviation();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}