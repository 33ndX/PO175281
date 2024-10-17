package zad1;

public class Person {
        public String imie;
        public String nazwisko;
        protected int wiek;
        int rok;

        public Person(){

        }

        public Person(String imie, String nazwisko, int wiek, int rok) {
                this.imie = imie;
                this.nazwisko = nazwisko;
                this.wiek = wiek;
                this.rok = rok;
        }
}
