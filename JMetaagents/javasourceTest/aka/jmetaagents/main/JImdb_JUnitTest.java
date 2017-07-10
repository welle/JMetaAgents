package aka.jmetaagents.main;

import org.eclipse.jdt.annotation.Nullable;

import aka.jmetaagents.main.jimdb.JIMDB;
import aka.jmetaagents.main.jimdb.exceptions.JIMDBException;
import aka.jmetaagents.main.jimdb.pojo.jmovie.Data;
import aka.jmetaagents.main.jimdb.pojo.jmovie.JMovie;
import aka.jmetaagents.main.jimdb.pojo.jmoviesearch.JMovieSearch;
import resource.MetaagentConstants;

/**
 * Test classe
 *
 * @author Charlotte
 *
 */
public final class JImdb_JUnitTest {

    /**
     * Tester
     *
     * @throws JIMDBException
     */
    @org.junit.Test
    public final void JImdbTest() throws JIMDBException {
        final JIMDB jImdb = new JIMDB(MetaagentConstants.IMDB_API_ID_VALUE, MetaagentConstants.IMDB_API_VALUE, MetaagentConstants.IMDB_DEVICE_VALUE, MetaagentConstants.IMDB_SIG_VALUE);
        final JMovie jmovie = jImdb.getMovie("tt0137523");

        if (jmovie != null) {
            @Nullable
            final Data data = jmovie.getData();
            if (data != null) {
                System.err.println("[JImdb] getMovie - " + data.getTagline());
            }
        }

        final JMovieSearch jmoviesearch = jImdb.searchMovie("alien", 2);

        if (jmoviesearch != null) {
            final aka.jmetaagents.main.jimdb.pojo.jmoviesearch.@Nullable Data data = jmoviesearch.getData();
            if (data != null) {
                System.err.println("[JImdb] searchMovie - " + data.getResults().get(0).getListRes().get(0).getTitle());
            }
        }
    }
}
