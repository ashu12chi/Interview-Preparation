class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1, ans = 0, farthest = 0, end = 0;
        for(int i = 0; i < n; ++i) {
            farthest = Math.max(farthest, nums[i] + i);
            if(farthest >= n) {
                ++ans;
                break;
            }
            if(i == end) {
                ++ans;
                end = farthest;
            }
        }
        return ans;
    }
}
