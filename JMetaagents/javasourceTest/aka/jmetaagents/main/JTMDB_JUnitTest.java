package aka.jmetaagents.main;

import aka.jmetaagents.main.jtmdb.JTMDB;
import aka.jmetaagents.main.jtmdb.exceptions.JTMDBException;
import resource.MetaagentConstants;

/**
 * Test classe
 *
 * @author Charlotte
 *
 */
public final class JTMDB_JUnitTest {

    /**
     * Tester
     *
     * @throws JTMDBException
     */
    @org.junit.Test
    public void JTMDBTest() throws JTMDBException {
        final JTMDB jtmdb = new JTMDB(MetaagentConstants.THE_MOVIE_DB_API_KEY);

//        jtmdb.getMovieByIMDBid("tt0078748", null);
//        jtmdb.getMovieSimilar("550", null, null);
//        jtmdb.getCollection("656", null);
//        jtmdb.getMovieAltTitles("348", null);
//        jtmdb.getMovieTrailer("348", null);
//        jtmdb.getPersonCredits("10205", null);
//        jtmdb.getMovieImage("348", null);
//        jtmdb.getCollectionImage("656", null);
//        jtmdb.getMovieReleaseInfo("348");
//        jtmdb.getPerson("10205");
//        jtmdb.getPersonImages("10205");
//        jtmdb.getMovieCast("348");
//        jtmdb.getPopularMovies(null, null);
//        jtmdb.getTopRatedMovies(null, null);
//        jtmdb.searchCollections("alien", null, null);
//        jtmdb.searchMovies("alien", null, null);
//        jtmdb.searchPerson("david", null, null);
//        jtmdb.searchTVShows("lost", null, null);
//        jtmdb.getTVShow("4607", null);
//        jtmdb.getTVShowAltTitles("4607", null);
//        jtmdb.getTVShowCredits("4607", null);
//        jtmdb.getTVShowImage("4607", null);
//        jtmdb.getTVShowSimilar("4607", null, null);
//        jtmdb.getTVShowsPopular(null, null);
//        jtmdb.getMoviesTopRated(null, null);
//        jtmdb.getTVShowSeason("4607", "1", null);
//        jtmdb.getTVShowSeasonImage("4607", "1");
//        jtmdb.getTVShowEpisode("4607", "1", "2", null);
//        jtmdb.getTVShowEpisodeCredits("4607", "1", "2");
//        jtmdb.getTVShowEpisodeImage("4607", "1", "2");
//        jtmdb.getTVShowVideos("4607", null);
//        jtmdb.getTVShowSeasonVideo("4607", "1", null);
//        jtmdb.getTVShowEpisodeVideo("1399", "6", "10", null);
        jtmdb.getMovieVideos("348", null);

//        Jmovie = jtmdb.getMovie("37555");
//        System.err.println("[JTMDB_JUnitTest] getMovie - " + jmovie.getOriginalTitle());
////
//
//        jmovie = jtmdb.getMovie("679", "fr");
//
//        System.err.println("[JRottenTomatoes_JUnitTest] getMovie (fr) - " + jmovie.getTitle());
//
//        final Jcollection jcollection = jtmdb.getCollection("8091", "fr");
//
//        System.err.println("[JTMDB_JUnitTest] getCollection (fr) - " + jcollection.getName());
//
//        final File test = jtmdb.getImageFile("http://www.wallfizz.com/film-tv/alien/323-alien-WallFizz.jpg");
//        System.err.println("[JTMDB_JUnitTest] JTMDB_JUnitTest - " + test.getAbsolutePath());
//
//        final Jmovieimage temp = jtmdb.getMovieImage("11", "en");
//
//        System.err.println("[JTMDB_JUnitTest] JTMDB_JUnitTest - " + temp.getBackdrops().size());
    }
}
