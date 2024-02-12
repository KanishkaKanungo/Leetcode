class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list  = new ArrayList<>();
        int counter = 1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    counter++;
                }
            }
            if(counter>nums.length/3 && !list.contains(nums[i])){
                list.add(nums[i]);
            }
            counter=1;
        }
        return list;
    }
}