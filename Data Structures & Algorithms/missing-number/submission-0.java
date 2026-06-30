class Solution {
    public int missingNumber(int[] nums) {
        int numsSum = IntStream.of(nums).sum();
        int oneToNSum = nums.length * (nums.length + 1) / 2;
        return oneToNSum - numsSum;
    }
}
