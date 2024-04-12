import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int digit = scn.nextInt();

        int frequency = countFrequency(num, digit);
        System.out.println(frequency);
    }

    public static int countFrequency(int num, int searchDigit) {
        int count = 0;
        while(num != 0) {
            int digit = num % 10;
            if(digit == searchDigit) count++;

            num /= 10;
        }

        return count;
    }
}