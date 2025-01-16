package zad2;

import java.time.LocalDate;

public class VideoGame implements Cloneable{
    String title;
    String genre;
    LocalDate releaseDate;

    public VideoGame(String title, String genre, LocalDate releaseDate) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
