class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount + 1];
        Arrays.fill(arr, amount + 1);
        arr[0] = 0;
        for(var coin : coins) {
            for(int i = coin; i <= amount; i++) {
                arr[i] = Math.min(arr[i], 1 + arr[i - coin]);
            }
        }
        return arr[amount] == amount + 1 ? -1 : arr[amount];
    }
}
