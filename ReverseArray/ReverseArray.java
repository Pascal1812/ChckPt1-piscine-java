public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        var len = arr.length;
        Integer[] res = new Integer[len];
        for (int i = len -1; i >= 0; i--){
            res[i] = arr[len - 1 -i];
        }
        return res;
    }
}