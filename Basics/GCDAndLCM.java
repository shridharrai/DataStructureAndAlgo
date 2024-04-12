import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD is " + gcd);

        int lcm = num1 * num2 / gcd;
        System.out.println("LCM is " + lcm);
    }

    public static int calculateGCD(int num1, int num2) {
        int divisor = num1;
        int dividend = num2;

        while(divisor != 0) {
            int reminder = dividend % divisor;

            dividend = divisor;
            divisor = reminder;
        }

        return dividend;
    }
}