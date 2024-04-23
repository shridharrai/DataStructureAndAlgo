import java.util.Scanner;

public class PrintSubsetsOfArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }

        int totalSubsets = (int)Math.pow(2, arr.length);

        for(int i = 0; i < totalSubsets; ++i) {
            String subset = "";
            int temp = i;

            for(int j = arr.length - 1; j >= 0; --j) {
                int reminder = temp % 2;
                temp = temp / 2;

                if(reminder == 0) {
                    subset = "-" + "\t" + subset;
                } else {
                    subset = arr[j] + "\t" + subset;
                }
            }

            System.out.println(subset);
        }
    }
}