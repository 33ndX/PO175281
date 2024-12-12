package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>, Cloneable{
    String title;
    String dircetor;
    String genre;

    public Movie(String title, String dircetor, String genre) {
        this.title = title;
        this.dircetor = dircetor;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDircetor() {
        return dircetor;
    }

    public void setDircetor(String dircetor) {
        this.dircetor = dircetor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Movie o) {
        return Integer.compare(this.title.length(), o.title.length());
    }

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Interstellar", "Christopher Nolan", "Sci-Fi"));
        movies.add(new Movie("Jaws", "Steven Spielberg", "Thriller"));
        movies.add(new Movie("The Godfather", "Francis Ford Coppola", "Crime"));
        movies.add(new Movie("Alien", "Ridley Scott", "Horror"));
        Collections.sort(movies);
        System.out.println(movies);
    }
}
