// class Solution {
//     public int maxProfit(int[] prices) {
//         int minProfit= 0;
//         int maxProfit= 0;

//         for (int i = prices.length; i > prices.length ; i--){
//             int a = prices[i];
//             if(maxProfit == 0){
//                 maxProfit = prices[i];
//             }
//             else{
//                 if(max)
//             }

//         }
//     }
// }

// public class bestTimeToBuyAndSellStock {
//     public static main
// }

import java.util.Arrays;
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        // int minPrice = Arrays.stream(prices).max().getAsInt();

        for (int i = 0; i < prices.length ; i++){
            minPrice = Math.min(minPrice, prices[i]);
            int Profit = prices[i]-minPrice;
            maxProfit = Math.max(Profit, maxProfit);
        } 
        return maxProfit;
    }
}