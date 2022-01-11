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
    public int sumRootToLeaf(TreeNode root) {
        return getSum(root, "");
    }
    
    public int getSum(TreeNode node, String binary){
        if(node == null){
            return 0;
        }
        
        int sum = 0;
        
        if(node.left != null){
            sum += getSum(node.left, binary + node.val);
        }
        if(node.right != null){
            sum += getSum(node.right, binary + node.val);
        }
        
        if(node.left == null && node.right == null){
            return Integer.parseInt(binary + node.val, 2);
        }
        
        return sum;
    }
}