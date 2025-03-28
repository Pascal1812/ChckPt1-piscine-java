public class CountChar {
    public static int count(String s, char c) {
        var CharTab = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (CharTab[i] == c){
                count++;
            }
        }
        return count;
    }
}