public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        }

        System.out.println("Main method called ended successfully");
    }
    
}
