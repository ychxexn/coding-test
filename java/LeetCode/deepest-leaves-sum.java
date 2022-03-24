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
    public int deepestLeavesSum(TreeNode root) {
        int result = 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            result = 0;
            for(int i=queue.size()-1; i>=0; i--){
                TreeNode node = queue.poll();
                result += node.val;
                
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        
        return result;
    }
}