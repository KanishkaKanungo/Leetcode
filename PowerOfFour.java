class Solution {
    public boolean isPowerOfFour(int n) {
        int base = 4;
        if(n==1){
            return true;
        }
        for(int i=1;i<=Math.sqrt(n);i++){
            if(base==n){
                return true;
            }else
            {
                base = base*4;
            }
        }
        return false;
    }
}