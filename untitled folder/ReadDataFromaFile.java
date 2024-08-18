package filehandling;

// //import java.io.*;
// import java.io.FileReader;
// import java.io.IOException;

// public class ReadDataFromaFile {
//     public static void main(String[] args) {
//         try {
//             FileReader reader = new FileReader("LCC.txt");

//             try {
//                 int i;
//                 while ((i = reader.read()) != -1) {
//                     System.out.print((char) i);
//                 }
//             } finally {
//                 reader.close();
//                 System.out.println("File Closed.!");
//             }
//         } catch (IOException e) {
//             System.out.println("Exceptiion Handled");
//         }
//     }
// }

import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromaFile {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("LCC.txt");

            try {
                int i;
                while ((i = reader.read()) != -1) {
                    System.out.print((char) i); // Print without new line
                }
            } finally {
                reader.close();
            }
        } catch (IOException e) {
            System.out.println("Exception Handled"); // Corrected message
        }
    }
}
