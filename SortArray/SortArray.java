import java.util.Arrays;

public class SortArray {
    public static Integer[] sort(Integer[] args) {
        Integer[] sortedArray = Arrays.copyOf(args, args.length);
         Arrays.sort(sortedArray);
         return sortedArray;
    }
}
