import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        rotateArray(arr, k);

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        // For larger K
        k = k % arr.length;

        // For -ve k
        if(k < 0) k = k + arr.length;

        // Reverse First Half
        reverseArray(arr, 0, arr.length - k - 1);
        // Reverse Second Half
        reverseArray(arr, arr.length - k, arr.length - 1);

        // Reverse the Whole Array
        reverseArray(arr, 0, arr.length - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        for(int i = start, j = end; i < j; ++i, --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}