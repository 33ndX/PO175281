package zad1;

import zad2.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable{
    String imie;
    double sredniaOcen;
    int rokUr;

    public Student(String imie, double sredniaOcen, int rokUr) {
        this.imie = imie;
        this.sredniaOcen = sredniaOcen;
        this.rokUr = rokUr;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public int getRokUr() {
        return rokUr;
    }

    public void setRokUr(int rokUr) {
        this.rokUr = rokUr;
    }

    public  void przedstawSie(){
        System.out.println(imie + " " + sredniaOcen + " " + rokUr);
    }



    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Adam", 4.8, 1998));
        students.add(new Student("Eryk", 3.8, 2003));
        students.add(new Student("Bartek", 4.8, 1998));
        //Collections.sort(students);
        //students.sort();
    }

    @Override
    public int compareTo(Student o) {
        if(Double.compare(this.sredniaOcen, o.sredniaOcen)==0){
            return Integer.compare(o.rokUr, this.rokUr);
        }
        return  Double.compare(this.sredniaOcen, o.sredniaOcen);
    }
}
//modyfikuje liste
class YearOfBirthStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.rokUr, o1.rokUr);
    }
}

class AvgGradeStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.sredniaOcen, o1.sredniaOcen);
    }
}