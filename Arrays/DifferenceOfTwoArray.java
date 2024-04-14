import java.util.Scanner;

public class DifferenceOfTwoArray {
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

        differenceOfArrays(arr1, arr2);
    }

    // Assumption :- arr2 - arr1 i.e.arr2 > arr1
    public static void differenceOfArrays(int[] arr1, int[] arr2) {
        int[] differenceArray = new int[arr2.length];

        int carry = 0;
        for(int i = arr1.length - 1, j = arr2.length - 1, k = differenceArray.length - 1; k >= 0; --i, --j, --k) {
            int difference = carry;
            int firstDigit = arr2[j] + difference;
            int secondDigit = i >= 0 ? arr1[i] : 0;

            if(firstDigit < secondDigit) {
                difference = (firstDigit + 10) - secondDigit;
                carry = -1;
            } else {
                difference = firstDigit - secondDigit;
                carry = 0;
            }

            differenceArray[k] = difference; 
        }

        System.out.println("__Difference__");

        boolean isFirstNonZeroEncountered = false;
        for(int k = 0; k < differenceArray.length; ++k) {
            int digit = differenceArray[k];
            if(digit > 0) isFirstNonZeroEncountered = true;
            if(isFirstNonZeroEncountered) System.out.print(differenceArray[k] + " ");
        }
    }
}