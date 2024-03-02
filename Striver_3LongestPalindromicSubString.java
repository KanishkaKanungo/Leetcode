public class Striver3_LongestPalindromicSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("eabcb"));
    }

        public static String longestPalindrome(String s) {
            StringBuilder builder = new StringBuilder();
            int start = 0;
            int end = s.length()-1;
            boolean flag = false;
            int i=0;
            while(flag == false && i<=end){
                char start1 = s.charAt(i);
                for(int k=end;k>0;k--){
                    char end1 = s.charAt(k);
                    if(s.charAt(i)==s.charAt(k)){
                        for(int j=i;j<=k;j++){
                            builder.append((Character.toString(s.charAt(j))));
                        }
                        flag = true;
                        break;
                    }
                }
                i++;
            }
            String str = builder.toString();
            return str;
        }

}
