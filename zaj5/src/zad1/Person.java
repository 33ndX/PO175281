package zad1;

public class Person {
    private String fristName;
    protected String lastName;

    public Person(String fristName, String lastName) {
        this.fristName = fristName;
        this.lastName = lastName;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void przedstawSie(){
        System.out.println("Nazywam się " + getFristName() + " " + getLastName());
    }

}
