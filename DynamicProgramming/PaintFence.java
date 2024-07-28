public class PaintFence {
    public static void main(String[] args) {
        int houses = 5;
        int colors = 3;

        long total = totalWays(houses, colors);
        System.out.println(total);
    }

    public static long totalWays(int houses, int colors) {
        long lastTwoSame = colors * 1;
        long lastTwoDiff = colors * (colors - 1);
        long total = lastTwoSame + lastTwoDiff;

        for(int i = 3; i <= houses; ++i) {
            lastTwoSame = lastTwoDiff * 1;
            lastTwoDiff = total * (colors - 1);
            total = lastTwoSame + lastTwoDiff;
        }

        return total;
    }
}