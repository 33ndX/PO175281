public class Student {
    public int nrIndex;
    public String name;
    public String surname;

    public Student(int nrIndex, String name, String surname){
        this.nrIndex = nrIndex;
        this.name = name;
        this.surname = surname;
    }
    public void  przedstawSie(){
        System.out.println("Dzień dobry, nazywam się " + name + " " + surname);
    }
}
