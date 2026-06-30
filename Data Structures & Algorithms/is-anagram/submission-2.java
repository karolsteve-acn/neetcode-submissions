class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character,Integer> sChars = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sChars.put(c, sChars.computeIfAbsent(c, k -> 0) + 1);
        }
        Map<Character,Integer> tChars = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tChars.put(c, tChars.computeIfAbsent(c, k -> 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : sChars.entrySet()) {
            Integer tCount = tChars.get(entry.getKey());
            if(!entry.getValue().equals(tCount)) {
                return false;
            }
        }
        return true;
    }
}
