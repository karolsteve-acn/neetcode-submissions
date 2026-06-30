class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for(int i = 0; i < sChars.length; i++) {
            arr[sChars[i] - 'a']++;
            arr[tChars[i] - 'a']--;
        }
        for(var n : arr) {
            if(n != 0) return false;
        }
        return true;
    }
}
