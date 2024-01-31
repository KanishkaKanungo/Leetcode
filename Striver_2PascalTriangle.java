import java.util.ArrayList;
import java.util.List;

public class Striver_2PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));


    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0;i<=numRows;i++){
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            for(int j=1;j<=i;j++){
                if(j==i){
                    list1.add(1);
                }
                else{
                    var a = list.get(i-1);
                    list1.add(a.get(j) + a.get(j-1));
                }
            }
            list.add(list1);

        }
        return list;
    }
}
