class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int b = 0;
        if(k<=nums.length){
            b = nums.length-k;
        }else{
           b = Math.abs(nums.length-k);
           b = nums.length - b;
           if(b<0){
            b = nums.length - Math.abs(b);
           }
        }
        for(int i= b;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<b;i++){
            list.add(nums[i]);
        }
        for(int j=0;j<nums.length;j++){
            nums[j] = list.get(j);
        }
        
    }
}