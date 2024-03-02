public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int a=findMaxConsecutiveOnes(nums);
        System.out.println(a);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                counter = counter + 1;
            }
            else{
                if(counter>=sum){
                    sum = counter;
                }
                counter = 0;
            }
        }
        return sum;
    }
}
