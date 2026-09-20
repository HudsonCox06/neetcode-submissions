class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int l = 0;

        for(int r = 1; r < prices.length; r++){
            if(prices[r] < prices[l]){
                l = r;
                continue;
            } else{
                maxP = Math.max(maxP, prices[r]-prices[l]);
            }
        }
        return maxP;
    }
}
