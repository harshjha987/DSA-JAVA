package HashMap;
import java.util.*;
public class Basics {
    public static void main(String[] args){
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("Burger" ,200);
        hm.put("Coffee", 100);
        System.out.println(hm);
        // int rem = hm.get("Burger");
        // System.out.print(rem);
        // System.out.print(hm.containsKey("Coffee"));

        //to Iterate in hashmap we must do this
        Set<String> keys = hm.keySet(); // this gives collection of keys
        System.out.println(keys);

        //start a loop on these keys

        for(String k : keys){
            System.out.print(k + hm.get(k));
        }
        //hm.entrySet() this gives collection of values

    }
   

    
}
