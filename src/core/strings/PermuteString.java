package core.strings;

public class PermuteString {
    public static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char ch;
        ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generatePermutation(str, 0, len);
    }

    public static void generatePermutation(String str, int start, int end) {
        if (start == end - 1)
            System.out.println(str);
        else {
            for (int i = start; i < end; i++) {
                str = swap(str, start, i);
                generatePermutation(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }
}