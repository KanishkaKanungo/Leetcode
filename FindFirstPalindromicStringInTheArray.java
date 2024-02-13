class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(palindrome(words[i])){
                return words[i];
            }
        }
        return "";
        
    }
    public boolean palindrome(String a){
        int right = a.length() - 1;
        boolean flag = false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==a.charAt(right)){
                right--;
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}