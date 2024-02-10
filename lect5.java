// // simple intrest rate
// import java.util.Scanner;
// public class lect5 {
    
//     public static void  main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter P value: ");
//         int P = scanner.nextInt();
//         System.out.print("Enter R value : ");
//         int R = scanner.nextInt();
//         System.out.print("Enter S value : ");
//         int S = scanner.nextInt();

//         int SI = (P*R*S)/100;
//         System.out.println("Simple intrest rate : "+ SI);

//         scanner.close();
//     }
    
// }


//import java.util.Scanner;
// public class lect5 {
//     public static void main(String[] args)
//     {
//         Scanner scanner = new Scanner((System.in));
//         System.out.println("ENTER VALUE of a : " );
//         int a = scanner.nextInt();
//         System.out.println("ENTER VALUE of b : " );
//         int b = scanner.nextInt();
//         System.out.println("ENTER VALUE of c : " );
//         int c = scanner.nextInt();

//         if(a>b)
//         {
//             if(a>c)
//             {
//                 System.out.println("a");
//             }
//             else
//             {
//                 System.out.println("c");
//             }
//         }

//         else
//         {
//             if(b>c)
//             {
//                 System.out.println("b");
//             }else{
//                 System.out.println("c");
//             }
//         }

//         scanner.close();


//     }
// }
// leap year or not leap year.
// import java.util.Scanner;;
// public class lect5{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);

//         int value = scanner.nextInt();

//         String result = (value%4==0 && (value%100!= 0 || value%400==0)) ? "leap year" : "Not leap year";

//         System.out.println(value + " is " + result);

//         scanner.close();
//     }
// }


import java.util.Scanner;
public class lect5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n = scanner.nextInt();
        
        int div = 2;

        while (div<n) {
            if(n%div==0){
                System.out.println("Not prime number.");;
            }else{
                System.out.println(div=div+1);
            }
        }
        System.out.println("Prime number.");
        scanner.close();
    }
}