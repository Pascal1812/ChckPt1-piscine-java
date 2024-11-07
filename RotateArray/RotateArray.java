public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        int len = arr.length;
        if (len == 0 || rotationCount % len == 0) {
            return arr;
        }
        rotationCount = rotationCount % len;
        if (rotationCount < 0) {
            rotationCount += len;
        }
        Integer[] rotated = new Integer[len];
        System.arraycopy(arr, len - rotationCount, rotated, 0, rotationCount);
        System.arraycopy(arr, 0, rotated, rotationCount, len - rotationCount);
        return rotated;
    }
}
