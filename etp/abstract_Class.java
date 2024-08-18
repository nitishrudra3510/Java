package etp;


abstract class Shape{
    abstract void draw();// abstract method;
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
public class abstract_Class {
    public static void main(String[] args) {
        Shape shape = new Circle();//// Creating object of concrete subclas
        shape.draw();
    }
}
