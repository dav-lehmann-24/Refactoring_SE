import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Max Mustermann");
    }

    @Test
    public void testGetName() {
        assertEquals("Max Mustermann", customer.getName());
    }

    @Test
    public void testStatement() {
        String statement = "Rental Record for Max Mustermann" + "\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";

        assertEquals(statement, customer.statement());
    }
}