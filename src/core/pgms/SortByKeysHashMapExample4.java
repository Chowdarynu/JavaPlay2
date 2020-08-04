package core.pgms;

import java.util.*;

public class SortByKeysHashMapExample4
{
    public static void main(String[] args) {

        Map<Integer, String> unsortedMap = new HashMap<Integer, String>();
        unsortedMap.put(5, "zsd");
        unsortedMap.put(1, "cfd");
        unsortedMap.put(7, "gdf");

        //Print the Elements of the Map before Sorting
        System.out.println("Elements of the HashMap before Sorting");
        printMap(unsortedMap);
        
        List<Map.Entry<Integer,String>> unsortedList = new ArrayList<>(unsortedMap.entrySet());
        
        Collections.sort(unsortedList, Comparator.comparing(Map.Entry::getKey));//c1.getKey().compare(c2.getKey())
        Map<Integer,String> sortedMap = new LinkedHashMap<Integer,String>();
        
        for(Map.Entry<Integer,String> entry:unsortedList){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
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