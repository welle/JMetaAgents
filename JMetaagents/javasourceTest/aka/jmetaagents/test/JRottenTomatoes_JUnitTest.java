package aka.jmetaagents.test;

import aka.jmetaagents.main.jrottentomatoes.JRottenTomatoes;
import aka.jmetaagents.main.jrottentomatoes.exceptions.JRottenTomatoesException;
import aka.jmetaagents.test.resource.MetaagentConstants;

/**
 * Test classe
 *
 * @author Charlotte
 *
 */
public final class JRottenTomatoes_JUnitTest {

    /**
     * Tester
     *
     * @throws JRottenTomatoesException
     */
    @org.junit.Test
    public void JRottenTest() throws JRottenTomatoesException {
        final JRottenTomatoes jRottenTomatoes = new JRottenTomatoes(MetaagentConstants.ROTTENTOMATOES_API_KEY);
        jRottenTomatoes.getMovie("13492");
//        jRottenTomatoes.getMovieByIMDBId("tt0137523");
//        jRottenTomatoes.searchMovie("alien", null, null);
//        jRottenTomatoes.getMovieSimilar("13492", null);
//        jRottenTomatoes.getMovieCast("13492");

//        final JRottenTomatoes jRotten = new JRottenTomatoes("u8ntuxdqydqs993p2nw8pufe");
//
//        final Jmovie jmovie = jRotten.getMovie("770672122");
//
//        System.err.println("[JRottenTomatoes_JUnitTest] getMovie - " + jmovie.getSynopsis());
//
//        final Jmoviesimilar jmoviesimilar = jRotten.searchMovieSimilar("770672122", 3);
//
//        System.err.println("[JRottenTomatoes_JUnitTest] searchMovieSimilar - " + jmoviesimilar.getMovies().size());
//
//        final Jmoviecast jmoviecast = jRotten.searchMovieCast("770672122");
//
//        System.err.println("[JRottenTomatoes_JUnitTest] jmoviecast - " + jmoviecast.getCast().size());
//
//        final Jmoviesearch jmoviesearch = jRotten.searchMovie("alien", 10);
//
//        System.err.println("[JRottenTomatoes_JUnitTest] searchMovie - " + jmoviesearch.getMovies().size());
//
//        final Jmoviealias jmovieAlias = jRotten.getMovieByIMDBId("tt0137523");
//
//        System.err.println("[JRottenTomatoes_JUnitTest] getMovieByIMDBId - " + jmovieAlias.getTitle());
    }
}
