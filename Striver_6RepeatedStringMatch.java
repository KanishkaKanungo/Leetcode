public class Striver_6RepeatedStringMatch {
    public static void main(String[] args) {
        int ans = repeatedStringMatch("bb","bbbbbbb");
        System.out.println(ans);

    }
    public static int repeatedStringMatch(String a, String b) {
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        int size = b.length();

        int counter= 1;

        while(builder.toString().length()<size){
            builder.append(a);
            counter++;
        }
        if(builder.indexOf(b)!=-1){
            return counter;
        }
        if(builder.indexOf(b)==-1){
            builder.append(a);
            counter++;
        }
        if(builder.indexOf(b)!=-1){
            return counter;
        }
        return -1;
    }

}
