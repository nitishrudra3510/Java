package etp;

import java.util.Scanner;

// public class fibonacci{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n= scanner.nextInt();

//         int a = 0, b = 1, c;
//         int k=0;
//         do{
//             if(k==0){
//                 System.out.println(k);
//                 k=1;

//             }else{
//                 System.out.println(a);
//             }

//             c=a+b;
//             a=b;
//             b=c;

//         }while(a<=n);
//         scanner.close();
//     }
// }


//import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number up to which Fibonacci series is to be generated: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
