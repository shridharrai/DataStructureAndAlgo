public class PrintSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str, "");
    }

    public static void printSubsequence(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String restOfQuestion = ques.substring(1);

        printSubsequence(restOfQuestion, ans + ch);
        printSubsequence(restOfQuestion, ans + "");
    }
}