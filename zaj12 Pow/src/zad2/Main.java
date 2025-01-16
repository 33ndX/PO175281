package zad2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VideoGame g1 = new VideoGame("Rally", "Racing", LocalDate.parse("2025-01-16"));

        VideoGame g2;

        try {
            g2 = (VideoGame)g1.clone();
        } catch (CloneNotSupportedException e){
            throw  new RuntimeException(e);
        }

        g1.setReleaseDate(LocalDate.parse("2025-01-17"));

        System.out.println(g1.getReleaseDate());
        System.out.println(g2.getReleaseDate());
    }
}
