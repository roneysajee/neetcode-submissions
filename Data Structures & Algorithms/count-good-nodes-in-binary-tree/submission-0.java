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
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null)return 0;
        goodNode(root,root);
        return count;
    }

    private void goodNode(TreeNode node,TreeNode largestSeen){
        if(node == null) return;
        if(node.val >= largestSeen.val){
            count++;
            goodNode(node.left,node);
            goodNode(node.right,node);
        }else{
            goodNode(node.left,largestSeen);
            goodNode(node.right,largestSeen);
        }
    }
}
