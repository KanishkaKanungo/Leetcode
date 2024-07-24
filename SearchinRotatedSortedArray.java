import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int start  = 0;
        int end = arr.size()-1;
        int peak = 0;
        if(arr.get(start)>arr.get(end)){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr.get(mid)<arr.get(mid-1) && start<mid ){
                peak = mid-1;
                break;
            }
            else if (end>mid && arr.get(mid)>arr.get(mid+1)) {
                peak = mid;
                break;
            }
            else if(arr.get(start)>=arr.get(mid)){
                end = mid-1;
            }
            else if(arr.get(start)<arr.get(mid)){
                 start = mid+1;
            }
            
        }
        if(arr.get(peak)==k){
            return peak;
        }
        int result = binarySearch(arr, k, 0,peak-1);
        if(result!=-1){
            return result;
        }
        result = binarySearch(arr, k, peak+1,arr.size()-1);
        return result;
    }
       return binarySearch(arr, k, start, end); 
    }
    public static int binarySearch(ArrayList<Integer> arr, int target,int start,int end){
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            else if(arr.get(mid)>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}