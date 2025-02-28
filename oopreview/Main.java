package oopreview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Abstract class for all Physics concepts
abstract class PhysicsConcept {
    abstract void explain(); // Abstraction: Abstract method to be implemented by subclasses
}

// Temperature Conversion Class
class Temperature {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }
    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }
}

// Class for Equilibrium Calculation
class Equilibrium extends PhysicsConcept { // Inheritance: Extending the abstract class PhysicsConcept
    private double force1, force2; // Encapsulation: Private fields

    public Equilibrium(double f1, double f2) { // Constructor
        this.force1 = f1;
        this.force2 = f2;
    }

    public double calculateResultantForce() {
        return Math.abs(force1 - force2); // Simple force balance
    }

    @Override
    void explain() { // Polymorphism: Overriding the abstract method
        System.out.println("Equilibrium: When all forces are balanced, the net force is zero.");
    }
}

// Class for Work done by Gas Expansion
class GasLaw extends PhysicsConcept { // Inheritance: Extending the abstract class PhysicsConcept
    public static double calculateWork(double pressure, double volume1, double volume2) {
        return pressure * (volume2 - volume1);
    }

    @Override
    void explain() { // Polymorphism: Overriding the abstract method
        System.out.println("Gas Laws: Work done by gas = Pressure * Change in Volume.");
    }
}

// Class for Vector Physics
class VectorPhysics extends PhysicsConcept { // Inheritance: Extending the abstract class PhysicsConcept
    public static double calculateResultant(double f1, double f2, double angle) {
        return Math.sqrt(f1*f1 + f2*f2 + 2*f1*f2*Math.cos(Math.toRadians(angle)));
    }

    @Override
    void explain() { // Polymorphism: Overriding the abstract method
        System.out.println("Vector Physics: Uses trigonometry to find resultant forces.");
    }
}

// Simple Calculator Class
class SimpleCalculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public void startCalculator() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.println("Enter operation (+, -, *, /): ");
        String operation = br.readLine();

        int result = 0;
        switch (operation) {
            case "+": result = add(num1, num2); break;
            case "-": result = subtract(num1, num2); break;
            case "*": result = multiply(num1, num2); break;
            case "/": result = divide(num1, num2); break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.println("Result: " + result);
    }
}

// Physics Review Class
class PhysicsReview {
    public void review() {
        // Temperature Conversion
        System.out.println("Temperature Conversions:");
        System.out.println("25°C to Fahrenheit: " + Temperature.celsiusToFahrenheit(25) + "°F");
        System.out.println("100°F to Celsius: " + Temperature.fahrenheitToCelsius(100) + "°C");
        System.out.println("0°C to Kelvin: " + Temperature.celsiusToKelvin(0) + "K\n");

        // Equilibrium Example
        Equilibrium eq = new Equilibrium(50, 30); // Creating an instance of Equilibrium
        eq.explain(); // Polymorphism: Calling the overridden method
        System.out.println("Resultant Force: " + eq.calculateResultantForce() + " N\n");

        // Work done by Gas Expansion
        GasLaw gas = new GasLaw(); // Creating an instance of GasLaw
        gas.explain(); // Polymorphism: Calling the overridden method
        System.out.println("Work Done by Gas: " + GasLaw.calculateWork(100, 2, 5) + " J\n");

        // Vector Calculation
        VectorPhysics vector = new VectorPhysics(); // Creating an instance of VectorPhysics
        vector.explain(); // Polymorphism: Calling the overridden method
        System.out.println("Resultant of two forces (50N and 30N at 60°): " + VectorPhysics.calculateResultant(50, 30, 60) + " N\n");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose an option:");
        System.out.println("1 - Simple Calculator");
        System.out.println("2 - Physics Review");

        int choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
                SimpleCalculator calculator = new SimpleCalculator(); // Creating an instance of SimpleCalculator
                calculator.startCalculator(); // Using the SimpleCalculator instance
                break;
            case 2:
                PhysicsReview physicsReview = new PhysicsReview(); // Creating an instance of PhysicsReview
                physicsReview.review(); // Using the PhysicsReview instance
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}