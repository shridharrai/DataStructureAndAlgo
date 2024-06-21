public class FactorialRecursive {
    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int num) {
        if(num == 1) return 1;

        return num * factorial(num - 1);
    }
}