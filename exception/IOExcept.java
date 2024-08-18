// import java.io.BufferedInputStream;
// import java.io.BufferedOutputStream;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.*;

// public class IOExcept {
//     public static void main(String[] args) {
//         try {
//             BufferedOutputStream f = new BufferedOutputStream(new FileOutputStream("newfile.txt"));
//             String content = "Hello, world!";
//             byte arr[] = content.getBytes();
//             f.write(arr);
//             System.out.println("Content added to file");
//             f.close();

//             BufferedInputStream file = new BufferedInputStream(new FileInputStream("newfile.txt"));

//             int ch = file.read();
//             while (ch != -1) {
//                 System.out.print((char) ch);
//                 ch = file.read();
//             }
//             file.close();
//         } catch (IOException e) {
//             System.out.println("Exception: " + e.getMessage());
//         }
//     }
// }


// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;

// public class IOExcept{
//     public static void main(String[] args) {
//         try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
//             bw.write("Hello, world!");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class IOExcept{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name: ");
        String f=sc.nextLine();
        if(!f.endsWith(".txt")){
            System.out.println("The format of file is not right in .txt format");
            return;
        }
        try{
            File file=new File(f);
            Scanner fs=new Scanner(file);
            System.out.println("Content of file: ");
            while(fs.hasNextLine()){
                String line=fs.nextLine();
                StringBuilder sb=new StringBuilder(line);
                sb.reverse();
                String m=sb.toString();
                System.out.println(m);
            }
        }catch(FileNotFoundException e){
            System.out.println("File dosen't exis");
        }finally{
            System.out.println("Code execute successfully");
        }
        sc.close();


    }
}