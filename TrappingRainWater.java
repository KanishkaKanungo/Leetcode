public class TrappingRainWater {
    public static void main(String[] args) {
        int[] ans = {4,2,0,3,2,5};
        System.out.println(trap(ans));
    }
    public static int trap(int[] height) {
        int sum = 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        while(right>left){
            if(rightMax>leftMax){
                left++;
                if(leftMax<height[left]){
                    leftMax = height[left];
                }
                else{
                    sum = sum + leftMax - height[left];
                }
            }
            else{
                right--;
                if(height[right]>rightMax){
                    rightMax = height[right];
                }
                else{
                    sum = sum + rightMax - height[right];
                }
            }
        }

        return sum;
    }
}
