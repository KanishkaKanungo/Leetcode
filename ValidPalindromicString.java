class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
                continue;
            } if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }
            if(Character.toString(s.charAt(start)).equalsIgnoreCase(Character.toString(s.charAt(end)))){
                start++; end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}