public class PalindromicSubString {
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }
    public static int countSubstrings(String s) {
        int counter = s.length();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String a = s.substring(i,j+1);
                int l =0;
                boolean flag = false;
                for(int k=a.length()-1;k>=0;k--){
                    if(a.charAt(k)==a.charAt(l)){
                        flag = true;
                        l++;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    counter++;
                }
            }
        }
        return counter;
    }
}
