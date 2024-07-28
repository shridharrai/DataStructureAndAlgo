public class CountSubsequenceOfFormABC {
    public static void main(String[] args) {
        String str = "abcabc";
        int res = countSubsequence(str);
        System.out.println(res);
    }

    public static int countSubsequence(String str) {
        int a = 0;
        int ab = 0;
        int abc = 0;

        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);

            if(ch == 'a') {
                a = 2 * a + 1;
            } else if(ch == 'b') {
                ab = 2 * ab + a;
            } else {
                abc = 2 * abc + ab;
            }
        }

        return abc;
    }
}