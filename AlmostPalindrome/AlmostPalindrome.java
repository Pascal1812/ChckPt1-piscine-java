public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        s = s.toLowerCase();
        if (isPalindrome(s)){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            String sub = s.substring(0, i) + s.substring(i+1);
            if (isPalindrome(sub)){
                return true;
            }
        }
        return false;
    }

    // define the isPalindrome function
    private static boolean isPalindrome(String s){
        if (s == null || s.contains(" ")){
            return false;
        }
        var original = s.toCharArray();
        var inverted = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--){
            inverted.append(original[i]);
        }
        return inverted.toString().equals(s);
    }
}