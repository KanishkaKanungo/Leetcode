class Solution {
    public void moveZeroes(int[] nums) {
       int[] arr = new int[nums.length];
       int counter = 0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            counter++;
        }
       }
       int k = 0;
       for(int j=0;j<nums.length;j++){
        if(nums[j]!=0){
            arr[k] = nums[j];k++;
        }
        
       }
       for(int l=0;l<nums.length;l++){
        nums[l] = arr[l];
       }
    }
}