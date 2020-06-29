class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k < 1 || t < 0)
            return false;
        Map<Long, Long> map = new HashMap<>();
        long n = nums.length, bucket, remapped;
        for(int i = 0; i < n; ++i) {
            remapped = (long) nums[i] - Integer.MIN_VALUE;
            bucket = remapped / ((long) t + 1);
            if(map.containsKey(bucket) || (map.containsKey(bucket - 1) && (remapped - map.get(bucket - 1) <= t)) || (map.containsKey(bucket + 1) && (map.get(bucket + 1) - remapped <= t)))
                return true;
            if(map.entrySet().size() >= k)
                map.remove(((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1));
            map.put(bucket, remapped);
        }
        return false;
    }
}
