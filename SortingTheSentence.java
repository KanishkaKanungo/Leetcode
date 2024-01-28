public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));

    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] arr1 = new String[arr.length];
        for(int i=1;i<=arr.length;i++){
            String a = Character.toString(arr[i-1].charAt(arr[i-1].length()-1));
            for(int j=1;j<=arr.length;j++){
                if(j == Integer.parseInt(a)){
                    arr1[j-1] = arr[i-1];
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int k=0;k<arr1.length;k++){
            if(k==arr1.length-1){
                builder.append(arr1[k].substring(0,arr1[k].length()-1));
            }else{
                builder.append(arr1[k].substring(0,arr1[k].length()-1)+" ");
            }
        }
        return builder.toString();
    }
}
