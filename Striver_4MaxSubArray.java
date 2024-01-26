public class Striver_4MaxSubArray {
    public static void main(String[] args) {
        int [] arr = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = -10000;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];

            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
