class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0, max = Integer.MIN_VALUE;
        for(int n : nums) {
            curr = Math.max(curr + n, n);
            max = Math.max(max, curr);
        }
        return max;
    }
}
