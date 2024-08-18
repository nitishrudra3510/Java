// public class lect9String {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");
//         //System.out.println(sb.capacity());
//         //System.out.println(sb.length());         //length();
//         //System.out.println(sb.append(" Java"));   // append(String)
//         //System.out.println(sb.insert(1, "Code."));
//         //System.out.println(sb.reverse());
//         //System.out.println(sb.charAt(3));  // charAt(index) means find index number.
//         //System.out.println(sb.substring(1, 3));    // substring(start, end);
        
//         System.out.println(sb.capacity());
//         sb.ensureCapacity(17);
//         System.out.println(sb.capacity());

//         sb.ensureCapacity(36);  // capacity = (old_capacity * 2)+2;
//         System.out.println(sb.capacity());
//     }
// }

import java.util.Scanner;

public class lect9String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = s.nextInt();
        System.out.println("ENTER the numbers columns : ");
        int columns = s.nextInt();

        int[][] arr = new int[rows][columns];
        System.out.println("Enter any elements : ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("Arrays elements are : ");

        for(int[] i:arr){
            for(int j:i){
                System.out.println(j+" ");
            }
            System.out.println(i+" ");
        }
    }
}
