import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter Element");
        int num = scn.nextInt();

        printFirstAndLastIdx(arr, num);
    }

    public static void printFirstAndLastIdx(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        int firstIdx = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(arr[mid] > num) {
                high = mid - 1;
            } else if(arr[mid] < num) {
                low = mid + 1;
            } else {
                firstIdx = mid;
                high = mid - 1;
            }
        }

        low = 0;
        high = arr.length - 1;
        int lastIdx = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] > num) {
                high = mid - 1;
            } else if(arr[mid] < num) {
                low = mid + 1;
            } else {
                lastIdx = mid;
                low = mid + 1;
            }
        }

        System.out.println("First and last idx are " + firstIdx + " " + lastIdx);
    }
}