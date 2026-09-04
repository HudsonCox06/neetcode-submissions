class Solution {
    public int maxProfit(int[] prices) {
        // greatest difference
        int greatestDiff = 0;
        int buy;
        int sell;
        for(int i = 0; i < prices.length; i++){
            buy = prices[i];
            for(int j = i+1; j<prices.length; j++){
                sell = prices[j];
                if(sell-buy > greatestDiff){
                    greatestDiff = sell-buy;
                }
            }
        }
        return greatestDiff;
    }
}
