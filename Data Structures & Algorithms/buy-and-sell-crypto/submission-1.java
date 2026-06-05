class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int maxProfit=0;
        int left=0;
        int right=1;

    

        while(left<right && right<n)
        {

            if(prices[left]>prices[right])
            {
                left=right;
                right++;
                continue;
            }

            maxProfit=Math.max(maxProfit,prices[right]-prices[left]);
            
            right++;
        }
        return maxProfit;
    }
}
