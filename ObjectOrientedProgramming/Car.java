package ObjectOrientedProgramming;

import java.lang.System;

// Blueprint for a simple car
public class Car implements ICar { // It implements an interface for cars
    private String brand; // Brand of a car e.g. BMW
    private String model; // Model of a car e.g. X5
    private String type; // Type of a car e.g. Sedan
    private String colour; // Colour of a car e.g. blue

    @Override // Drive the car
    public void drive() {
        System.out.println("Green light! Vrooooooom!");
    }

    @Override // Stop the car!
    public void brake() {
        System.out.println("Red light >.>");
    }

    // Set the brand of the car using the brand specified by the user
    private void setBrand(String brand) {
        this.brand = brand;
    }

    // Return the brand of the car
    public String getBrand() {
        return this.brand;
    }

    // Set the model of the car using the model specified by the user
    private void setModel(String model) {
        this.model = model;
    }

    // Return the model of a car (model to be returned is a String)
    public String getModel() {
        return this.model;
    }

    // Set the type of car. It's private because we only want to set the type inside
    // this class
    private void setType(String type) {
        this.type = type.toLowerCase();
    }

    // Return the type of the car (sedan or coupe)
    public String getType() {
        return this.type;
    }

    // Number of doors on a car can differ depending on the type of car
    public int getNumberOfDoors() {
        switch (this.type) {
            case "sedan":
                return 4;
            case "coupe":
                return 2;
            default:
                return 4;
        }
    }

    // Set the colour of the car if user specifies colour
    private void setColour(String colour) {
        this.colour = colour;
    }

    // Return the colour of the car
    public String getColour() {
        return this.colour;
    }

    // Constructor
    public Car(String brand, String model, String type, String colour) {
        setBrand(brand);
        setModel(model);
        setType(type);
        setColour(colour);
    }

    // If user only provides brand name when they instantiate the Car class
    public Car(String brand) {
        setBrand(brand);
    }

    // If user doesn't say anything about the car they want when they instantiate
    // the Car class
    public Car() {
        System.out.println("You have an imaginary car! Looks like nothing to me :D");
    }
}