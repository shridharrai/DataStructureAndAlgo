class PermutationsOfString {
    public static void main(String[] args) {
        String str = "abb";

        int factorial = getFactorial(str.length());

        printPermutations(str, factorial);
    }

    public static int getFactorial(int num) {
        int res = 1;
        while(num > 0) {
            res = res * num;
            --num;
        }

        return res;
    }

    public static void printPermutations(String str, int factorial) {
        int length = str.length();
        int num = 0;

        while(num < factorial) {
            StringBuilder sb = new StringBuilder(str);
            String res = "";

            int divisor = length;
            int dividend = num;
            while(divisor > 0) {
                int rem = dividend % divisor;
                dividend = dividend / divisor;

                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);

                --divisor;
            }

            System.out.println();

            ++num;
        }
    }
}