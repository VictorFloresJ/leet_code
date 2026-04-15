class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // left represents toBuy
        int right = 0; // right represents toSell
        int maxCurrentProfit = 0;

        while (right < prices.length) {
            if (prices[left] < prices [right]) {
                int currentProfit = prices[right] - prices[left];
                maxCurrentProfit = 
                    (currentProfit > maxCurrentProfit) 
                    ? currentProfit : maxCurrentProfit;
                
            } else {
                left = right;
            }
            right++;
        }

        return maxCurrentProfit;
    }

    public void main(String[] args) {
        int[] prices = new int[]{1, 2, 1};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }
}