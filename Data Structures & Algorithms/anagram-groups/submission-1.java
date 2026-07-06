class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for(var s : strs) {
            char[] k = s.toCharArray();
            Arrays.sort(k);
            m.computeIfAbsent(new String(k), k2 -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
