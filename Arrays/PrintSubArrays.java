import java.util.Scanner;

public class PrintSubArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }

        printSubArrays(arr);
    }

    public static void printSubArrays(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = i; j < arr.length; ++j) {
                for(int k = i; k <= j; ++k) {
                    System.out.print(arr[k] + "\t");
                }

                System.out.println();
            }
        }
    }
}