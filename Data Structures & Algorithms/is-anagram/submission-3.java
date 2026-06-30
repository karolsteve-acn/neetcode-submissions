class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character,Integer> sChars = new HashMap<>();
        Map<Character,Integer> tChars = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sChars.put(c, sChars.getOrDefault(c, 0) + 1);
            tChars.put(t.charAt(i), tChars.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sChars.equals(tChars);
    }
}
