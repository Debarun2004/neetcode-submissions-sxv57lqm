class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minbuy=prices[0];
        for(int price:prices){
            maxprofit=Math.max(maxprofit,price-minbuy);
            minbuy=Math.min(minbuy,price);
        }
        return maxprofit;
        
    }
}
