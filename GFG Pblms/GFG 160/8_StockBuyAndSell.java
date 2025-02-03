//Stock Buy and Sell – Multiple Transaction Allowed - leetcode Medium - 122 - Paytm , Flipkart , Morgan Stanley, Accolite , Amazon , Microsoft , Samsung , D-E-ShawHike , MakeMyTrip , Ola Cabs , Oracle , Walmart ,Goldman Sachs , DirectiIntuit , SAP Labs , Quikr , Facebook , Salesforce , PubmaticSapient , Swiggy



class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit = profit+ prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
