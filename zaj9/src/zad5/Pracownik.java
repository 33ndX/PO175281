package zad5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

class Pracownik {
    private String imie;
    private double pensja;
    private LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getImie() {
        return imie;
    }

    public double getPensja() {
        return pensja;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    @Override
    public String toString() {
        return pensja+"";
    }




    public static void main(String[] args) {
        Pracownik[] pracownicy = {
                new Pracownik("Jan", 3500.00, LocalDate.of(2020, 5, 1)),
                new Pracownik("Anna", 4500.00, LocalDate.of(2018, 3, 15)),
                new Pracownik("Piotr", 4000.00, LocalDate.of(2019, 7, 20)),
                new Pracownik("Marta", 3000.00, LocalDate.of(2021, 1, 10)),
                new Pracownik("Tomasz", 5000.00, LocalDate.of(2017, 11, 5))
        };

        Arrays.sort(pracownicy, new PensjaComparator());

        for (Pracownik pracownik : pracownicy) {
            System.out.println(pracownik);
        }
    }
}

class PensjaComparator implements Comparator<Pracownik> {
    @Override
    public int compare(Pracownik p1, Pracownik p2) {
        return Double.compare(p1.getPensja(), p2.getPensja());
    }

}