public class Striver_5LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"aaa","aa","aaa"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        StringBuilder builder = new StringBuilder();
        boolean flag = false;
        String str = strs[0];
        int i = 0;
        while(i<str.length()){
            char a = str.charAt(i);
            for(int j=1;j<strs.length;j++){
                String b = strs[j];
                if(i<b.length() && b.charAt(i)==a){
                    flag = true;
                    continue;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                builder.append(a);
            }
            else{
                break;
            }i++;
        }
        return builder.toString();
    }
}
