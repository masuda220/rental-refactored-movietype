package rental;

import java.util.ArrayList;
import java.util.List;

public class Rentals {
    List<Rental> rentals = new ArrayList<>();

    void addRental(Rental rental) {
        rentals.add(rental);
    }

    List<Rental> asList(){
        return rentals;
    }
}
