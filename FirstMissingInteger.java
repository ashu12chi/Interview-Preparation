public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int n=A.size();
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)<=0 || A.get(i)>n)
                continue;
            int p=A.get(i);
            if(A.get(p-1)!=p)
            {
                A.set(i,A.get(p-1));
                A.set(p-1,p);
                i--;
            }
        }
        for(int i=0;i<A.size();i++)
            if(A.get(i)!=i+1)
                return i+1;
        return n+1;
    }
}
