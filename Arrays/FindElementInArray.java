import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) {
            arr[i]= scn.nextInt();
        }
        int element = scn.nextInt();

        int index = findElement(arr, element);
        System.out.println(index);
    }

    public static int findElement(int[] arr, int element) {
        int index = -1;
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] == element) {
                index = i;
                break;
            }
        }

        return index;
    }
}