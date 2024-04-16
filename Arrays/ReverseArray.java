import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }

        reverseArray(arr);

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        for(int i = 0, j = arr.length - 1; i < j; ++i, --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}