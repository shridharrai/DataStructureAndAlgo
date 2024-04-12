import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for(int divisor = 2; divisor * divisor <= num; ++divisor) {
            while(num % divisor == 0) {
                System.out.print(divisor + " ");
                num /= divisor;
            }
        }

        if(num != 1) System.out.print(num);
    }
}