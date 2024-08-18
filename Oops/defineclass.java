package Oops;
class Pen{
    String color;
    String type;//bluepoints.

    public void Write(){
        System.out.println("Writin something.");
    }

    public void Printcolor(){
        System.out.println(this.color);  // this.color-> this is a keyword and this ye btayega ki is object ne kis function ko call kiya hai..

    }

}
public class defineclass {
   public static void main(String args[]){
    Pen pen = new Pen();
    pen.color = "blue";
    pen.type="gel";

    pen.Write();
   } 
}
