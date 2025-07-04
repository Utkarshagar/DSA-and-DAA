class Solution {
    public int maxProfit(int[] prices) {
        int p=Integer.MAX_VALUE;
        int b=0;
        for(int price:prices){
            if(price<p){
                p=price;
            }
            else{
                b=Math.max(b,price-p);
            }
        }
        return b;
    }
}