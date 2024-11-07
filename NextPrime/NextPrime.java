public class NextPrime {
    public static int nextPrime(Integer n) {
        var next = n + 1;
        var res = isPrime(next);
        while (!res) {
            next++;
            res = isPrime(next);
        }
        return next;
    }

    private static boolean isPrime(Integer n){
        if (n <= 1) {
            return false; 
        }
        if (n <= 3) {
            return true; 
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; 
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false; 
            }
        }
        return true;
    }
}
