class Solution {
    public int missingNumber(int[] nums) {
        int max = nums.length;

        int maxSum = 0;
        for(int i = max; i > 0; i--) {
            maxSum += i;
        }

        int actualSum = 0;
        for(int i: nums) {
            actualSum += i;
        }
        return maxSum - actualSum;
    }

    public int getMax(int[] nums) {
        int currentMax = -1;
        for(int currentNumber: nums) {
            if (currentNumber > currentMax) currentMax = currentNumber;
        }
        return currentMax;
    }

    public void main(String[] args) {
        int[] nums = new int[]{0, 2};
        System.out.println(missingNumber(nums));
    }
}