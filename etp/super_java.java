package etp;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();// Calling superclass method
        System.out.println("Dog barks");
    }
}
public class super_java{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}


