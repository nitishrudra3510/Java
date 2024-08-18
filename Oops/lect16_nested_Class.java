// package Oops;
// class Outer{
//     int a = 56;
//     private int b = 23;
//     private int c = 58;

//     class inner{
//         void function1(){
//             System.out.println("Value of a : "+a);
//             System.out.println("Value of b : "+b);
//             System.out.println("Value of c: "+c);
//         }
//     }
// }
// public class lect16_nested_Class{
//     public static void main(String[] args){
//         Outer outer = new Outer();
//         Outer.inner obj = outer.new inner();
//         obj.function1();
//     }
// }


// static nested class-> we can access static instance variables only;
package Oops;
class Outer{
    int a = 56;
    private int b = 23;
    static int c = 58;

    static class inner{  // static nested class-. access to static instance variables;
        void function1(){
            // System.out.println("Value of a : "+a);
            // System.out.println("Value of b : "+b);
            System.out.println("Value of c: "+c);
        }
    }
}
public class lect16_nested_Class{
    public static void main(String[] args){
        // Outer outer = new Outer();
        //Outer.inner obj = outer.new inner(); // Non static; 
        Outer.inner obj = new Outer.inner(); // Static;
        obj.function1();
    }
}