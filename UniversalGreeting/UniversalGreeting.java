public class UniversalGreeting {
    public static String greeting(String message) {
        switch (message) {
            case "EN":
                return "Hello, How are you?";
            case "FR":
                return "Bonjour comment allez-vous?";
            case "ES":
                return "Hola, cómo estás?";
            default:
                return "";
        }
    }
}
