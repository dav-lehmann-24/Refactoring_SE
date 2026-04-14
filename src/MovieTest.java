import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {
    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Avatar", 0);
    }

    @Test
    public void testGetPriceCode() {
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void testGetTitle() {
        assertEquals("Avatar", movie.getTitle());
    }

    @Test
    public void testGetFrequentRenterPoints() {
        assertEquals(1, movie.getFrequentRenterPoints(0));
    }

    @Test
    public void testGetCharge() {
        assertEquals(14.0, movie.getCharge(10), 0);
    }
}