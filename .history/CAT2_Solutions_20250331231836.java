import java.util.Scanner;

public class CAT2_Solutions {
    public static void main(String[] args) {
        // Question 1a: Encapsulation demonstration
        Student student = new Student();
        student.setName("John Doe");
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
        
       