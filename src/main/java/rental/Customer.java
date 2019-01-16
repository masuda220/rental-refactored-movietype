package rental;

class Customer {
    String name;
    Rentals rentals = new Rentals();

    Customer(String name, Rentals rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    String name() {
        return name;
    }
}
