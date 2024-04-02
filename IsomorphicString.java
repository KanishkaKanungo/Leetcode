class Solution {
    public boolean isIsomorphic(String s, String t) {
       char[] char1 = new char[128];
       char[] char2 = new char[128];
       for(int i=0;i<s.length();i++){
        if(char1[s.charAt(i)]==0 && char2[t.charAt(i)]==0){
            char1[s.charAt(i)]=t.charAt(i);
            char2[t.charAt(i)]=s.charAt(i);
        }else{
            if(char1[s.charAt(i)]!=t.charAt(i) ||char2[t.charAt(i)]!=s.charAt(i) ){
                return false;
            }
        }
       }
       return true; 
    }
}