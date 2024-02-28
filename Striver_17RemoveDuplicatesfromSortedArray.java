public class Striver_17RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int counter = 0;
        int left = 0;
        int right = left +1;
        int ans = 1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                right++;
                counter++;
            }
            else if(nums[left]!=nums[right]){
                int temp = nums[left+1];
                nums[left+1] = nums[right];
                nums[right] = temp;
                left++;
                right++;
                ans++;
            }
        }
        return ans;
    }
}
