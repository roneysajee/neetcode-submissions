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

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null) return false;
        if(q == null) return false;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(p);
        qu.offer(q);
        while(!qu.isEmpty()){
            TreeNode node1 = qu.poll();
            TreeNode node2 = qu.poll();
            if(node1 == null && node2 == null)continue;
            if(node1 == null || node2 == null || node1.val != node2.val){
                return false;
            }
            qu.offer(node1.left);
            qu.offer(node2.left);
            qu.offer(node1.right);
            qu.offer(node2.right);
        }

        return true;
    }
}
