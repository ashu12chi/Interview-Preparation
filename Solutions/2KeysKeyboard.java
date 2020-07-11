class Solution {
    public int minSteps(int n) {
        int ans = 0, prime = 2;
        while(n > 1) {
            while(n % prime == 0) {
                ans += prime;
                n /= prime;
            }
            ++prime;
        }
        return ans;
    }
}
