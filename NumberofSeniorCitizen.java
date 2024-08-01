class Solution {
    public int countSeniors(String[] details) {
        int sum = 0;
        for(int i=0;i<details.length;i++){
            String a = details[i];
            int age = Integer.parseInt(a.substring(11,13));
            if(age>60){
                sum++;
            }
        }
        return sum;
    }
}