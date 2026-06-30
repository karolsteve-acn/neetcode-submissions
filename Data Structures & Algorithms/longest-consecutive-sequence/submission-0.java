class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(var num : nums) {
            set.add(num);
        }

        int result = 0;
        for(var num : set) {
            if(!set.contains(num - 1)) {
                int length = 1;
                while(set.contains(num + length)) {
                    length++;
                }
                result = Math.max(length, result);
            }
        }
        return result;
    }
}
