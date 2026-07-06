class Solution {
    public int missingNumber(int[] nums) {
        int m = nums.length;
        for(int i = 0; i < nums.length; i++) m ^= nums[i] ^ i;
        return m;
    }
}
