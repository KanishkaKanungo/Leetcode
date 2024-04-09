class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        while(tickets[k]!=1){
        for(int i=0;i<tickets.length;i++){
           
            if(tickets[i]>0){
                tickets[i] = tickets[i]-1;
                time++;
            }
           
        }
        
        }
        for(int i=0;i<=k;i++){
            if(tickets[i]>0){
                tickets[i]-=1;
                time++;
            }
        }
        return time;
    }
}