package core.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharFinder {
    public void findIt(String str) {  
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();  
        for (Character ch : charArray) {  
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {  
                map.put(ch, 1);
            }  
        }  
        Set<Character> keys = map.keySet();
        for (Character ch : keys) {  
            if (map.get(ch) > 1) {
                System.out.println(ch + "  is " + map.get(ch) + " times");
            }  
        }  
    }  
   
    public static void main(String a[]) {  
        DuplicateCharFinder dcf = new DuplicateCharFinder();  
        dcf.findIt("India is my country");  
    }  
}

/**
 *    is 3 times
 * i  is 2 times
 * n  is 2 times
 * y  is 2 times
 */