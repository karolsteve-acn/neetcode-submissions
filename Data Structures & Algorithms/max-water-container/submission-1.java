class Solution {
    public int maxArea(int[] height) {
         int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right) {
            int leftHeight = height[left], rightHeight = height[right];
            int amount = Math.min(leftHeight, rightHeight) * (right - left);
            max = Math.max(max, amount);
            if(leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
