// package Oops;
// abstract class A {
//     abstract void display();
    
// }
// public class lect14_anomimus {
//     public static void main(String[] args) {
//         A obj = new A(){
//             void display() {   // anomius class name;
//                 System.out.println("from class A");
//             }
//         };

//         obj.display();
//     }
// }



//for interface -> every interface is abstract.
package Oops;

// Defining an interface A
interface A {  
    // Declaring a method display which must be implemented by classes implementing this interface
    void display();  
    
    // Defining a default method funct, which can be overridden but not required to be implemented by implementing classes
    default void funct(){

    }
}

// Creating a class named lect14_anomimus
public class lect14_anomimus {
    // Main method
    public static void main(String[] args) {
        // Creating an instance of A using anonymous class implementation
        A obj = new A(){
            // Overriding the display method of interface A
            public void display() {   
                System.out.println("from class A");
            }
        };
        // Calling the display method of the anonymous class implementation
        obj.display();
    }
}
