class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int max = 0;
        int l = 0;
        Map<Character, Integer> m = new HashMap<>();
        for(int r = 0; r < s.length(); r++) {
            Character c = s.charAt(r);
            if(m.containsKey(c)) {
                l = Math.max(l, m.get(c) + 1);
            }
            m.put(c, r);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
