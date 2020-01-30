import java.util.Scanner;

public class Practice01MathIterative implements Practice01Math {
    // public static void main(String [] args) {

    //     int n=9;
    //     System.out.println(fib(n));
    //     System.out.println(fact(n));
    // }

    public int fib(int n) throws Exception{
        if (n<0) {
            throw new Exception("Negative numbers are not allowed");
        }
        if(n<=1) {
            return n;
        }       
        int finalFib = 1;
        int prevFib = 1;
        int temp;

        for(int i=2; i<n;i++) {
            temp = finalFib;
            finalFib += prevFib;
            prevFib = temp;
        }
        return finalFib;
    }
    public int fact(int n) throws Exception {
        if (n<=0) {
            throw new Exception("Negative numbers and zero are not allowed");
        }
        if(n<=1) {
            return n;
        }
        int total = n;
        while(n>=2) {
            total = total * (n-1);
            n--;
        }
        return total;
    }
}

