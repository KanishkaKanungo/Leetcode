import java.util.Arrays;

class Solution {
    public static void main(String[] args){
int[] arr = {1,3,4,8,7,9,3,5,1};
System.out.println(Arrays.deepToString(divideArray(arr,2)));

}
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=0;
        int[][] arr = new int[nums.length/3][3];
        while(i<nums.length){
            if(i+2< nums.length){
            int start = i;
            int mid = i+1;
            int end = i+2;
            boolean flag =check(nums[start],nums[mid],nums[end],k);
            if(flag){
                if(j<arr.length){
                   arr[j][0] = nums[i];
                    arr[j][1] = nums[i+1];
                    arr[j][2] = nums[i+2];
                j++;
                }
            }
            else{
                int [][] arr1 = {};
                return arr1;
            }
            }
            i = i +3 ;
        }
        return arr;
    }
    public static boolean check(int start,int mid,int end,int k){
        if(Math.abs(start - mid) <=k && Math.abs(start-end)<=k && Math.abs(mid-end)<=k ){
            return true;
        }
        return false;
    }
}