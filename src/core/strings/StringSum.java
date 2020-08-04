package core.strings;

public class StringSum {
    static String s="8,1,2,3";

    public static void main(String[] args) {
        int n = findSum(s);
        System.out.println("Sum value is: "+n);//14
    }

    private static int findSum(String s) {
        int i=0, w=0, sum=0;
        while(i<s.length()){
            if(s.charAt(i) == ',' || i == s.length() - 1){
                if(i==s.length()-1){
                    i++;
                }
                int k = getPrimitiveValue(w, i);
                sum+=k;
                w=i+1;
            }
            i++;
        }
        return sum;
    }

    private static int getPrimitiveValue(int w, int i) {
        return Integer.parseInt(s.substring(w, i));
    }
}
