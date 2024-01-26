import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5};
        System.out.println(containsDuplicate(arr));

    }
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
            for(int i=1;i<nums.length;i++){
                if(nums[i-1]==nums[i]){
                    return true;
                }
            }
            return false;
        }
}