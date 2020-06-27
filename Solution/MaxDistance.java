public class Solution {
    public int maximumGap(final List<Integer> A) {
        int n=A.size();
        //lMin[i] is the smallest element in 1..i
        int lMin[]=new int[n];
        //rMax[i] is the largest element in i..n
        int rMax[]=new int[n];
        for(int i=0;i<n;i++)
            lMin[i]=i==0?A.get(i):Math.min(lMin[i-1],A.get(i));
        for(int i=n-1;i>=0;i--)
            rMax[i]=i==n-1?A.get(i):Math.max(rMax[i+1],A.get(i));
        int ans=0;
        //two pointers
        for(int i=0,j=0;i<n && j<n;)
        {
            while(j<n && rMax[j]>=lMin[i])//while there is a larger element on right side
                j++;
            j--;//you either reach j=n or a smaller element,so come back
            ans=Math.max(ans,j-i);
            i++;
        }
        return ans;
    }
}
