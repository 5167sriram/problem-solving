/*
Approach:
- Traverse the array only once.
- Keep track of the minimum stock price seen so far.
- For each day's price, calculate the profit if the stock is sold on that day.
- Update the maximum profit whenever a higher profit is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxProfit(int[] prices) {
        //profit=sold price-bougth price
        int l=prices.length,min=Integer.MAX_VALUE,md=Integer.MIN_VALUE;
        if(l==0 || l==1)
        return 0;
        
        //i is the selling price of the stock
        
        //md -> maxprofit
        //tmd -> currentprofit
        //min -> minprice
        for(int i=0;i<l;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            int tmd=prices[i]-min;
            if(tmd>md)
             md=tmd;
            
        }
        
       
        if(md<0)
        return 0;
        return md;
        
        
        
    }
    
}
