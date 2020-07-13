class Solution {
    public int deleteAndEarn(int[] nums) {
        int buckets[] = new int[10001], dp[] = new int[10001];
        for(int num : nums)
            buckets[num] += num;   // make buckets of numbers
        dp[0] = buckets[0];
        dp[1] = buckets[1];
        // now this question is same as House Robber
        for(int i = 2; i < 10001; ++i)
            dp[i] = Math.max(buckets[i] + dp[i - 2], dp[i - 1]);
        return dp[10000];
    }
}
