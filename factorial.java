import java.util.Scanner;

public class factorial {
    public static int calculatefact(int num){
            int factorial = 1;
            for(int i=1; i<=num; i++){
                factorial = factorial*i;
            }
            return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter a number : ");
        int number = scanner.nextInt();
        int result = calculatefact(number);
        System.err.println(result);
        scanner.close();
    }
    
}
