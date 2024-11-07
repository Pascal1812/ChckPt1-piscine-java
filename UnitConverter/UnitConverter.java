import java.util.Locale;

public class UnitConverter {
    public static String convert(String[] args) {
        if (args.length != 3) {
            return "ERROR";
        }
        
        String arg1 = args[0];
        String arg2 = args[1];

        double value;
        try {
            value = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            return "ERROR";
        }

        if (arg1.equals("celsius") && arg2.equals("fahrenheit")) {
            return String.format(Locale.US, "%.2f", CelsiusToFa(value));
        } else if (arg1.equals("fahrenheit") && arg2.equals("celsius")) {
            return String.format(Locale.US, "%.2f", FaToCelsius(value));
        } else if (arg1.equals("kilometers") && arg2.equals("miles")) {
            return String.format(Locale.US, "%.2f", KmToMl(value));
        } else if (arg1.equals("miles") && arg2.equals("kilometers")) {
            return String.format(Locale.US, "%.2f", MlToKm(value));
        } else {
            return "ERROR";
        }
    }

    // Helper functions
    private static double CelsiusToFa(double celsius) {
        return celsius * 9.0 / 5 + 32;
    }

    private static double FaToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9;
    }

    private static double KmToMl(double km) {
        return km * 0.621371;
    }

    private static double MlToKm(double ml) {
        return ml * 1.60934;
    }
}
