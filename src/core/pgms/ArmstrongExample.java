package core.pgms;

//153 = 1*3+2*3+3*3
public class ArmstrongExample {
    public static void main(String[] args) {
        int c = 0, r, temp;
        int n = 153;//It is the number to check armstrong
        temp = n;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            c += (r * r * r);
        }
        if (temp == c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}