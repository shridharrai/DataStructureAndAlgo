public class CountBinaryStrings {
    public static void main(String[] args) {
        int n = 6;
        int count = countStrings(n);
        System.out.println(count);
    }

    public static int countStrings(int n) {
        int oldZeroStrings = 1;
        int oldOneStrings = 1;

        for(int i = 2; i <= n; ++i) {
            int newZeroStrings = oldOneStrings;
            int newOneStrings = oldOneStrings + oldZeroStrings;

            oldZeroStrings = newZeroStrings;
            oldOneStrings = newOneStrings;
        }

        return oldZeroStrings + oldOneStrings;
    }
}