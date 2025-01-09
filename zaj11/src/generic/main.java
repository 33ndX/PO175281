package generic;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal("Filemon");
        Box<Animal, Animal> box1 = new Box<>(animal, animal);

        System.out.println(box1.getValue());
        box1.getValue().dajGlos();
    }
}
