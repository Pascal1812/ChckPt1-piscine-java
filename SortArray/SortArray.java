public class SortArray {
    public static Integer[] sort(Integer[] args) {
        var len = args.length;
        
        if (args == null || len == 0){
            return args;
        }

        Integer[] res = args.clone();

        for(int i = 0; i < len-1; i++){
            for(int j = 0; j < len-1-i; j++){
                if(res[j] > res[j+1]){
                    Integer temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
            }
        }
        return res;
    }
}