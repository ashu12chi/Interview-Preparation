/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> recoverTree(TreeNode A) {
        TreeNode curr=A;
        int next=-1,prev=-1;
        ArrayList<Integer> sol=new ArrayList<>();
        while(curr!=null)
        {
            if(curr.left!=null)
            {
                TreeNode pre=curr.left;
                while(pre.right!=null && pre.right!=curr)
                    pre=pre.right;
                if(pre.right==null)
                {
                    pre.right=curr;
                    curr=curr.left;
                }
                else
                {
                    pre.right=null;
                    if(curr.val<prev)
                    {
                        if(sol.size()==0)
                        {
                            sol.add(prev);
                            next=curr.val;
                        }
                        else
                            sol.add(curr.val);
                    }
                    prev=curr.val;
                    curr=curr.right;
                }
            }
            else
            {
                if(curr.val<prev)
                {
                    if(sol.size()==0)
                    {
                        sol.add(prev);
                        next=curr.val;
                    }
                    else
                        sol.add(curr.val);
                }
                prev=curr.val;
                curr=curr.right;
            }
        }
        if(sol.size()==1)
            sol.add(next);
        Collections.sort(sol);
        return sol;
    }
}
