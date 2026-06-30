class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }

        int left = 0;
        int right = 0;

        int max = 0;

        HashMap<Character, Integer> seen = new HashMap<>();

        while(right < s.length()) {
            if(seen.containsKey(s.charAt(right))) {
                left = Math.max(left, seen.get(s.charAt(right)) + 1);
            }
            max = Math.max(max, right - left + 1);
            seen.put(s.charAt(right), right);
            right++;
        } 

        return max;
    }
}
