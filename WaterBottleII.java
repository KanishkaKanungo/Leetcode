class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        int bottle = 0;
        int ans2 = numBottles;
        
        while(ans-numExchange>=0){
        
            ans = ans - numExchange;
            bottle++;
            ans2++;
            numExchange++;

        }
        if(ans!=0 && ans-numExchange<0 ){
            ans = ans + bottle;
             while(ans-numExchange>=0){
      
            ans = ans - numExchange;
            bottle++;
            ans2++;
            numExchange++;

        }
        }
        
        return ans2;
    }
}