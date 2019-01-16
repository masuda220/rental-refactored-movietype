package rental;

import org.junit.Test;

import static rental.MovieType.CHILDREN;
import static rental.MovieType.NEW_RELEASE;
import static rental.MovieType.REGULAR;

public class CustomerTest {

    static final Movie newOne = new Movie("新作", NEW_RELEASE);
    static final Movie children = new Movie("子供向け", CHILDREN);
    static final Movie regular = new Movie("一般", REGULAR);
    @Test
    public void smokeTest() {

        Rentals rentals = new Rentals();
        rentals.addRental(new Rental(newOne,3));
        rentals.addRental(new Rental(children,2));
        rentals.addRental(new Rental(regular,1));

        Customer customer = new Customer("増田",rentals) ;

        Statement statement = new Statement(customer);

        System.out.println(statement.statement());
    }

}