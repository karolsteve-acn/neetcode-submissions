class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(var n : nums) {
            if(n < min) {
                min = n;
            }
        }
        return min;
    }
}
