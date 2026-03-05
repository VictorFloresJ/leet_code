import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target){
        var indices = new int[2];
        Map<Integer, Integer> complements = new HashMap<>();
        
        int actualNumber;
        int needed;
        for(int i = 0; i < nums.length; i++) {
            actualNumber = nums[i];
            needed = target - actualNumber;
            if (complements.containsKey(needed)) {
                return new int[]{complements.get(needed), i};
            } 
            complements.put(actualNumber, i);
        }

        return indices;
    }

    public void main(String[] args) {
        var nums = new int[]{3, 2, 5};
        var target = 6;
        
        int[] twoNums = twoSum(nums, target);
        System.out.println(twoNums[0]);
        System.out.println(twoNums[1]);
    }    
}