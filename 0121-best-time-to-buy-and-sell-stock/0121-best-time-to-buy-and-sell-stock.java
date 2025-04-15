class Solution {
    public int maxProfit(int[] prices) {
        int a=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-a;
            profit=Math.max(profit,cost);
            a=Math.min(a,prices[i]);

        }
        return profit;

        
    }
}