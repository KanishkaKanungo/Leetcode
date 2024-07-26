class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1 && slow!=1){
            slow = square(slow);
            if(slow==1){
                return true;
            }
            fast = square(fast);
            fast  = square(fast);
            if(slow==fast){
                return false;
            }
        }
        return true;
    }
    public int square(int n){
        int sum =0;
        while(n!=0){
            int a = n%10;
            sum = sum + a*a;
            n = n/10;
        }
        return sum;
    }
}