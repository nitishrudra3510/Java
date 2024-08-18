package etp;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class overrides sound() method of Animal
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Mthod_overloading {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Output: Dog barks
    }
}
