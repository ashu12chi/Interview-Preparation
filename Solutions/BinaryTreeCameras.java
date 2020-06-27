/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/* Greedy:
Try to cover it from the bottom up, placing a camera in the deepest nodes first. If a node has its children covered and has a parent, then it is always better to place the camera at this node's parent.
*/

class Solution {
    int ans;
    public int minCameraCover(TreeNode root) {
        ans = 0;
        HashSet<TreeNode> done = new HashSet<>();
        done.add(null);
        solve(root, null, done);
        return ans;
    }
    
    private void solve(TreeNode root, TreeNode parent, HashSet<TreeNode> done) {
        if(root == null)
            return;
        solve(root.left, root, done);
        solve(root.right, root, done);
        //If a node has children that are not covered by a camera, then we must place a camera here. Also, if a node has no parent and it is not covered, we must place a camera here.
        if(!done.contains(root.left) || !done.contains(root.right) || (parent == null && !done.contains(root))) {
            ++ans;
            done.add(root);
            done.add(parent);
            done.add(root.left);
            done.add(root.right);
        }
    }
}
