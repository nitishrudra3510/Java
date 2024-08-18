// class Pen{
//     String color;
//     String type;  // ballpoint;

//     public void write(){
//         System.out.println("writing something....");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }

// }

// public class lect10_Oops {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "gel";

//         //pen1.write();

//         Pen pen2 = new Pen();

//     }
// }


public class lect10_Oops {
    int roll_no = 12;
    String name = "Rudra";

    void getvalues() {
        System.out.println("Name : " + name + " roll_no : " + roll_no);
    }

    public static void main(String[] args) {
        lect10_Oops obj = new lect10_Oops();
        obj.getvalues();
    }
}
