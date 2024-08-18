import java.util.Scanner;
import java.util.*;
// write a code to print the half of the input number.
public class prahladsQues {
    // Scanner sc = new Scanner(System.in);
    // int inp = sc.nextInt();
    // int b = inp/2;
    //System.out.println(b);
    //System.out.println(b);
    // if(inp!=b){
    //     System.err.println(b);
    // }
    // else{
    //     System.out.println("erorr.");
    // }

  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();
        
        float x = (int) a;
        float b = x / 2.0f; // ensure floating-point division
        
        System.out.println(b);
    }
}


