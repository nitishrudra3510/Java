package filehandling;

// import java.io.FileWriter;
// import java.io.IOException;

// public class WriteOnFile {
//     public static void main(String[] args) {
//         try {
//             FileWriter f = new FileWriter("/Users/nitishkumar/Documents/Java/filehandling/LCC.txt");
//             try {
//                 f.write("Java programing is the best langauge");
//             } finally {
//                 f.close();
//             }
//             System.out.println("Success wrote data in the file..!");
//         } catch (IOException e) {
//             System.out.println(e);
//         }
//     }
// }

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;

// public class WriteOnFile {
//     public static void main(String[] args) {
//         try (BufferedWriter writer = new BufferedWriter(
//                 new FileWriter("/Users/nitishkumar/Documents/Java/filehandling/LCC.txt"))) {
//             writer.write("Java programming is the best language");
//             System.out.println("Successfully wrote data to the file!");
//         } catch (IOException e) {
//             System.out.println(e);
//         }
//     }
// }

// import java.io.FileOutputStream;
// import java.io.IOException;

// public class WriteOnFile {
//     public static void main(String[] args) {
//         try (FileOutputStream fos = new FileOutputStream("/Users/nitishkumar/Documents/Java/filehandling/LCC.txt")) {
//             String dataString = "Java Programing";
//             fos.write(dataString.getBytes());
//             System.out.println("Success!");
//         } catch (IOException e) {
//             System.out.println(e);
//         }
//     }
// }

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteOnFile {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(
                new FileWriter("/Users/nitishkumar/Documents/Java/filehandling/LCC.txt"))) {
            writer.println("Java programming is the best language");
            System.out.println("Successfully wrote data to the file!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
