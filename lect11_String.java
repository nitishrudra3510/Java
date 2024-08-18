// import java.util.Scanner;

// public class lect11_String {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         //String name = scanner.next();  // it will be print one word only-> next();
//         String name1 = scanner.nextLine(); // it willprint of line (many words);-> nextLine();
//         //System.out.println("Your name is : "+name);
//         System.out.println("Your name is : "+name1);
//     }
// }


// import java.util.Scanner;

// public class lect11_String {
//     public static void main(String[] args) {
//         //concatenation
//         String fname = "nitish";
//         String sname = "kumar";
        
//         String full_name = fname+ "@"+sname;
//         //nitish@kuamr
//         System.out.println(full_name);
//         System.out.println(full_name.length());

//         // charAt;
//         for(int i=0; i<full_name.length(); i++){
//             System.out.println(full_name.charAt(i));
//         }
//     }
// }





// public class lect11_String {
//     public static void main(String[] args) {
//         //compare
//         // String name1 = "Swayam";
//         // String name2 = "Swayam";

//         // //1. s1>s2 : +ve value
//         // //2. s1==s2 : 0;
//         // //3. s1<s2 : -ve value

//         // if(name1.compareTo(name2)==0){
//         //     System.out.println("Strings are equal");
//         // }else{
//         //     System.out.println("Strings are not equal.");
//         // }

//         if(new String("nitish")==new String("nitish")){
//             System.out.println("String are equal.");     // Strings are not equal.

//         }else{
//             System.out.println("Strings are not equal.");
//         }

        
//     }
// }



// public class lect11_String {
//     public static void main(String[] args) {
//         // substring
//         String sentence = "I am a String";
//         //substring(beg_index, end_index);
//         // String name = sentence.substring(11, sentence.length());
//         String name = sentence.substring(5);
//         System.out.println(name);
        
//     }
// }



// public class lect11_String {
//     public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Piyush");
//        System.out.println(sb);
       
//     //    // char at index 0;
//     //    System.out.println(sb.charAt(0));

//     //    // set char at index 0;
//     //    sb.setCharAt(0, 'T');
//     //    System.err.println(sb);


//     // sb.insert(0, 'S');
//     // sb.insert(2, 'S');
//     // System.out.println(sb);

//     // sb.delete(2,3, 0);
//     // System.out.println(sb);


//     // sb.append("a");
//     // sb.append("b");
//     // sb.append("c");
//     // System.out.println(sb);
//     }
// }


// // String are immutable.



// reverse String.

public class lect11_String{
    public static void main(String[] args) {
        //reverse string;
        StringBuilder sb = new StringBuilder("Hello");

        for(int i=0; i<sb.length()/2; i++){
            int font = i;
            int back = sb.length()-1-i;  //5-1-0;
            
            char fontchar = sb.charAt(font);
            char backchar = sb.charAt(back);

            sb.setCharAt(font, backchar);
            sb.setCharAt(back, fontchar);
        }
        System.out.println(sb);


    }
}