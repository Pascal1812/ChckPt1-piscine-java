public class Factorial {
    public static Integer factorial(Integer n) {
        var res = 1;
        if (n ==0 || n == 1){
            return 1;
        }
        for(int i = n; i > 1; i--){
            res *= i;
        }
        return res;
    }
}
