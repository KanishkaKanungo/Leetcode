import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[]  nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            list.add(count);
            if(nums[i]!=nums[i-1]+1){

                count=1;
            }
        }
        int min = list.get(0);
        for(int j=1;j<list.size();j++){
            if(list.get(j)>min){
                min = list.get(j);
            }
        }
        return min;
    }
}
