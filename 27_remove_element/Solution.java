class Solution {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public void main(String[] args) {
        int[] nums = {3,2,2,3};
        int k = removeElement(nums, 3);
        for(int i: nums) {
            System.out.println(i);
        }
    }
}