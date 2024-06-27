public class MaximumOfArray {
    public static void main(String[] args) {
        int[] arr = {22, 33, 4, 19, 7};

        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int index) {
        if(index == arr.length - 1) return arr[index];

        int max = maxOfArray(arr, index + 1);

        if(max < arr[index]) return arr[index];
        else return max;
    }
}