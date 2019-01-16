package rental;

class Rental {
    Movie movie;
    int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    Movie movie() {
        return movie;
    }

    int daysRented() {
        return daysRented;
    }
}
