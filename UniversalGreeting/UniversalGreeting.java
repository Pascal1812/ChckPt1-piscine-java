public class UniversalGreeting {
    public static String greeting(String message) {
        String res;
        switch (message){
            case "FR":
                res = "Bonjour comment allez-vous?";
            break;
            case "EN":
                res = "Hello, How are you?";
            break;
            case "ES":
                res = "Hola, cómo estás?";
            break;
            default:
            res = "";
        }
        return res;
    }
}