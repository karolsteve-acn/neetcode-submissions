class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(var n : nums) m.put(n, m.getOrDefault(n, 0) + 1);
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(m.entrySet());
        l.sort((lhs, rhs) -> rhs.getValue() - lhs.getValue());
        int[] r = new int[k];
        for(int i = 0; i < k; i++) {
            r[i] = l.get(i).getKey();
        }
        return r;
    }
}
