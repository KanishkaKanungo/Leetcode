class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int t = 0,a = 0;
        while(t<target.length){
            if(target[t]==arr[a]){
                t++; a++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}