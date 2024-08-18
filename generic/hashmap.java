package generic;

import java.util.*;
public class hashmap{
    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();
        names.put(4, "ABC");
        names.put(5, "DEF");
        names.put(6,"ABChdjfsj");
        System.out.println(names);

        HashMap<Integer, String> names1 = new HashMap<>();
        names1.put(3, "XYZ");

        names.putAll(names1);

        System.out.println(names);

    }
}