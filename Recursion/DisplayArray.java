public class DisplayArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        printArr(arr, 0);
    }

    public static void printArr(int[] arr, int idx) {
        if(idx == arr.length) return;
        
        System.out.println(arr[idx]);
        printArr(arr, idx + 1);
    }
}