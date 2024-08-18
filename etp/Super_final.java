package etp;

class Animal {
    final void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    void sound(){
        // Canot override final method sound() in Animal 
    }
}

public class Super_final{
    public static void main(String[] args){
        Dog dog = new Dog();
            dog.sound();
        
    }
}
