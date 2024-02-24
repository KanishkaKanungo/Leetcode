class Solution {
    public boolean isHappy(int n) {
        for(int i=1;i<=10;i++){
            if(n==i){
                if(n==1|| n==7 || n==10 ){
                    return true;
                }else{
                    return false;
                }
            }
        }
        int sum = check(n);
        while(sum!=1){
            if(sum==7){
                return true;
            }
           else if(sum>=10){
          sum = check(sum);
            }else{
                return false;
            }
        }
        if(sum==1 || sum==7){
            return true;
        }
        return false;
    }
    public int check(int n){
        int sum = 0;
        while(n>0){
           int a = n%10;
           sum = sum + a*a;
           n=n/10;
        }
        return sum;
    }
}