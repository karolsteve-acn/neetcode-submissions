class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for(var str : strs) {
            int[] freq = new int[26];
            for(char c : str.toCharArray()) {
                freq[c - 'a']++;
            }
            group.computeIfAbsent(Arrays.toString(freq), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(group.values());
    }
}
