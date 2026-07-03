class Solution {
    public int[] countBits(int n) {
        int[] r = new int[n + 1];
        for(int a = 0; a < r.length; a++) {
            int result = 0;
            int i = a;
            while(i != 0) {
                i &= i - 1;
                result++;
            }
            r[a] = result;
        }
        return r;
    }
}
