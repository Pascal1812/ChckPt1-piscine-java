public class Digitlen {
    public static int digitlen(long number) {
       number = Math.abs(number);
       return String.valueOf(number).length();
    }
}