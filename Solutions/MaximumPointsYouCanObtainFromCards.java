class Solution {
    public int maxScore(int[] cards, int k) {
        int n = cards.length, end1 = k - 1, end2 = n - 1, sum = 0, ans;
        for(int i = 0; i < k; ++i)
            sum += cards[i];
        ans = sum;
        while(end1 >= 0) {
            sum += cards[end2--] - cards[end1--];
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
