public class PowerLogarithmic {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int res = power(x, n);
        System.out.println(res);
    }

    public static int power(int x, int n) {
        if(n == 0) return 1;

        int xpnb2 = power(x, n / 2);
        int xn = xpnb2 * xpnb2;

        if(n % 2 != 0) xn = xn * x;

        return xn;
    }
}