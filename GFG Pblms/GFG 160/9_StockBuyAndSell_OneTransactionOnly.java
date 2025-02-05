// Stock Buy and Sell – Max one Transaction Allowed - leetcode - 121 - Easy - Bloomberg , Facebook , Intel , Infosys , Zoho , Morgan Stanley , Amazon , Microsoft , Samsung , Yahoo , PayPal ,Nvidia , Oracle , Visa , Walmart , Goldman Sachs , TCS , Adobe , Google, IBM , Accenture , Apple , Uber

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int buying = prices[0];
        int profit = 0;
        int currentProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buying){
                buying = prices[i];
            }else{
                currentProfit = prices[i]-buying;
                profit = Math.max(profit,currentProfit);
            }
            
        }
        return profit;
    }
}
