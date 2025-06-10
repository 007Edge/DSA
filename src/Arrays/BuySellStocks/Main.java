package Arrays.BuySellStocks;

public class Main {
    public static void main(String[] args) {
        int[] stock = {7, 1, 5, 3, 6, 4};
        int max = profit(stock);
        System.out.println(max);
    }

    public static int profit(int[] stock) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i: stock) {
            if (buyPrice < i) {
                int profit = i-buyPrice;
                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }
            else {
                buyPrice = i;
            }
        }
        return maxProfit;
    }
}
// best time to buy and sell a stock