public class NextPrime {
    public static int nextPrime(Integer n) {
        int value = n + 1 ;
        if (n <= 1){
            return 2;
        }
        while (!isPrime(value)) {
            value += 1;
        }
        return value;
    }

    private static boolean isPrime(Integer n){
        if (n < 1){
            return false;
        }
        if (n == 2 || n == 3){
            return true;
        }

        for (int i = 2; i < n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}