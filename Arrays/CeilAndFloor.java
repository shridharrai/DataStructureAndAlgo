import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter num to find");
        int num = scn.nextInt();

        printCeilAndFloor(arr, num);
    }

    public static void printCeilAndFloor(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        int ceil = Integer.MIN_VALUE;
        int floor = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(arr[mid] > num) {
                ceil = arr[mid];
                high = mid - 1;
            } else if(arr[mid] < num) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println("Ceil and Floor are " + ceil + " " + floor);
    }
}