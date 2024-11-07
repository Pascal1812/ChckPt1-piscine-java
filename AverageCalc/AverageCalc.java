public class AverageCalc {
    public static int average(int start, int end, int step) {
        if (step == 0 ){
            return 0;
        }
        var count = Math.abs((end - start)/step) + 1;
        var sum = 0;
        var current = start;
        while (current >= Math.min(start, end) && current <= Math.max(start, end)) {
            sum += current;
            current += step;
        }
        return sum/count;
    }
}

