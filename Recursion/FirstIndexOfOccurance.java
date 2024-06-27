public class FirstIndexOfOccurance {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 6, 2, 4};
        int ele = 2;

        int index = firstIndex(arr, 0, ele);
        System.out.println(index);
    }

    public static int firstIndex(int[] arr, int idx, int ele) {
        if(idx == arr.length) return -1;
        
        if(arr[idx] == ele) return idx;
        else return firstIndex(arr, idx + 1, ele);
    }
}