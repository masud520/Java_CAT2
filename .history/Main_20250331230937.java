// Question 1: Object-Oriented Programming Concepts in Java

// a) Encapsulation class Student { private String name; private int grade;

public Student(String name, int grade) {
    this.name = name;
    setGrade(grade);
}

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
    if (grade >= 0 && grade <= 100) {
        this.grade = grade;
    } else {
        this.grade = 0;
    }
}

}

// b) Method Overloading and Overriding class MathOperations { public int multiply(int a, int b) { return a * b; }

public int multiply(int a, int b, int c) {
    return a * b * c;
}

}

class Animal { public void makeSound() { System.out.println("Animal makes a sound"); } }

class Dog extends Animal { @Override public void makeSound() { System.out.println("Dog barks"); } }

class Cat extends Animal { @Override public void makeSound() { System.out.println("Cat meows"); } }

// Question 2: Abstraction and Exception Handling in Java

// a) Abstraction abstract class Appliance { abstract void turnOn(); }

class Fan extends Appliance { @Override void turnOn() { System.out.println("Fan is now ON"); } }

class TV extends Appliance { @Override void turnOn() { System.out.println("TV is now ON"); } }

// b) Exception Handling import java.util.Scanner;

public class Main { public static void main(String[] args) { // Encapsulation example Student student = new Student("John Doe", 85); System.out.println("Student Name: " + student.getName()); System.out.println("Student Grade: " + student.getGrade());

// Method Overloading example
    MathOperations math = new MathOperations();
    System.out.println("Multiplication (2 numbers): " + math.multiply(2, 3));
    System.out.println("Multiplication (3 numbers): " + math.multiply(2, 3, 4));
    
    // Method Overriding example
    Animal dog = new Dog();
    Animal cat = new Cat();
    dog.makeSound();
    cat.makeSound();
    
    // Abstraction example
    Appliance fan = new Fan();
    Appliance tv = new TV();
    fan.turnOn();
    tv.turnOn();
    
    // Exception Handling example
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();
    
    try {
        int result = num1 / num2;
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero!");
    }
    scanner.close();
}

}