public class UnitConverter {
    public static String convert(String[] args) {
        if (args == null || args.length != 3){
            return "ERROR";
        }
        
        try {
            String fromUnit = args[0];
            String toUnit = args[1];
            Double value = Double.parseDouble(args[2]);
            Double result;
            switch (fromUnit) {
                case "fahrenheit":
                if (toUnit.equals("celsius")) {
                    result = (value - 32) * 5.0/9.0;
                    return String.format("%.2f", result);
                }
                break;
                case "celsius":
                if (toUnit.equals("fahrenheit")) {
                    result = value * 9.0/5.0 + 32;
                    return String.format("%.2f", result);
                }
                break;
                case "kilometers":
                if (toUnit.equals("miles")) {
                    result = value * 0.621371;
                    return String.format("%.2f", result);
                }
                break;
                case "miles":
                if (toUnit.equals("kilometers")) {
                    result = value * 1.60934;
                    return String.format("%.2f", result);
                }
                break;
            }
            return "ERROR";
        } catch (Exception e) {
            return "ERROR";
        }
    }
}