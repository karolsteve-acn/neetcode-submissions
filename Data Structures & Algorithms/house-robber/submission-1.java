class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int prev2 = 0;
        int prev1 = 0;
        for(int i = 0; i < nums.length; i++) {
            int tmpPrev1 = prev1;
            prev1 = Math.max(nums[i] + prev2, prev1);
            prev2 = tmpPrev1;
        }
        return prev1;
    }
}
