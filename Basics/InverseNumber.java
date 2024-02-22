import java.util.Scanner;
import java.lang.Math;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inverseNum = inverseNumber(n);
        System.out.println(inverseNum);
    }

    public static int inverseNumber(int num) {
        int place = 1;
        int inverseNum = 0;
        while(num > 0) {
            int digit = num % 10;
            int inverseDigit = place * (int)Math.pow(10, digit - 1);

            inverseNum += inverseDigit;

            place++;
            num /= 10;
        }

        return inverseNum;
    }
}