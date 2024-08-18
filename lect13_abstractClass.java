abstract class A{
    abstract void display();
}

public class lect13_abstractClass extends A{
    void display(){
        System.out.println("From class lect13.");
    }
    public static void main(String[] args) {
        lect13_abstractClass obj = new lect13_abstractClass();
        obj.display();
    }
}