import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsWeSaw = new HashSet<>();

        for (int currentNumber : nums) {
            if (numsWeSaw.contains(currentNumber)) {
                return true;
            }
            numsWeSaw.add(currentNumber);
        }
        return false;
    }

    public void main(String[] args) {
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums));
    }
}