public class PrintPermutation {
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }

    public static void printPermutations(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.print(ans + ", ");
            return;
        }

        for(int i = 0; i < ques.length(); ++i) {
            char ch = ques.charAt(i);
            String restOfQuestion = ques.substring(0, i) + ques.substring(i + 1);
            printPermutations(restOfQuestion, ans + ch);
        }
    }
}