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

