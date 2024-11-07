public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        s = s.toLowerCase();
        if (isPalindrome(s)) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String modifiedString = s.substring(0, i) + s.substring(i+1);
            if (isPalindrome(modifiedString)){
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String s) {
        if (s == null || s.contains(" ")) {
            return false;
        }
        var original = s.toCharArray();
        var inversed = new StringBuilder();
        for(int i = s.length()-1; i>= 0 ; i--){
            inversed.append(original[i]);
        }
        return inversed.toString().equals(s);
    }
}
