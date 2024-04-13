import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }

        int maxHeight = findMax(arr);
        printBarChart(arr, maxHeight); 
    }

    public static void printBarChart(int[] arr, int maxHeight) {
        for(int i = maxHeight; i > 0; --i) {
            for(int j = 0; j < arr.length; ++j) {
                if(arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; ++i) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}