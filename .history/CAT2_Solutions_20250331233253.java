import java.util.Scanner;

public class CAT2_Solutions {
    public static void main(String[] args) {
        // Question 1a: Encapsulation demonstration
        Student student = new Student();
        student.setName("");
        student.setGrade(85);
        System.out.println("Student: " + student.getName() + ", Grade: " + student.getGrade());
        
        // Test grade validation
        student.setGrade(105);
        System.out.println("Invalid grade test: " + student.getGrade()); // Should show 0
        
        // Question 1b: Method overloading and overriding demonstration
        MathOperations mathOps = new MathOperations();
        System.out.println("Multiply 2 numbers: " + mathOps.multiply(3, 4));
        System.out.println("Multiply 3 numbers: " + mathOps.multiply(3, 4, 5));
        
        // Polymorphism demonstration
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        
        // Question 2a: Abstraction demonstration
        Appliance fan = new Fan();
        Appliance tv = new TV();
        
        fan.turnOn();
        tv.turnOn();
        
        // Question 2b: Exception handling demonstration
        performDivision();
    }
    
    // Method for Question 2b
    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("\nEnter first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            scanner.close();
        }
    }
}

// Question 1a: Encapsulation
class Student {
    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = (grade < 0 || grade > 100) ? 0 : grade;
    }
}

// Question 1b: Method Overloading
class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

// Question 1b: Method Overriding and Polymorphism
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

// Question 2a: Abstraction
abstract class Appliance {
    public abstract void turnOn();
}

class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning now");
    }
}

class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("TV is showing programs now");
    }
}