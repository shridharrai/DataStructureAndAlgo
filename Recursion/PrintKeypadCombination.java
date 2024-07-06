public class PrintKeypadCombination {
    public static void main(String[] args) {
        String str = "179";
        printKeypadCombinations(str, "");
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeypadCombinations(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        char currentChar = ques.charAt(0);
        String restOfQuestion = ques.substring(1);
        int codeIndex = currentChar - '0';
        String code = codes[codeIndex];

        for(char ch : code.toCharArray())
        printKeypadCombinations(restOfQuestion, ans + ch);
    }
}