class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int tempProfit = 0;

        for(int price : prices){

            if(price < minPrice)
                minPrice = price;

            tempProfit = price - minPrice;
            if(tempProfit > maxProfit)
                maxProfit = tempProfit;
        }
        return maxProfit;
    }
}