public class CountChar {
    public static int count(String s, char c) {
        var charArray = s.toCharArray();
        var count = 0;
        for (char d : charArray) {
            if (d == c) {
                count++;
            }
        }
        return count;
    }
}
