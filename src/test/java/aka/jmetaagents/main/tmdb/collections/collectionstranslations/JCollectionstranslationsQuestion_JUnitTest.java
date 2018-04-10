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
 * JUnit skeleton for the JCollectionstranslationsQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCollectionstranslationsQuestion.class })
public class JCollectionstranslationsQuestion_JUnitTest {

    /**
     * getCollectionId with an new JCollectionstranslationsQuestion.
     */
    @org.junit.Test
    public void testGetCollectionId() {
        // arrange : set up the test
        final JCollectionstranslationsQuestion jCollectionstranslationsQuestion = mock(JCollectionstranslationsQuestion.class);
        assert jCollectionstranslationsQuestion != null;

        // act : run the test
        final Integer result = jCollectionstranslationsQuestion.getCollectionId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCollectionId with an new JCollectionstranslationsQuestion.
     */
    @org.junit.Test
    public void testSetCollectionId() {
        // arrange : set up the test
        final JCollectionstranslationsQuestion jCollectionstranslationsQuestion = mock(JCollectionstranslationsQuestion.class);
        assert jCollectionstranslationsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCollectionstranslationsQuestion.setCollectionId(expectedValue);
        final Integer result = jCollectionstranslationsQuestion.getCollectionId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JCollectionstranslationsQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JCollectionstranslationsQuestion jCollectionstranslationsQuestion = mock(JCollectionstranslationsQuestion.class);
        assert jCollectionstranslationsQuestion != null;

        // act : run the test
        final String result = jCollectionstranslationsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JCollectionstranslationsQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JCollectionstranslationsQuestion jCollectionstranslationsQuestion = mock(JCollectionstranslationsQuestion.class);
        assert jCollectionstranslationsQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCollectionstranslationsQuestion.setLanguage(expectedValue);
        final String result = jCollectionstranslationsQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}