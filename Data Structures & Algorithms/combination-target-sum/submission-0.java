class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums, 0, target, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, final int sum, 
    final int target, int start, List<Integer> items) {
        if(sum == target) {
            result.add(new ArrayList<>(items));
            return;
        }

        if(sum > target) return;

        for(int i = start; i < nums.length; i++) {
            int curr = nums[i];
            items.add(curr);
            backtrack(nums, sum + curr, target, i, items);
            items.removeLast();
        }
    }
}
