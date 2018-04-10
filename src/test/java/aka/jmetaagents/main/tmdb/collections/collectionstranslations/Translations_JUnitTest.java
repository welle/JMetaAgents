package aka.jmetaagents.main.tmdb.collections.collectionstranslations;

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
 * JUnit skeleton for the Translations object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ Translations.class })
public class Translations_JUnitTest {

    /**
     * getIso31661 with an new Translations.
     */
    @org.junit.Test
    public void testGetIso31661() {
        // arrange : set up the test
        final Translations translations = mock(Translations.class);
        assert translations != null;

        // act : run the test
        final String result = translations.getIso31661();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso31661 with an new Translations.
     */
    @org.junit.Test
    public void testSetIso31661() {
        // arrange : set up the test
        final Translations translations = mock(Translations.class);
        assert translations != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        translations.setIso31661(expectedValue);
        final String result = translations.getIso31661();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getName with an new Translations.
     */
    @org.junit.Test
    public void testGetName() {
        // arrange : set up the test
        final Translations translations = mock(Translations.class);
        assert translations != null;

        // act : run the test
        final String result = translations.getName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setName with an new Translations.
     */
    @org.junit.Test
    public void testSetName() {
        // arrange : set up the test
        final Translations translations = mock(Translations.class);
        assert translations != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        translations.setName(expectedValue);
        final String result = translations.getName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getIso6391 with an new Translations.
     */
    @org.junit.Test
    public void testGetIso6391() {
        // arrange : set up the test
        final Translations translations = mock(Translations.class);
        assert translations != null;

        // act : run the test
        final String result = translations.getIso6391();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setIso6391 with an new Translations.
     */
    @org.junit.Test
    public void testSetIso6391() {
        // arrange : set up the test
        final Translations translations = mock(Translations.class);
        assert translations != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        translations.setIso6391(expectedValue);
        final String result = translations.getIso6391();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getEnglishName with an new Translations.
     */
    @org.junit.Test
    public void testGetEnglishName() {
        // arrange : set up the test
        final Translations translations = mock(Translations.class);
        assert translations != null;

        // act : run the test
        final String result = translations.getEnglishName();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setEnglishName with an new Translations.
     */
    @org.junit.Test
    public void testSetEnglishName() {
        // arrange : set up the test
        final Translations translations = mock(Translations.class);
        assert translations != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        translations.setEnglishName(expectedValue);
        final String result = translations.getEnglishName();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}