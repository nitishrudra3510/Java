package etp;
class Animal {}

class Dog extends Animal {}

public class Instance_of{
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal instanceof Animal); // Output: true
        System.out.println(animal instanceof Dog);    // Output: true
    }
}
// to check if the specified object is an instance of a class, subclass, or 

