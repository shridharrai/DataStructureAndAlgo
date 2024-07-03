import java.util.ArrayList;
import java.util.Iterator;

public class GetSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> res = getSubsequences(str);
        System.out.println(res);
    }

    public static ArrayList<String> getSubsequences(String str) {
        if(str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");  // String with zero length have a empty subsequence by default
            return baseResult;
        }

        char ch = str.charAt(0);
        String restOfString = str.substring(1);
        ArrayList<String> subSequences = getSubsequences(restOfString);

        ArrayList<String> newSubsequences = new ArrayList<>();
        // Current char is not included
        for(String subSequence : subSequences) newSubsequences.add("" + subSequence);
        // Current char is included
        for(String subSequence : subSequences) newSubsequences.add(ch + subSequence);

        return newSubsequences;
    }
}