package ObjectOrientedProgramming;

import java.lang.System;

public class Output {
    // Run this
    public static void main(String[] args) {
        // We supply car brand, model, type (not case sensitive because we convert
        // it to lower case in the Car class), and colour
        Car car = new Car("Tesla", "Model S", "couPE", "white");
        System.out.println("Your car is a " + car.getColour() + " " + car.getBrand() + " " + car.getModel()
                + " and it has " + car.getNumberOfDoors() + " doors");
        // Car car = new Car(); // Uncomment this line (and comment above) if you want
        // to see what happens when you don't give your car any attributes

        car.drive(); // Drive the car
    }
}
