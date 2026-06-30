class Solution {
    public void rotate(int[][] m) {
        int l = 0, r = m.length - 1;
        while(l < r) {
            var tmp = m[l];
            m[l++] = m[r];
            m[r--] = tmp;
        }
        for(int i = 0; i < m.length; i++) {
            for(int j = i + 1; j < m[i].length; j++) {
                var tmp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = tmp;
            }
        }
    }
}
