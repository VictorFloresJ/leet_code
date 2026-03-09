
class Solution {
    public int removeDuplicates(Integer[] nums) {
        if (nums.length == 0) return 0;

        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1 ]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public void main(String[] args) {
        Integer[] nums = {1, 1, 2, 2, 2, 2, 2, 2, 3, 4, 5, 6};
        int k = removeDuplicates(nums);
        // for (int i : nums) {
        //     System.out.println(i);
        // }
    }
}