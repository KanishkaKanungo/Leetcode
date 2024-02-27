import java.util.Arrays;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int nums[]= {3,4,5,1,2};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int x=0;int counter=0;
        for(int i=0;i<nums.length;i++){
            if(arr[0]==nums[i]){
                x = i;
                counter++;
            }
        }
        boolean flag = false;
        while(counter>0){
            flag = check2(nums,arr,x);
            if(!flag){
                x--;
            }else{
                break;
            }
            counter--;
        }
        return flag;
    }
    public static boolean check2(int[] nums,int[] arr,int x){
        boolean flag = true;
        for(int j=0;j<nums.length;j++){
            int b = nums[(j+x)%nums.length];
            if(b==arr[j]){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}
