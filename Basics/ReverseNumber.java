import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printReverseDigits(n);
    }

    public static void printReverseDigits(int num) {
        while(num > 0) {
            int digit = num % 10;
            System.out.println(digit);

            num /= 10;
        }
    }
}