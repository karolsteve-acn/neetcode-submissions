class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 0;
        for(var coin : coins) {
            for(int i = coin; i <= amount; i++) {
                int prev = arr[i - coin];
                if(prev != Integer.MAX_VALUE) {
                    arr[i] = Math.min(arr[i], 1 + arr[i - coin]);
                }
            }
        }
        return arr[amount] == Integer.MAX_VALUE ? -1 : arr[amount];
    }
}
