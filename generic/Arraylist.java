package generic;

import java.util.*;

// // without using generics;

// public class Arraylist {
//     public static void main(String[] args) {

//     ArrayList list = new ArrayList();
//     list.add("Hello");

//     list.add(123);
//     list.add(12.9);

//     System.out.println(list);  // Before Update;

//     System.out.println(list.get(2));
//     list.set(2,13.29033);
//     System.out.println(list);  // After Update;

//     list.remove(1);

//     System.out.println(list); // After Remove

//     }
// }

// using generics;- integer, string, char;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        list.add(123);
        list.add(12);

        stringList.add("nitish");

        System.out.println(list); // Before Update;
        System.out.println(stringList);

        System.out.println(list.get(2));
        list.set(2, 13345);
        System.out.println(list); // After Update;

        list.remove(1);

        System.out.println(list); // After Remove

    }
}
