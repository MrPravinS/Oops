package Basics;
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car Is driving... " + speed + "Km/hr");
    }
}

public class Basics {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Black";
        myCar.speed = 200;

        System.out.println("Color Of the car is : " + myCar.color);
        myCar.drive();
    }
}