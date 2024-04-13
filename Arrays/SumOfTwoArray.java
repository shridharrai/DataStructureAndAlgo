import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < arr1.length; ++i) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < arr2.length; ++i) {
            arr2[i] = scn.nextInt();
        }

        System.out.println("Sum");

        sumOfArrays(arr1, arr2);
    }

    public static void sumOfArrays(int[] arr1, int[] arr2) {
        int[] sumArr = new int[arr1.length > arr2.length ? arr1.length : arr2.length];

        int carry = 0;
        for(int i = arr1.length - 1, j = arr2.length - 1, k = sumArr.length - 1; k >= 0; --i, --j, --k) {
            int sum = carry;
            if(i >= 0) sum += arr1[i];
            if(j >= 0) sum += arr2[j];

            int digit = sum % 10;
            carry = sum / 10;

            sumArr[k] = digit;
        }

        if(carry > 0) System.out.println(carry);
        for(int digit: sumArr) {
            System.out.println(digit);
        }
    }
}