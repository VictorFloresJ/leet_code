import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> viewedNumbers = new HashMap<>();

        int currentNumber;
        int needed;
        for(int i = 0; i < nums.length; i++) {
            currentNumber = nums[i];
            needed = target - currentNumber;
            if (viewedNumbers.containsKey(needed)) {
                return new int[]{viewedNumbers.get(needed), i};
            }
            viewedNumbers.put(currentNumber, i);
        }
        return new int[0];
    }

    public void main(String[] args) {
        var nums = new int[]{3, 2, 4};
        var target = 6;
        
        int[] twoNums = twoSum(nums, target);
        System.out.println(twoNums[0]);
        System.out.println(twoNums[1]);
    }    
}