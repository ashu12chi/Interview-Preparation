public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int n=A.size();
        int max1=n-1;
        int max2=n-1;
        int ans=0;
        for(int i=n-1;i>=0;i--)
        {
            if(A.get(max1)+max1<A.get(i)+i)
                max1=i;
            if(-A.get(max2)+max2<-A.get(i)+i)
                max2=i;
            if(A.get(max1)>=A.get(i))
                ans=Math.max(ans,A.get(max1)-A.get(i)+max1-i);
            if(A.get(max2)<=A.get(i))
                ans=Math.max(ans,A.get(i)-A.get(max2)+max2-i);
        }
        return ans;
    }
}
