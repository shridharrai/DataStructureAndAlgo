public class TargetSumSubset {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 70;
        printTargetSubset(arr, target, 0, "", 0);
    }

    public static void printTargetSubset(int[] arr, int target, int index, String subset, int sumTillNow) {
        if(index == arr.length) {
            if(sumTillNow == target) {
                System.out.println(subset);
            }

            return;
        }

        // Include the curr ele in subset
        printTargetSubset(arr, target, index + 1, subset + arr[index] + ", ", sumTillNow + arr[index]);

        // Don't include the curr ele in subset
        printTargetSubset(arr, target, index + 1, subset, sumTillNow);
    }
}