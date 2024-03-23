class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int target = 0-nums[i];
            int start = i+1;
            int end = nums.length-1;
            while(end>start){
                if(target==nums[start]+nums[end]){
                    s.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    end--;
                }
                else if(target>nums[start]+nums[end]){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        arr.addAll(s);
        return arr;
    }
}