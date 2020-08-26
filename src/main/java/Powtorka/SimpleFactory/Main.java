package Powtorka.SimpleFactory;

public class Main {
    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.createAnimal("Dog");

        System.out.println(dog.getAge());

        Animal cat = animalFactory.createAnimal("Cat");

        System.out.println(cat.getName());

    }


}
