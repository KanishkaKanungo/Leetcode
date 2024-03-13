class Solution {
    public int pivotInteger(int n) {
        return search(n);
    }
    public int search(int n){
        int start = 1;
        int end = n;
        while(end>=start){
            int mid = start + (end-start)/2;
            int sum1=0;
            int sum2 = 0;
            for(int i=1;i<=mid;i++){
                sum1 = sum1 + i;
            }
            for(int i=mid;i<=n;i++){
                sum2 = sum2 + i;
            }
            if(sum1==sum2){
                return mid;
            }
            if(sum1<sum2){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}