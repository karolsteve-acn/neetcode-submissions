class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (var c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (var c : t.toCharArray()) {
            if(arr[c - 'a']-- == 0) return false;
        }
        for(var n : arr) {
            if(n != 0) return false;
        }
        return true;
    }
}
