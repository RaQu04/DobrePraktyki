package Powtorka.Builder;

import lombok.Getter;

@Getter
public class Car {
    private String producer;
    private String model;
    private int age;
    private double capacity;
    private int door;



    public static final class CarBuilder {
        private String producer;
        private String model;
        private int age;
        private double capacity;
        private int door;

        CarBuilder() {
        }

        public static CarBuilder aCar() {
            return new CarBuilder();
        }

        public CarBuilder withProducer(String producer) {
            this.producer = producer;
            return this;
        }

        public CarBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public CarBuilder withCapacity(double capacity) {
            this.capacity = capacity;
            return this;
        }

        public CarBuilder withDoor(int door) {
            this.door = door;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.producer = this.producer;
            car.capacity = this.capacity;
            car.door = this.door;
            car.model = this.model;
            car.age = this.age;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                ", capacity=" + capacity +
                ", door=" + door +
                '}';
    }
}
