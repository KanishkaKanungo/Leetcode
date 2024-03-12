class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        return binarySearch(nums,threshold);
    }
    public int binarySearch(int[] nums,int threshold){
        int start = 1;
        int sum = 0;
        int end = nums[nums.length-1];
        while(end>=start){
            int mid = start + (end-start)/2;
           
            for(int i=0;i<nums.length;i++){
                sum = sum + (int)Math.ceil((double) nums[i] /mid);
            }
           
            if(threshold>=sum){
                end = mid-1;
                sum=0;
                
            }
           else {
                
                start = mid+1;
                sum = 0;
            }
          
        }
        return start;

    }
}