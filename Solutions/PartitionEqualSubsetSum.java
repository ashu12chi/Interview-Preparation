class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums)
            sum += num;
        if(sum % 2 != 0)
            return false;
        Arrays.sort(nums);
        return solve(nums, nums.length - 1, 0, sum / 2);
    }
    
    private boolean solve(int nums[], int ind, int sa, int target) {
        if(ind < 0 || sa > target)
            return false;
        if(nums[ind] > target)
            return false;
        if(sa == target)
                return true;
        return solve(nums, ind - 1, sa + nums[ind], target) || solve(nums, ind - 1, sa, target);
    }
}
