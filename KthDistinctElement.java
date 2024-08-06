import java.util.*;

public class KthDistinctStringElement {
    public static void main(String[] args) {
        String[] arr = {"a","b","a"};
        System.out.println(kthDistinct(arr,2));
    }
    public static String kthDistinct(String[] arr, int k) {

        List <String> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(i!=j) {
                    if (Objects.equals(arr[i], arr[j])) {
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag){
                list.add(arr[i]);
            }
        }
        if(list.size()<k){
            return "";
        }
        return list.get(k-1);
    }
}
