class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];
        int acc = 1;
        r[0]= 1;
        for(int i = 0; i < nums.length - 1; i++) {
            acc *= nums[i];
            r[i + 1] = acc;
        }

        acc = 1;
        for(int i = nums.length - 1; i > 0; i--) {
            acc *= nums[i];
            r[i - 1] *= acc;
        }

        return r;
    }
}  
