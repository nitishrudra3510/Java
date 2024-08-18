package etp;

// Interface with static and default methods
interface MyInterface {
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

    default void defaultMethod() {
        System.out.println("Default method in interface");
    }
}

// Class implementing interface
class MyClass implements MyInterface {}

public class Static_Default{
    public static void main(String[] args) {
        MyInterface.staticMethod(); // Output: Static method in interface

        MyClass obj = new MyClass();
        obj.defaultMethod(); // Output: Default method in interface
    }
}

