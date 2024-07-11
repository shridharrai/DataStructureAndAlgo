public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        // int fibn = fib(n);
        int fibn = fibMemo(n, new int[n + 1]);
        System.out.println(fibn);
    }

    public static int fib(int n) {
        if(n == 0 || n == 1) return n;

        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fibn = fibnm1 + fibnm2;

        return fibn;
    }

    public static int fibMemo(int n, int[] results) {
        if(n == 0 || n == 1) return n;
        if(results[n] != 0) return results[n];

        int fibnm1 = fibMemo(n - 1, results);
        int fibnm2 = fibMemo(n - 2, results);
        int fibn = fibnm1 + fibnm2;

        results[n] = fibn;
        return fibn;
    }
}