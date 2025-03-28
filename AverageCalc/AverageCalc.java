public class AverageCalc {
    public static int average(int start, int end, int step) {
       if (step == 0){
        return 0;
       }
       var count = Math.abs((end - start)/step + 1);
       var sum = 0;

       for (int i = start; i >= Math.min(start, end) && i <= Math.max(start, end); i += step){
            sum += i;
       }
       return sum/count;
    }
}
