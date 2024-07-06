public class PrintEncodings {
    public static void main(String[] args) {
        String str = "123";
        printEncodings(str, "");
    }

    public static void printEncodings(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.print(ans + ", ");
            return;
        }

        char ch = ques.charAt(0);
        if(ch == '0') return;

        // Call for 1 length string
        int charVal = ch - '0';
        char code = (char)('a' + charVal - 1);
        String roq = ques.substring(1);
        printEncodings(roq, ans + code);

        // Call for 2 length string
        if(ques.length() >= 2) {
         String char12 = ques.substring(0, 2);
         int char12Val = Integer.parseInt(char12);
         if(char12Val <= 26) {
            String roq12 = ques.substring(2);
            char code12 = (char)('a' + char12Val - 1);
            printEncodings(roq12, ans + code12);
          }
        }
    }
}