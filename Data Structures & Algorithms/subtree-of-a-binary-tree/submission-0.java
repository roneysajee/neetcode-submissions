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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node1 = q.poll();
            if(node1 == null) continue;
            if(node1.val == subRoot.val){
                if(isSame(node1,subRoot)) return true;
            }
            q.offer(node1.left);
            q.offer(node1.right);
        }
        return false;

    }

    private boolean isSame(TreeNode root1,TreeNode root2){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root1);
        q.offer(root2);
        while(!q.isEmpty()){
            TreeNode node1 = q.poll();
            TreeNode node2 = q.poll();
            if(node1 == null && node2 == null) continue;
            if(node1 == null || node2 == null || node1.val != node2.val)
            return false;
            q.offer(node1.left);
            q.offer(node2.left);
            q.offer(node1.right);
            q.offer(node2.right);
        }
        return true;
    }
}
