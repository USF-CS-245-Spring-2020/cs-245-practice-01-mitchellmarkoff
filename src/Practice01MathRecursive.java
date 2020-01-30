import java.util.Scanner;

public class Practice01MathRecursive implements Practice01Math {
    // public static void main(String [] args) {

    //     int n=9;
    //     System.out.println(fib(n));
    //     System.out.println(fact(n));
    // }

    public int fib(int n)  throws Exception {
        if (n<0) {
            throw new Exception("Negative numbers are not allowed");
        }
        if(n<=1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public int fact(int n) throws Exception {
        if (n<=0) {
            throw new Exception("Negative numbers and zero are not allowed");
        }
        if(n<=1) {
            return n;
        }
        return n * fact(n-1);
    }
}

