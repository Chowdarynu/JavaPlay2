package core.pgms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeysHashMapExample1
{
    public static void main(String[] args) {

        Map<Integer, String> unsortedMap = new HashMap<Integer, String>();
        unsortedMap.put(5, "asd");
        unsortedMap.put(1, "cfd");
        unsortedMap.put(7, "gdf");
        unsortedMap.put(43, "fsa");
        
        //Print the Elements of the Map before Sorting
        System.out.println("Elements of the HashMap before Sorting");
        printMap(unsortedMap);
        
        //Create a Treemap of unsortedMap to get it sorted
        Map<Integer,String> sortedMap = new TreeMap<Integer,String>(unsortedMap);
        
        //Print the Elements of the Map after Sorting
        System.out.println("Elements of the HashMap after Sorting");
        printMap(sortedMap);
        
    }

    public static void printMap(Map<Integer, String> map) {
        System.out.println("**************************************");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() 
                                      + " Value : " + entry.getValue());
        }
        System.out.println();
    }
}