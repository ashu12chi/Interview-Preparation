class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        if(n <= 1)
            return false;
        for(int i = 0; i < n; ++i) {
            if(nums[i] == 0)
                continue;
            int slow = i, fast = getIndex(i, nums);
            while(nums[fast] * nums[i] > 0 && nums[getIndex(fast, nums)] * nums[i] > 0) {
                if(slow == fast) {
                    if(slow == getIndex(slow, nums))    // length = 1
                        break;
                    return true;
                }
                slow = getIndex(slow, nums);
                fast = getIndex(getIndex(fast, nums), nums);
            }
            // in case loop not found, set all elements on current path to be 0
            slow = i;
            int val = nums[i];
            while(nums[slow] * val > 0) {
                int next = getIndex(slow, nums);
                nums[slow] = 0;
                slow = next;
            }
        }
        return false;
    }
    
    private int getIndex(int i, int nums[]) {
        int n = nums.length;
        return i + nums[i] >= 0 ? (i + nums[i]) % n : n + ((i + nums[i]) % n);
    }
}
