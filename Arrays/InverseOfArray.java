import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }

        int[] res = inverse(arr);

        System.out.println();
        for(int i = 0; i < res.length; ++i) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] inverse(int[] arr) {
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; ++i) {
            int index = arr[i];
            int value = i;
            result[index] = value;
        }

        return result;
    }
}