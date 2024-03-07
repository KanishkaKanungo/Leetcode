public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
    public static String swap(String s){
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length){
                var temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return new String(arr);
    }
    public static boolean rotateString(String s, String goal) {
        for(int i=0;i<goal.length();i++){
            var a = swap(s);
            if(a.equals(goal)){
                return true;
            }else{
                s = a;
            }

        }
        return false;
    }
}
