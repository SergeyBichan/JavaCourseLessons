package HomeTryingJava.Fibonacchi;

public class FibonacciSecVar {
    public static void main(String[] args) {
        int n = 20;
        int i;
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (i = 2; i < n; i++){
            fib[i] = fib[i-1] + fib[i - 2];
        }
        for (i = 0; i < n; ++i) {
            System.out.print(" " + fib[i]);
        }
    }


}
