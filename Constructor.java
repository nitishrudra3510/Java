public class Constructor {
    //default constructor.
    Constructor(){
        System.out.println("COnstruction called");
    }
    //parameter constructor.
    Constructor(int a){
        System.out.println("Value of a is "+a);
    }
    public static void main(String[] args) {
        Constructor c = new Constructor();
        Constructor c1 = new Constructor(23);
    }
}
