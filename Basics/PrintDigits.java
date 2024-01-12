import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /* With Arraylist(Extra Space)*/
        // ArrayList<Integer> res = new ArrayList<Integer>();
        // while(n > 0) {
        //     int digit = n % 10;
        //     res.add(digit);
        //     n = n / 10;
        // }

        // for(int i = res.size() - 1; i >= 0; --i) {
        //     int digit = res.get(i);
        //     System.out.println(digit);
        // }


        /* Without extra space(Optimised) */
        int digits = countDigits(n) - 1;
        int divisor = (int)Math.pow(10, digits);

        while(divisor != 0) {  // Don't use n != 0, it will not work correct when last digits are 0
            int digit = n / divisor;
            System.out.println(digit);

            n = n % divisor;
            divisor = divisor / 10;
        }

        scn.close();
    }

    public static int countDigits(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }
}