// Solved LeetCode 122 - Best Time to Buy and Sell Stock II using Greedy Approach in Java.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {

        // l = length of the array
        // mp = total maximum profit
        // min = minimum buying price seen so far
        // tp = profit from the current transaction
        int l = prices.length, mp = 0, min = Integer.MAX_VALUE, tp = 0;

        // Traverse through all stock prices
        for (int i = 0; i < l; i++) {

            // Reset temporary profit
            tp = 0;

            // Update the minimum buying price
            if (min > prices[i])
                min = prices[i];

            // Calculate profit if sold on the current day
            tp = prices[i] - min;

            // If the transaction is profitable
            if (tp > 0) {

                // Add the profit to the total profit
                mp += tp;

                // Treat the current price as the new buying price
                min = prices[i];
            }
        }

        // Return the maximum profit
        return mp;
    }
}
