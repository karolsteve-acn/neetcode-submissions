class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(var num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>>[] bucket = new List[nums.length + 1];
        for(var entry : count.entrySet()) {
            var list = bucket[entry.getValue()];
            if(list == null) {
                list = new ArrayList<>();
                bucket[entry.getValue()] = list;
            }
            list.add(entry);
        }

        int result[] = new int[k];
        int lastIdx = bucket.length - 1;
        while(k > 0) {
            var val = bucket[lastIdx--];
            if(val != null) {
                for(var e : val) {
                     result[--k] = e.getKey();
                }
            }
        }
        return result;
    }
}
