public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int ans=0;
        for(int i=0;i<30;i++)
        {
            int cnt=0;
            for(int j:A)
                if(((j>>i)&1)==1)
                    cnt++;
            if(cnt%3!=0)
                ans+=1<<i;
        }
        return ans;
    }
}
