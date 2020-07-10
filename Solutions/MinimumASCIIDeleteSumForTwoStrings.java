class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        Integer dp[][] = new Integer[n + 1][m + 1];
        return solve(s1, s2, n, m, dp);
    }
    
    private int solve(String s1, String s2, int n, int m, Integer dp[][]) {
        if(n == 0 && m == 0)
            return 0;
        if(dp[n][m] != null)
            return dp[n][m];
        if(n == 0)
            return dp[n][m] = s2.charAt(m - 1) + solve(s1, s2, n, m - 1, dp);
        if(m == 0)
            return dp[n][m] = s1.charAt(n - 1) + solve(s1, s2, n - 1, m, dp);
        if(s1.charAt(n - 1) == s2.charAt(m - 1))
            return dp[n][m] = solve(s1, s2, n - 1, m - 1, dp);
        return dp[n][m] = Math.min(s2.charAt(m - 1) + solve(s1, s2, n, m - 1, dp), s1.charAt(n - 1) + solve(s1, s2, n - 1, m, dp));
    }
}
