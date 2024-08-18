// package filehandling;

// import java.io.*;

// public class createAfile {
//     public static void main(String[] args) {
//         File f = new File("/Users/nitishkumar/Documents/Java/filehandling/LC.txt");
//         try {

//             if (f.createNewFile()) {
//                 System.out.println("File successfully create...!");
//             } else {
//                 System.out.println("File already availabes!.");
//             }
//         } catch (IOException e) {
//             System.out.println("FileHandling Exception Handled! ");
//         }
//     }
// }

package filehandling;

import java.io.*;

public class createAfile {
    public static void main(String[] args) throws Exception {
        File f = new File("/Users/nitishkumar/Documents/Java/filehandling/LC.txt");
        if (f.createNewFile()) {
            System.out.println("File successfully create...!");
        } else {
            System.out.println("File already availabes!.");
        }

    }
}
