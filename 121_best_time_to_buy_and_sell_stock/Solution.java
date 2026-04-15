class Solution {
    public int maxProfit(int[] prices) {

        // 1 <= prices.length <= 105
        int left = 0;
        int right = 1;
        int currentProfit = 0;
        while (right < prices.length) {
            if (prices[left] > prices [right]) {
                left = right;
                right++;
            } else {
                if (prices[left] - prices[right] > currentProfit) {
                    currentProfit = prices[left] - prices[right];
                }
                right++;
            }

        }
        
        return currentProfit;    
    }
    public void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};

        int maxProfit = maxProfit(prices);

        System.out.println(maxProfit);
    }
}