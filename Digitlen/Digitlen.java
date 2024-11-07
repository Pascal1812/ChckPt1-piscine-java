public class Digitlen {
    public static int digitlen(long number) {
        String numStr = String.valueOf(Math.abs(number));
        return numStr.length();
    }
}
