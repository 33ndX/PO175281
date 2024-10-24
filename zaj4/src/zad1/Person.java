package zad1;

import java.util.Objects;

public class Person {
    public String imie;
    public String nazwisko;
    public static String nazwaUczelni = "UWM";

    public Person(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    @Override
    public String toString(){
        return "Nazywam się " + imie + " " + nazwisko + ", studiuję na " + nazwaUczelni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(imie, person.imie) && Objects.equals(nazwisko, person.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Adam", "Kowlaski");
        Person p2 = new Person("Janina", "Kozłowska");
        Person p3 = new Person("Janina", "Kozłowska");
//        System.out.println(p1.to());
//        System.out.println(p1.imie + " " + p1.nazwisko + " " + Person.nazwaUczelni);
//        Person.nazwaUczelni = "ART";
//        System.out.println(p1.przedstawSie());
//        System.out.println(p2.przedstawSie());
        System.out.println(p1);
        System.out.println(p1.hashCode() + " " + p2.hashCode());
        System.out.println(p2.equals(p3));
    }
}
