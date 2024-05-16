class ToggleCaseString {
    public static void main(String[] args) {
        String str = "shriDHAr";

        String res = toggleCase(str);

        System.out.println(res);
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < sb.length(); ++i) {
            char ch = sb.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                char upperCaseChar = (char)('A' + (ch - 'a'));
                sb.setCharAt(i, upperCaseChar);
            } else if(ch >= 'A' && ch <= 'Z') {
                char lowerCaseChar = (char)('a' + (ch - 'A'));
                sb.setCharAt(i, lowerCaseChar);
            }
        }

        return sb.toString();
    }
}