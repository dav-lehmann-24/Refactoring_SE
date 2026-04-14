import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RentalTest {
    private Rental rental;
    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Avatar", 0);
        rental = new Rental(movie, 10);
    }

    @Test
    public void testGetDaysRented() {
        assertEquals(10, rental.getDaysRented());
    }

    @Test
    public void testGetMovie() {
        assertEquals(movie, rental.getMovie());
    }

    @Test
    public void testGetFrequentRenterPoints() {
        assertEquals(1, rental.getFrequentRenterPoints());
    }

    @Test
    public void testGetCharge() {
        assertEquals(14.0, rental.getCharge(), 0);
    }
}
