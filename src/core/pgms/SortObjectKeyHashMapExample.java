package core.pgms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortObjectKeyHashMapExample {
    public static void main(String args[]) {
        Map<Car, String> unsortedMap = new HashMap<>();

        Car c1 = new Car("Red", 3);
        Car c2 = new Car("Blue", 1);
        Car c3 = new Car("Green", 4);
        Car c4 = new Car("Yellow", 2);

        unsortedMap.put(c1, "Red Car");
        unsortedMap.put(c2, "Blue Car");
        unsortedMap.put(c3, "Green Car");
        unsortedMap.put(c4, "Yellow Car");

        //Print the Elements of the Map before Sorting
        System.out.println("Elements of the HashMap before Sorting");
        printMap(unsortedMap);

        /*Map<Car, String> sortedMap = new TreeMap<Car, String>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getWheels().compareTo(o2.getWheels());
            }
        });*/

        Map<Car, String> sortedMap = new TreeMap<>(Comparator.comparing(Car::getWheels));
        sortedMap.putAll(unsortedMap);
        //Print the Elements of the Map after Sorting
        System.out.println("Elements of the HashMap after Sorting");
        printMap(sortedMap);
    }

    public static void printMap(Map<Car, String> map) {
        System.out.println("**************************************");
        for (Map.Entry<Car, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + "  Value : " + entry.getValue());
        }
        System.out.println();
    }
}

class Car {
    private String color;
    private Integer wheels;

    public Car(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public Integer getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "" + color + "" + wheels;
    }
}