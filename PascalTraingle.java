public class PascalTriangle {
    public static void main(String[] args) {
        find(5);
        System.out.println(find2(5,2));
    }
    static void find(int n){
        int ans = 1;
        System.out.print(ans);
        for(int i=1;i<=n;i++){
            ans = ans * (n-i)/i;
            System.out.print(" "+ans);
        }
        System.out.println();
    }
    static int find2(int row, int column){
        int ans = 1;
        for(int i=1;i<=column;i++){
            ans = ans * (row-i);
            ans  = ans /(i);
        }
        return ans;
    }
}
