import java.util.Scanner;
import java.lang.Math;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int res = rotateNumber2(n, k);
        System.out.println(res);
    }

    public static int countDigits(int num) {
        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static int rotateNumber1(int num, int k) {
        int numOfDigits = countDigits(num);
        int firstPlaceValue = (int)Math.pow(10, numOfDigits - 1);

        k = k % numOfDigits;
        if(k < 0) k = k + numOfDigits;
        while(k != 0) {
            int digit = num % 10;
            int remainingNum = num / 10;

            int rotatedDigit = digit * firstPlaceValue;
            num = rotatedDigit + remainingNum;
            --k;
        }

        return num;
    }

    public static int rotateNumber2(int num, int k) {
        int numOfDigits = countDigits(num);
        
        k = k % numOfDigits;
        if(k < 0) k = k + numOfDigits;

        int divisor = (int)Math.pow(10, k);
        int multiplier = (int)Math.pow(10, numOfDigits - k);

        int quotient = num / divisor;
        int reminder = num % divisor;

        int rotatedNumber = quotient + reminder * multiplier;

        return rotatedNumber;
    }
}