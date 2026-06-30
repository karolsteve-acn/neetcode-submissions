class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean sorted = true;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                sorted = false;
                break;
            }
        }

        if(sorted) {
            int left = 0;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[left] + nums[right];
                if(sum == target) {
                    return new int[] {left, right};
                } else if(sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        } else {
            Map<Integer,Integer> seen = new HashMap<>();
            for(int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if(seen.containsKey(complement)) {
                    int complementIndex = seen.get(complement);
                    return new int[]{complementIndex, i};
                }
                seen.put(nums[i], i);
            }
        }
        throw new IllegalStateException("Not found");
    }
}
