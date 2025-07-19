//STORE KEY-VALUE PAIRS

import java.util.HashMap;

public class Hash_map {
    public static void main(String[] args) {
        HashMap <String,String> country = new HashMap<>();
        country.put("INDIA","DELHI");
        country.put("USA","WASHINGTON DC");
        // country.put("USA","WASH");
        country.put("RUSSIA","MOSCOW");
        // country.remove("INDIA");
        // System.out.println(country.get("INDIA"));
        // country.clear();
        System.out.println(country.size());
        country.replace("USA","WASHINGTON DC","BELGIUM");
        // System.out.println(country.containsKey("USA"));
        System.out.println(country);
        for (String i: country.values())
        {
          System.out.println(i);
        }
        for (String i: country.keySet())
        {
          System.out.println(i);
        }

    }
    
}
