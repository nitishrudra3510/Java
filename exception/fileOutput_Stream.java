import java.io.FileOutputStream;

public class fileOutput_Stream {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("myFile.txt")) {
            String text = "Hello world";
            byte[] arr = text.getBytes();
            fos.write(arr);
            System.out.println("Complete..");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
