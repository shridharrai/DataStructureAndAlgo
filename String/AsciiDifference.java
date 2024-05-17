public class AsciiDifference {
    public static void main(String[] args) {
        String str = "abdgca";

        String res = calculateDifferences(str);
        System.out.println(res);
    }

    public static String calculateDifferences(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i = 1; i < str.length(); ++i) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            int diff = curr - prev;

            sb.append(diff);
            sb.append(curr);
        }

        return sb.toString();
    }
}