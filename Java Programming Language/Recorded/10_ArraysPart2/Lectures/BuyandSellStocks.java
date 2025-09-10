public class BuyandSellStocks {
    public static void main(String[] args) {
        int[] prices = {7 , 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));

    }

    static int buyAndSellStocks(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){ 
                int currProfit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    
}
