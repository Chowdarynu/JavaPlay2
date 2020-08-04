
package core.datastructures.arrays;

import java.util.Arrays;

public class ThirdLargestInArrayExample {
    public static int getThirdLargest(int[] a, int len) {
        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[len - 3];
    }

    public static int getThirdLargest2(int[] a, int len){
        Arrays.sort(a);
        return a[len-3];
    }
    public static void main(String args[]) {
        int a[] = {1, 2, 5, 6, 3, 2};
        System.out.println("Third Largest: " + getThirdLargest(a, 6));
    }
}


