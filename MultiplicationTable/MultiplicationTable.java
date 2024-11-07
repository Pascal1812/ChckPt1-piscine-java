public class MultiplicationTable {

    public static void generate(int number) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            output.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
        }
        System.out.print(output.toString());
    }
}
