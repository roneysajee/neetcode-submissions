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
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
       inOrder(root);
       for(int i =1;i<list.size();i++){
        if(list.get(i) <= list.get(i-1))return false;
       }
       return true;
    }

    private boolean trav(TreeNode node,int prevVal,int ind){
        if(node == null)return true;
        boolean flag = true;
        flag = flag && trav(node.left,node.val,0);
        if(ind ==0 && prevVal <= node.val) return false;
        if(ind ==1 && prevVal >= node.val) return false;
        flag = flag && trav(node.right,node.val,1);
        return flag;
    }
    private void inOrder(TreeNode node){
        if(node == null)return;
        inOrder(node.left);
        list.add(node.val);
        inOrder(node.right);
    }
}
