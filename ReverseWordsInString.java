class Solution {
     public static String reverseWords(String s) {
        String str1 = s.trim();
        var arr = str1.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
             if(arr[i].equals("")){
                continue;
            }
            if(i==0){
                builder.append(arr[i].trim());
            }else {
                builder.append(arr[i].trim() + " ");
            }
        }
        String str = builder.toString();
        return str;
    }
}