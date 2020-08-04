package core.pgms;

public class PrimeExample {
    public static void main(String args[]) {
        System.out.println(isPrime(3));
    }
    //2,3,5,7...are the prime numbers
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
        //for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


