package aka.jmetaagents.main.tmdb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.awt.image.BufferedImage;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetaagents.main.MetaagentConstants;
import aka.jmetaagents.main.tmdb.exceptions.JtmdbException;
import aka.jmetaagents.main.tmdb.JTMDB;
import aka.jmetaagents.main.tmdb.authentification.guest.JGuestQuestion;
import aka.jmetaagents.main.tmdb.authentification.guest.JGuestResponse;
import aka.jmetaagents.main.tmdb.collections.collectionsdetails.JCollectionsdetailsQuestion;
import aka.jmetaagents.main.tmdb.collections.collectionsdetails.JCollectionsdetailsResponse;
import aka.jmetaagents.main.tmdb.collections.collectionsimages.JCollectionsimagesQuestion;
import aka.jmetaagents.main.tmdb.collections.collectionsimages.JCollectionsimagesResponse;

/**
 * Generated JTMDB Tests unit.
 */
public final class JTMDB_Test {

    private @NonNull String apiKey = MetaagentConstants.THE_MOVIE_DB_API_KEY;

    /**
     * Test getJCollectionsdetails method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJCollectionsdetails_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer collectionId = null;
        final String language = null;
        final JCollectionsdetailsQuestion jTMDBQuestion = new JCollectionsdetailsQuestion(collectionId, language);
        final JCollectionsdetailsResponse result = jTMDB.getJCollectionsdetails(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getJCollectionsimages method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getJCollectionsimages_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        
        // act : run the test
        final Integer collectionId = null;
        final String language = null;
        final JCollectionsimagesQuestion jTMDBQuestion = new JCollectionsimagesQuestion(collectionId, language);
        final JCollectionsimagesResponse result = jTMDB.getJCollectionsimages(jTMDBQuestion);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

    /**
     * Test getImage method.
     *
     * @throws JtmdbException
     */
    @org.junit.Test 
    public void getImage_Test() throws JtmdbException {
        // arrange : set up the test
        final JGuestQuestion jGuestQuestion = new JGuestQuestion(this.apiKey);
        
        // act : run the test
        final JTMDB jTMDB = new JTMDB(jGuestQuestion);
        String urlImage = "";
        final BufferedImage result = jTMDB.getImage(urlImage);
        
        // assert : verify that the test run correctly
        assertNotNull(result);
    }

}
