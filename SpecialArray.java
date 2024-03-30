class Solution {
    public int specialArray(int[] nums) {
        int x = -1;
         for(int i=1;i<=nums.length;i++){
            boolean flag = false;
            int counter = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=0){
                if(i<=nums[j]){
                    flag = true;
                    counter++;
                }
                
                }
            }
            if(flag==true && counter==i){
                x = i;
            }
         }
         return x;
    }
}