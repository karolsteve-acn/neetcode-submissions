class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int countOf0 = 0;
        int zeroIdx = -1;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] == 0) {
                countOf0++;
                zeroIdx = j;
                continue;
            }
            product *= nums[j];
        }
        if(countOf0 > 1) {
            return result;
        } else if(countOf0 > 0) {
            result[zeroIdx] = product;
            return result;
        }

        for(int i = 0; i < nums.length; i++) {
            result[i] = product / nums[i];
        }
        return result;
    }
}  
