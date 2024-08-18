package Oops;

// Defining an interface A
interface A {  
    // Declaring a method display which accepts an integer parameter
    void display(int a);
}

// Creating a class named lect15_lambda
public class lect15_lambda_class{
    // Main method...
    public static void main(String[] args) {
        // Creating an instance of A using a lambda expression
        A obj = (int i) -> System.out.println("From class A: " + i);
        
        // Calling the display method of the lambda expression implementation
        obj.display(58);
    }
}
