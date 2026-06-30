class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for(var c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        final int need = tMap.size();
        int have = 0;
        int left = 0;
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        for(int right = 0; right < s.length(); right ++) {
            char c = s.charAt(right);
            if(tMap.containsKey(c)) {
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
                if(sMap.get(c) == tMap.get(c)) {
                    have++;
                }
            }

            while(need == have) {
                if(right - left + 1 < minlen) {
                    minlen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                left++;
                if(tMap.containsKey(leftChar)) {
                    int currentCount = sMap.get(leftChar);
                    sMap.put(leftChar, currentCount - 1);
                    if(currentCount == tMap.get(leftChar)) {
                        have--;
                    }
                }
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}
