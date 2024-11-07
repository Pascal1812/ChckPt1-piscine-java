public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        int len = arr.length;
        Integer[] res = new Integer[len];
        for (int i = 0; i < len; i++) {
            res[i] = arr[len - 1 - i];
        }
        return res;
    }
}
