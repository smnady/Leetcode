package LeetCode.Easy.BestTimeToBuyAndSellStock;

public class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int current_fall = Integer.MAX_VALUE;
        int diff = 0;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            if (prices[i] < current_fall) {
                current_fall = prices[i];
            }
            diff = prices[i] - current_fall;
            if (diff > profit) {
                profit = diff;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
