public class MaxSumNonAdjacentElements {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 100, 5, 6};
        int max = maxSum(arr);
        System.out.println(max);
    }

    public static int maxSum(int[] arr) {
        int oldIncSum = arr[0];
        int oldExcSum = 0;

        for(int i = 1; i < arr.length; ++i) {
            int newIncSum = oldExcSum + arr[i];
            int newExcSum = Math.max(oldIncSum, oldExcSum);

            oldIncSum = newIncSum;
            oldExcSum = newExcSum;
        }

        return Math.max(oldIncSum, oldExcSum);
    }
}