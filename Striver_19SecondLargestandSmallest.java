import java.util.Arrays;

public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        Arrays.sort(a);
        int[] arr = new int[2];
        int start = 1;
        boolean flag1= false;
         boolean flag2= false;
        int end = a.length-2;
        while(end>start){
            if(a[end]!=a[a.length-1]){
                arr[0] = a[end];
                flag1 = true;
            }
            if(a[start]!=a[0]){
                arr[1] = a[start];
                flag2 = true;
            }
            if(!flag1){
                end--;
            }
            if(!flag2){
                start++;
            }
            if(flag1==true && flag2==true){
                return arr;
            }
        }
        return arr;

    }
}