class Solution {
    public boolean canJump(int[] nums) {
        int max_step = 0;
        final int target_index = nums.length - 1;
        for(int i = 0; i < nums.length; i++) {
            if(max_step < i) return false;
            max_step = Math.max(max_step, i + nums[i]);
            if(max_step >= target_index) return true;
        }
        return max_step >= target_index;
    }
}
