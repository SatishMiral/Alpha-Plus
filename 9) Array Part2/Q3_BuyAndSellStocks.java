public class Q3_BuyAndSellStocks {
    public static int BuyAndSellStocks(int prices[]){
        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=1;i<prices.length;i++){
            if(buyStock < prices[i]){
                int profit = prices[i] - buyStock;
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                buyStock = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(BuyAndSellStocks(prices));
    }
}

