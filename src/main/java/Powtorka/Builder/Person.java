package Powtorka.Builder;

import lombok.Builder;

@Builder
public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final String address;
    private final int height;
    private final int weight;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
