Optimal Solution - 
class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length+1))/2;
        int sum1 = 0;
        for(int i=0;i<nums.length;i++){
            sum1 = sum1 + nums[i];
        }
        return sum-sum1;
    }
}

Better Solution- 
class Solution {
    public int missingNumber(int[] nums) {
        int[] hash = new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            hash[nums[i]] = nums[i];
        }
        for(int j=0;j<hash.length;j++){
            if(hash[j]!=j){
                return j;
            }
        }
        return 0;
    }
}