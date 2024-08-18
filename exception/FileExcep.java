import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class FileExcep {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("File name: ");
            String filename = sc.nextLine();
            if (!filename.endsWith(".txt")) {
                System.out.println("Error: Only .txt files are supported.");
                return;
            }
            File file = new File(filename);
            if (!file.exists() || !file.isFile()) {
                System.out.println("Error: File not found or invalid.");
                return;
            }
            try (Scanner sr = new Scanner(file)) {
                System.out.println("Content of file: ");
                while (sr.hasNextLine()) {
                    String line = sr.nextLine();
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found or could not be read.");
            }
        }
    }
}
