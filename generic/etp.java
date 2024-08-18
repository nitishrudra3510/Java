package generic;
import java.util.Scanner;

// public class etp {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();
        
//         if (isPalindrome(input)) {
//             System.out.println("The string is a palindrome.");
//         } else {
//             System.out.println("The string is not a palindrome.");
//         }
        
//         scanner.close();
//     }
    
//     public static boolean isPalindrome(String str) {
//         String reversed = "";
        
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed += str.charAt(i);
//         }
        
//         return str.equals(reversed);
//     }
// }





// public class etp{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();
        
//         if (isPalindrome(input)) {
//             System.out.println("The string is a palindrome.");
//         } else {
//             System.out.println("The string is not a palindrome.");
//         }
        
//         scanner.close();
//     }
    
//     public static boolean isPalindrome(String str) {
//         int left = 0;
//         int right = str.length() - 1;
        
//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
        
//         return true;
//     }
// }


public class etp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if(Palindrome(input)){
            System.out.println(input + " is a palindrome String");
        } else {
            System.out.println(input + " is not a palindrome String");
        }
        scanner.close();
    }

    public static boolean Palindrome(String str) {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
}

