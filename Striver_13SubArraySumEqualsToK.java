public class SubArraySumEqualsToK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(subarraySum(nums,2));
    }

    public static int subarraySum(int[] nums, int k) {
        int counter =0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum==k){
                    counter++;
                }

            }
        }
        return counter;
    }}
