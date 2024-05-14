public class PalindromicSubstring {
    public static void main(String[] args) {
        String str = "abccbc";
        printPalindromeSubstring(str);
    }

    public static void printPalindromeSubstring(String str) {
        for(int i = 0; i < str.length(); ++i) {
            for(int j = i + 1; j <= str.length(); ++j) {
                String substring = str.substring(i, j);
                // System.out.println(substring);
                if(isPalindrome(substring)) {
                    System.out.println(substring);
                }
            }
        }
    }

    public static boolean isPalindrome(String str) {
        for(int startidx = 0, endIdx = str.length() - 1; startidx < endIdx; ++startidx, --endIdx) {
            if(str.charAt(startidx) != str.charAt(endIdx)) {
                return false;
            }
        }

        return true;
    }
}