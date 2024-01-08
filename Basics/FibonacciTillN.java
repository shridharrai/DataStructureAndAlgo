import java.util.Scanner;

public class FibonacciTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int first = 0;
        int second = 1;
        while(n > 0) {
            System.out.println(first);
            int sum = first + second;
            first = second;
            second  = sum;
            --n;
        }
    }
}