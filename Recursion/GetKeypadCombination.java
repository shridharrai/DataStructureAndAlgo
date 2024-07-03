import java.util.ArrayList;

public class GetKeypadCombination {
    public static void main(String[] args) {
        String str = "678";
        ArrayList<String> words = getKeypadCombinations(str);
        System.out.println(words);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKeypadCombinations(String str) {
        if(str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char currentChar = str.charAt(0);
        String restOfString = str.substring(1);
        ArrayList<String> words = getKeypadCombinations(restOfString);

        ArrayList<String> combinations = new ArrayList<>();
        int codeIndex = currentChar - '0';
        String code = codes[codeIndex];
        for(char ch : code.toCharArray()) {
            for(String word : words) {
                combinations.add(ch + word);
            }
        }
        return combinations;
    }
}