// public class lect8_array {


//     void printArray(int[] arr){
//         for(int i: arr){
//             System.err.println(i);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6};
//         printArray(arr);
//     }
// }


// // Method with variable arguments
// public class lect8_array {
//     // Method with variable arguments
//     public static int sum(int... numbers) {
//         int total = 0;
//         for (int num : numbers) {
//             total += num;
//         }
//         return total;
//     }

//     public static void main(String[] args) {
//         // Calling method with variable number of arguments
//         System.out.println(sum(1, 2, 3)); // Output: 6
//         System.out.println(sum(1, 2, 3, 4, 5)); // Output: 15
//     }
// }



// enum Day{
//     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,SUNDAY
// }

// public class lect8_array{
//     public static void main(String args[]){
//         Day today = Day.MONDAY;
//         System.out.println("Today is " + today);
//     }
// }

// import java.util.Scanner;

// // Enumeration declaration
// enum Day {
//     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

//     // Enum function to get the day of the week
//     public static Day getDay(String day) {
//         return Day.valueOf(day.toUpperCase());
//     }
// }

// public class lect8_array {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter the day of the week
//         System.out.print("Enter the day of the week: ");

//         // Read the input provided by the user
//         String userInput = scanner.nextLine();

//         // Get the corresponding enum value based on user input
//         Day day = Day.getDay(userInput);

//         // Display the enum value
//         System.out.println("You entered: " + day);

//         scanner.close();
//     }
// }


public class lect8_array{
    // Method with variable arguments
    public static int sum(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    return total;
}

// Calling method with variable number of arguments
    public static void main(String[] args) {
        
    

    System.out.println(sum(1, 2, 3)); // Output: 6
    System.out.println(sum(1, 2, 3, 4, 5)); // Output: 15

}

}