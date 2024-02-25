public class Striver_15MaximumProductSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,3,-4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int product = nums[0];
        int a =0;
        for(int i=0;i<nums.length;i++){
            a = nums[i];
            for(int j=i+1;j<nums.length;j++){
                int b = a * nums[j];
                if(product<b && b>a){
                    product = b;
                }
                a = b;

            }
            if(nums[i]>product){
                product = nums[i];
            }
        }
        return product;
    }
}
