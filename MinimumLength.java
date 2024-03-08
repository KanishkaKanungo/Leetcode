class Solution {
    public int minimumLength(String s) {
     int end = s.length()-1;
     int start = 0;
     boolean incremented = false;;
         if(s.charAt(start)==s.charAt(end)){
        while(start<end){
                while( start<=end && s.charAt(end)==s.charAt(start) ){
                    start++;
                    incremented = true;
                }
                incremented = false;
                
                while(s.charAt(start-1)==s.charAt(end) && start<=end){
                    end--;
                    incremented = true;
                }
                if(!incremented){
                    return end-start+1;

                }
            }
            if(end==start){
                return 1;
            }
            return end-start;

        }
        return s.length();

       
    }
}