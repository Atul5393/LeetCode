class Solution {
    public int maxProfit(int[] prices) {
        int maxP =0;
        int lowP =prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>lowP){
                maxP = Math.max(maxP,prices[i]-lowP);
            }
            lowP = Math.min(lowP,prices[i]);
        }
        return maxP;
    }
}