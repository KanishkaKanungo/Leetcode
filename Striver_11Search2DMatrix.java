class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            boolean flag = search(matrix[i],target);
            if(flag){
                return true;
            }
        }
        return false;
        
    }
    public boolean search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        while(end>=start){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}