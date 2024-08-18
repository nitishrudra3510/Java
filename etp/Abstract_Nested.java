package etp;
// Abstract class
abstract class Shape {
    abstract void draw(); // Abstract method

    // Nested class
    static class Color {
        String colorName;

        Color(String name) {
            this.colorName = name;
        }

        void displayColor() {
            System.out.println("Color: " + colorName);
        }
    }
}

// Concrete subclass
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstract_Nested{
    public static void main(String[] args) {
        // Creating an object of concrete subclass
        Circle circle = new Circle();
        circle.draw(); // Output: Drawing Circle

        // Creating an object of nested class
        Shape.Color color = new Shape.Color("Red");
        color.displayColor(); // Output: Color: Red
    }
}
