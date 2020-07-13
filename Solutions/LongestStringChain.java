class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        int n = words.length, dp[] = new int[n], ans = 0;
        for(int i = 0; i < n; ++i) {
            dp[i] = 1;
            for(int j = 0; j < i; ++j)
                if(check(words[j], words[i]))
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
    
    private boolean check(String s1, String s2) {
        int n = s1.length(), m = s2.length(), val;
        if(m != (n + 1))
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s2.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        for(char c : s1.toCharArray()) {
            val = map.getOrDefault(c, 0) - 1;
            if(val < 0)
                return false;
            map.put(c, val);
        }
        return true;
    }
}
