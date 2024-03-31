class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int s = x;
        while(x>0){
            int a  = x%10;
            sum = sum + a;
            x = x/10;
        }
        if(s%sum==0){
         return sum;
        }
        return -1;
    }
}