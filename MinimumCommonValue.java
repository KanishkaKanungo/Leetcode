class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            boolean flag = binarySearch(nums2,nums1[i]);
            if(flag){
                return nums1[i];
            }
        }
        return -1;
    }
    public boolean binarySearch(int[] nums2,int target){
        int start = 0;
        int end = nums2.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums2[mid]==target){
                return true;
            }
            else if(nums2[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}