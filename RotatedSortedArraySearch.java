public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int search(final List<Integer> A, int B) {
        int n=A.size();
        int low=0,high=n-1,c=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(A.get(mid)>=A.get(0))
            {
                c=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        if(B>=A.get(0))
        {
            low=0;
            high=c;
        }
        else
        {
            low=c+1;
            high=n-1;
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(B==A.get(mid))
                return mid;
            else if(B>A.get(mid))
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}
