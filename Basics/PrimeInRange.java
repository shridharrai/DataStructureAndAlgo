import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i = low; i <= high; ++i) {
            boolean res = isPrime(i);
            if(res) System.out.println(i);
        }

        scn.close();
    }

    public static boolean isPrime(int num) {
        if(num == 1) return false;

        boolean isPrime = true;
        for(int i = 2; i * i <= num; ++i) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}