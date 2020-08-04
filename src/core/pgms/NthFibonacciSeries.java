package core.pgms;

public class NthFibonacciSeries {
    static int a=-1, b=1, c=0;

    public static void main(String[] args) {
        m1(4);
        System.out.println("c:"+c);//0 1 1 2 3 5 8
    }

    private static void m1(int n) {
        if(n==0)
            return;
        c=a+b;
        a=b;
        b=c;
        System.out.println(a+":"+b+":"+c);
        m1(n-1);
    }
}

/**
 *  a b c
 *  - - -
 *  1 0 0
 *  0 1 1
 *  1 1 1
 *  1 2 2
 *
 *
 *
 */