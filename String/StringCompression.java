public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccddaeeff";
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

    public static String compression1(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i = 1; i < str.length(); ++i) {
            char currChar = str.charAt(i);
            char prevChar = str.charAt(i - 1);
            if(currChar != prevChar) {
                sb.append(currChar);
            }
        }

        return sb.toString();
    }

    public static String compression2(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int count = 1;

        for(int i = 1; i < str.length(); ++i) {
            char currChar = str.charAt(i);
            char prevChar = str.charAt(i - 1);

            if(currChar == prevChar) {
                count++;
            } else {
                if(count > 1) {
                sb.append(count);
                }

                sb.append(currChar);
                count = 1;
            }
        }

        if(count > 1) sb.append(count);

        return sb.toString();
    }
}