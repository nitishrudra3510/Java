// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         int marks[] = new int[3];
//         marks[0] = 98;
//         marks[1] = 99;
//         marks[2] = 100;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         // for(int i:marks){
//         //     System.err.println(i);
//         // }

//         for(int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         int marks[] = {98, 97, 199};
        
//         System.out.println(marks[0]);
//         for(int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// import java.util.*;
// public class array{
//     public static void main(String args[]){
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int marks[] = new int[size];

//        //input:- 
//        for(int i=0; i<size; i++){
//         marks[i] = scanner.nextInt();
//        }


//        //output:-
//        for(int i=0; i<size; i++){
//         System.out.println(marks[i]);
//        }
//     }
// }


// take an array as input from the user. search for a given number x and print
// the index at which it occur.

// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int size = scanner.nextInt();

//         int marks[] = new int[size];

//         for(int i=0; i<size; i++){
//             marks[i] = scanner.nextInt();
//         }
//         int x = scanner.nextInt();
//         for(int i=0; i<marks.length; i++){
//             if(x == marks[i]){
//             System.out.println("found at index at : "+ i);
//             }
        
//         }
//     }
// }



// for 1 D aray:
// int[] array_name = new int[size];
// int[] num = new int[3];

// 2D array:
//int [][] array = new int[rows][columns]; 
//int [][] num = new int[3][5];


//2D ARRAY:

// import java.util.*;
// public class array{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int rows = scanner.nextInt();
//         int columns = scanner.nextInt();

//         int[][] numbers = new int[rows][columns];
//         //input:
//         //i->rows;
//         //j-> columns;
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 numbers[i][j] = scanner.nextInt();
//             }
//         }

//         //output:
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 System.out.print(numbers[i][j]);
//             }
//         }

//         scanner.close();
//     }
// }


//take a matrix an input from the user. search for a given number and print indices at which it's occur.

import java.util.*;
public class array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] numbers = new int[rows][columns];
        //input:
        //i->rows;
        //j-> columns;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }

        int x = scanner.nextInt();

        //output:
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(numbers[i][j]==x)
                    System.out.print("x found at locations : ("+ i+"j "+ j+" )");
            }
        }

        scanner.close();
    }
}