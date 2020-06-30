public class Solution {
    public long divide(long A, long B) {
        if(B==0)
            return Integer.MAX_VALUE;
        if(A==0)
            return 0;
        boolean sign=A<0 && B>0 || A>0 && B<0;
        A=Math.abs(A);
        B=Math.abs(B);
        long ans=0;
        long curr=B;
        long res=1;
        while(A>curr)
        {
            curr<<=1;
            res<<=1;
        }
        while(A>=B)
        {
            while(A<curr && (curr>>1)>=B)
            {
                curr=curr>>1;
                res=res>>1;
            }
            if(A<B)
                break;
            A-=curr;
            ans+=res;
        }
        return sign?-ans:Math.min(Integer.MAX_VALUE,ans);
    }
}
