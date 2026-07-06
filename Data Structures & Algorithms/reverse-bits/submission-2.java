class Solution {
    public int reverseBits(int n) {
        int r = 0;
        for(int i = 0; i < 32; i++) {
            int b = (n >>> i) & 1;
            r |= b << (31 - i);
        }
        return r;
    }
}
