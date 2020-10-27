package Best_Time_to_Buy_and_Sell_stock;

public class Solution {
    public int maxProfit(int []prices){
        int profit=0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j <=i; j++) {
                if(prices[i]-prices[j]>profit)
                    profit=prices[i]-prices[j];
            }
        }
        return profit;
    }
}
