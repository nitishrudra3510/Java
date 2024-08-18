package etp;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal{
    void sound(){
        System.out.println("Dog breaks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
