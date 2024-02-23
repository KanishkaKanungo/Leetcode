class Solution {
   public int romanToInt(String s) {
       int a = check(s.charAt(s.length()-1));
        int sum = a;
       for(int i=s.length()-2;i>=0;i--){
            int b = check(s.charAt(i));
           if(a<=b){
               sum = sum + b;
           }else if(a>b){
               sum = sum - b;
           }
           a = b;
       }
       return sum;
        
    }
    public int check(char s){
        if(s=='I'){
            return 1;
        }else if(s=='V'){
            return 5;
        }else if(s=='X'){
            return 10;
        }else if(s=='L'){
            return 50;
        }else if(s=='C'){
            return 100;
        }else if(s=='D'){
            return 500;
        }else if(s=='M'){
            return 1000;
        }
        return -1;
    }
}