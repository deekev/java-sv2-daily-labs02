package day05;

public class MovieMain {

    public static void main(String[] args) {

        Movie movie = new Movie("Keresztapa", 1972);
        System.out.println(movie.rateMovie(5));
        System.out.println(movie.rateMovie(4));
        System.out.println(movie.rateMovie(3));

        Viewer viewer = new Viewer();
        viewer.watchMovie(movie, 5);
        System.out.println(movie.getRating());

    }
}