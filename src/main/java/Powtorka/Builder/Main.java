package Powtorka.Builder;

import com.fasterxml.jackson.databind.util.JSONPObject;

import static Powtorka.Builder.Car.CarBuilder.aCar;

public class Main {
    public static void main(String[] args) {
        Car car = aCar()
                .withProducer("Audi")
                .withModel("A6")
                .withAge(2008)
                .withCapacity(2.0)
                .withDoor(4)
                .build();


        System.out.println(car);

        Person person = Person.builder().
                name("Lukasz")
                .surname("Rakowiecki")
                .address("Na Miasteczku")
                .age(24)
                .weight(100)
                .height(185)
                .build();

        System.out.println(person);
        
    }
}
