package etp;


interface Printable{
    void print();
}

//class implementation interface;
class Myclass implements Printable{
    public void print(){
        System.out.println("Printing....");
    }
}


public class Interfaces{
    public static void main(String[] args) {
        Printable printable = new Myclass();
        printable.print();
    }
}
