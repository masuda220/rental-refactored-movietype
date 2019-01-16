package rental;

class Movie {

    String title;
    MovieType movieType;

    Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    MovieType movieType() {
        return this.movieType;
    }

    String title() {
        return title;
    }
}
