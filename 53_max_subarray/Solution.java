import java.util.HashSet;
import java.util.Collections;

class Solution {
    public int maxSubArray(int[] nums) {
        HashSet<Integer> allProfits = new HashSet<>();
        Integer currentProfit = 0;
        
        for(int currentValue: nums) {
            currentProfit += currentValue;
            if (currentValue > currentProfit) {
                allProfits.add(currentValue);
                currentProfit = currentValue;
            } else {
                allProfits.add(currentProfit);
            }
        }
        
        return Collections.max(allProfits);
    }

    public void main(String[] args) {
        int[] nums = new int[]{1, 2};
        System.out.println(maxSubArray(nums));
    }
}