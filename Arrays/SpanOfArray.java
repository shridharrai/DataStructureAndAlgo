import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = scn.nextInt();
        }

        int span = calculateSpan(arr);
        System.out.println(span);
    }

    public static int calculateSpan(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; ++i) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]); 
        }

        return max - min;
    }
}