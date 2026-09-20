class Solution {
    public int maxProfit(int[] prices) {
        // sliding window
        int maxP = 0;
        int currP = 0;
        int minBuy = Integer.MAX_VALUE;
        int l = 0;
        int r = 1;

        for(int i = 1; i<prices.length; i++){
            r = i;
            // if current i is greater than r, replace r with i
            // l should be lowest sell before i
            if(prices[r] > prices[l]){
                currP = prices[r]-prices[l];
                maxP = Math.max(maxP, currP);
            } else {
                l = r;
            }

            
        }

        return maxP;
    }
}
