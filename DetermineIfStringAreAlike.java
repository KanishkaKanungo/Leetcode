class Solution {
    public boolean halvesAreAlike(String s) {
        int counter = 0,counter1=0;
       for(int i=0;i<s.length()/2;i++){
           if(check(s.charAt(i))){
               counter++;
           } 
       } 
       for(int j=s.length()/2;j<s.length();j++){
           if(check(s.charAt(j))){
               counter1++;
           }
       }
       if(counter==counter1){
           return true;
       }
       
       return false;
    }
    public boolean check(char  ch){
        boolean flag = false;
        if(ch=='a'|| ch=='A'){
            flag = true;
        }
        else if(ch=='e' || ch=='E'){
            flag = true;
        }
        else if(ch=='i' || ch=='I'){
            flag = true;
        }
        else if(ch=='o' || ch=='O'){
            flag = true;
        }
        else if(ch=='u' ||ch=='U'){
            flag = true;
        }
        return flag;
    }
}