public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        int n=B;
        int l=1,r=n;
        ArrayList<Integer> sol=new ArrayList<>();
        int trail=1;
        for(int i=1;i<n-1;i++)
            if(A.charAt(i)==A.charAt(i-1))
                trail++;
            else
            {
                if(A.charAt(i-1)=='D')
                {
                    while(trail-->0)
                        sol.add(r--);
                }
                else
                {
                    while(trail-->0)
                        sol.add(l++);
                }
                trail=1;
            }
            if(A.charAt(n-2)=='D')
            {
                while(trail-->0)
                    sol.add(r--);
            }
            else
            {
                while(trail-->0)
                    sol.add(l++);
            }
            sol.add(l);
        return sol;
        
    }
}
