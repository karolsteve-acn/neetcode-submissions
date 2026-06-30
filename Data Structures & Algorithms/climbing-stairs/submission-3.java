class Solution {
    public int climbStairs(int n) {
        int cache[] = new int[n + 1];
        for(int i = 0; i < cache.length; i++) {
            cache[i] = -1;
        }
        return f(n, cache);
    }

    private int f(int n, int[] cache) {
        if(n <= 2) return n;
        if(cache[n] == -1) {
            cache[n] = f(n - 1, cache) + f(n - 2, cache);
        }
        return cache[n];
    }
}
