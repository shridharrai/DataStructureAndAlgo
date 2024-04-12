import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        boolean isValidTriplet = isPythagoreanTriplet(num1, num2, num3);
        System.out.println(isValidTriplet);
    }

    public static boolean isPythagoreanTriplet(int num1, int num2, int num3) {
        
        int hypotenuse = Math.max(num1, num2);
        int base = Math.min(num1, num2);
        int perpendicular = Math.min(hypotenuse, num3);
        hypotenuse = Math.max(hypotenuse, num3);

        return ((base * base) + (perpendicular * perpendicular)) == (hypotenuse * hypotenuse);
    }
}