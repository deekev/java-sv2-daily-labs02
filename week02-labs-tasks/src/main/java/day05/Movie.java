package day05;

public class Movie {

    private String title;
    private int year;

    private double rating;
    private int numberOfRates;
    private int sumOfRates;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public double rateMovie(int rating){
       numberOfRates += 1;
       sumOfRates += rating;
       this.rating = (double)sumOfRates/numberOfRates;
       return this.rating;
    }

    public double getRating() {
        return rating;
    }
}
