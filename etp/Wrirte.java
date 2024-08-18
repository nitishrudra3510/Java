package etp;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// public class Wrirte {
// //     public static void main(String[] args) {
// //         try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
// //             bw.write("Hello, world!");
// //         } catch (IOException e) {
// //             e.printStackTrace();
// //         }
// //     }
// // }





// }


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Wrirte{
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
            MyClass obj = new MyClass();
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
