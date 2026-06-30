class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        var addedSolutions = new HashSet<String>();
        var result = new HashSet<List<Integer>>();
        int[] s = new int[3];
        for(int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[left] + nums[right];
                if(sum == target) {
                    var solu = List.of(nums[i], nums[left], nums[right]);
                    result.add(solu);
                    left++;
                    right--;
                } else if(sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
