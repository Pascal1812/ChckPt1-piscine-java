public class SystemLog {
    public static String systemLog(String message) {
        var res = new StringBuilder();
        res = res.append("System Log: ").append(message);
        return res.toString();
    }
}
