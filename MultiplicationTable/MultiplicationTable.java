public class MultiplicationTable {
    public static void generate(int num) {
        var res = new StringBuilder();
        for (int i = 1; i <= 10; i++){
            res.append(num + " x " + i + " = " + num*i + "\n");
        }
        System.out.print(res);
    }
}