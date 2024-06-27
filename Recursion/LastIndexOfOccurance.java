public class LastIndexOfOccurance {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 3, 6, 4};
        int ele = 3;

        int index = lastIndex(arr, 0, ele);
        System.out.println(index);
    }

    public static int lastIndex(int[] arr, int index, int ele) {
        if(index == arr.length) return -1;

        int lastIdx = lastIndex(arr, index + 1, ele);

        if(lastIdx == -1 && arr[index] == ele) return index;
        else return lastIdx;
    }
}