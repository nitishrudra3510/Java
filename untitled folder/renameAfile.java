package filehandling;

import java.io.*;

public class renameAfile {
    public static void main(String[] args) {
        File f = new File("/Users/nitishkumar/Documents/Java/filehandling/akhilesh.txt");
        File f2 = new File("/Users/nitishkumar/Documents/Java/filehandling/nitish.txt");

        if (f.exists()) {
            System.out.println(f.renameTo(f2));
        } else {
            System.out.println("File does not exist....!");
        }
    }
}
