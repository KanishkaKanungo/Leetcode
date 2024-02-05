public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));

    }
    public static int firstUniqChar(String s) {
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==j){
                    continue;
                }
                if(s.charAt(i)!=s.charAt(j) ){
                    flag = true;
                }
                else{
                    flag = false;    
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}

