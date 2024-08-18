package generic;

import java.util.*;

public class MapFunc {
    public static void main(String[] args) {
        Map<String, String> countryCodeMap = new HashMap<String, String>();
        countryCodeMap.put("IN", "India");

        countryCodeMap.put("US", "United States");

        Set<String> codesets = countryCodeMap.keySet();

        for (String countryCode : codesets) {
            String countryNAme = countryCodeMap.get(countryCode);
            System.out.println(countryCode + " is the code for : " + countryNAme);
        }

    }
}
