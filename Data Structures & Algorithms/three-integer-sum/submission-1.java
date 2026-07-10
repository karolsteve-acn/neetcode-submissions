class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> v = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++) {
            if(i != 0 && nums[i - 1] == nums[i]) continue;
            int target = -nums[i];
            Map<Integer, Integer> m = new HashMap<>();
            for(int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];
                if(m.containsKey(complement)) {
                    var li = List.of(nums[i], nums[j], nums[m.get(complement)]);
                    if(!result.contains(li))result.add(li);
                } else {
                    m.put(nums[j], j);
                }
            }
        }
        return result;
    }
}
