public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        var len = arr.length;
        if (arr == null || len == 0){
            return arr;
        }

        Integer[] res = new Integer[len];
        rotationCount = rotationCount % len;
        if (rotationCount < 0){
            rotationCount += len ;
        }

        for (int i = 0; i < len; i++){
            var pos = (i - rotationCount + len) % len;
            res[i] = arr[pos];
        }
        return res;
    }
}