class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = 1;
        int maxSell = 0;

        while(sell < prices.length-1){

            if(prices[sell] < prices[buy]){
                buy = sell;
            }
            sell++;

            int price = prices[sell] - prices[buy];
            maxSell = Math.max(price, maxSell);
        }

        return maxSell;
    }
}
