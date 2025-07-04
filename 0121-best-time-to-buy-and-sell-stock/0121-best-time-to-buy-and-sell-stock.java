class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update minPrice if current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if we sell today
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
        
    }
}