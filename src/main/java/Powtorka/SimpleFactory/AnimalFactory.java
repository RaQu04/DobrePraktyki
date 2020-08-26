package Powtorka.SimpleFactory;

public class AnimalFactory {

    public Animal createAnimal(String type){
        Animal animal;
        if(type.equals("Cat")){
            animal = new Cat("Jerry", 2);
        }else if(type.equals("Dog")){
            animal = new Dog("Garry", 3);
        }else{
            animal = null;
            throw new IllegalArgumentException("Błąd!");
        }
        return animal;
    }
}
