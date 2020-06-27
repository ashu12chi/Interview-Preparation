public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long n = A.size();
        long sum = n * (n + 1) / 2, sumsq = n * (n + 1) * (2 * n + 1) / 6;
        for(long num : A) {
            sum -= num;
            sumsq -= num * num;
        }
        // sum is x - y, sumsq is x2 - y2
        sumsq /= sum;
        // now sumsq is x + y
        ArrayList<Integer> ans = new ArrayList<>(2);
        ans.add((int) (Math.abs((sumsq - sum)) / 2));
        ans.add((int) ((sum + sumsq) / 2));
        return ans;
    }
}
