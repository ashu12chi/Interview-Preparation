class Solution {
    public int[] numsSameConsecDiff(int N, int K) {
        var ans = new ArrayList<Integer>();
        if(N == 1)
            ans.add(0);
        for(int i = 1; i <= 9; ++i) {
            solve(i, i, ans, N, 1, K);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private void solve(int num, int dig, ArrayList<Integer> ans, int N, int cov, int K) {
        if(cov == N) {
            ans.add(num);
            return;
        }
        if(dig + K <= 9)
            solve(num * 10 + dig + K, dig + K, ans, N, cov + 1, K);
        if(dig - K >= 0 && K != 0)
            solve(num * 10 + dig - K, dig - K, ans, N, cov + 1, K);
    }
}
