public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 6;
        // int numberOfPaths = countPathsRecursive(n);
        // int numberOfPaths = countPathsMemoized(n, new int[n + 1]);
        int numberOfPaths = countPathsTabulation(n);
        System.out.println(numberOfPaths);
    }

    public static int countPathsRecursive(int n) {
        if(n < 0) return 0;
        if(n == 0) return 1;

        int nminus1 = countPathsRecursive(n - 1);
        int nminus2 = countPathsRecursive(n - 2);
        int nminus3 = countPathsRecursive(n - 3);

        int totalPaths = nminus1 + nminus2 + nminus3;
        return totalPaths;
    }

    public static int countPathsMemoized(int n, int[] result) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        if(result[n] > 0) return result[n];

        int nminus1 = countPathsMemoized(n - 1, result);
        int nminus2 = countPathsMemoized(n - 2, result);
        int nminus3 = countPathsMemoized(n - 3, result);

        int totalPaths = nminus1 + nminus2 + nminus3;
        result[n] = totalPaths;
        return totalPaths;
    }

    public static int countPathsTabulation(int n) {
        int[] results = new int[n + 1];

        results[0] = 1;
        for(int i = 1; i < results.length; ++i) {
            if(i == 1) {
                results[i] = results[i - 1];
            } else if(i == 2) {
                results[i] = results[i - 1] + results[i - 2];
            } else {
                results[i] = results[i - 1] + results[i - 2] + results[i - 3];
            }
        }

        return results[n];
    }
}