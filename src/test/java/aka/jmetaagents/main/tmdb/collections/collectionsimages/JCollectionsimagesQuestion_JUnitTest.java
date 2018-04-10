package aka.jmetaagents.main.tmdb.collections.collectionsimages;

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
 * JUnit skeleton for the JCollectionsimagesQuestion object.
 *
 * @author Welle
 */ 
@RunWith(PowerMockRunner.class)
@PrepareForTest({ JCollectionsimagesQuestion.class })
public class JCollectionsimagesQuestion_JUnitTest {

    /**
     * getCollectionId with an new JCollectionsimagesQuestion.
     */
    @org.junit.Test
    public void testGetCollectionId() {
        // arrange : set up the test
        final JCollectionsimagesQuestion jCollectionsimagesQuestion = mock(JCollectionsimagesQuestion.class);
        assert jCollectionsimagesQuestion != null;

        // act : run the test
        final Integer result = jCollectionsimagesQuestion.getCollectionId();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setCollectionId with an new JCollectionsimagesQuestion.
     */
    @org.junit.Test
    public void testSetCollectionId() {
        // arrange : set up the test
        final JCollectionsimagesQuestion jCollectionsimagesQuestion = mock(JCollectionsimagesQuestion.class);
        assert jCollectionsimagesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final Integer expectedValue = null;
        jCollectionsimagesQuestion.setCollectionId(expectedValue);
        final Integer result = jCollectionsimagesQuestion.getCollectionId();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
    /**
     * getLanguage with an new JCollectionsimagesQuestion.
     */
    @org.junit.Test
    public void testGetLanguage() {
        // arrange : set up the test
        final JCollectionsimagesQuestion jCollectionsimagesQuestion = mock(JCollectionsimagesQuestion.class);
        assert jCollectionsimagesQuestion != null;

        // act : run the test
        final String result = jCollectionsimagesQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * setLanguage with an new JCollectionsimagesQuestion.
     */
    @org.junit.Test
    public void testSetLanguage() {
        // arrange : set up the test
        final JCollectionsimagesQuestion jCollectionsimagesQuestion = mock(JCollectionsimagesQuestion.class);
        assert jCollectionsimagesQuestion != null;

        // act : run the test
        // TODO set proper expected value
        final String expectedValue = "X";
        jCollectionsimagesQuestion.setLanguage(expectedValue);
        final String result = jCollectionsimagesQuestion.getLanguage();

        // assert : verify that the test run correctly
        assertEquals(expectedValue, result);
        // TODO add extra validations
    }
}