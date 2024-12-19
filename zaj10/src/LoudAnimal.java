public interface LoudAnimal {

    void makeSound();
    default void sayName(){
        System.out.println("Nie wiem jak sie nazywam.");
    }
}
