import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);    
        int t = scn.nextInt(); 

        for(int i = 0; i < t; ++i) {
            int num = scn.nextInt();
            // isPrime(num);
            isPrimeOptimised(num);
        } 
    }

    public static void isPrime(int num) {
        boolean isPrime = true;
        for(int i = 2; i < num; ++i) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }

    public static void isPrimeOptimised(int num) {
        boolean isPrime = true;
        for(int i = 2; i * i <= num; ++i) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}