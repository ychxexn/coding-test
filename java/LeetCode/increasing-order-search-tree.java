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
    public TreeNode increasingBST(TreeNode root) {
        Queue<Integer> queue = makeLinkedList(root, new LinkedList<Integer>());
        TreeNode node = new TreeNode(queue.remove());
        TreeNode answer = node;
        
        while(!queue.isEmpty()){
            node.right = new TreeNode(queue.remove());
            node = node.right;
        }
        
        return answer;
    }
    
    private LinkedList<Integer> makeLinkedList(TreeNode root, LinkedList<Integer> list){
        if(root == null){
            return null;
        }
        
        makeLinkedList(root.left, list);
        list.add(root.val);
        makeLinkedList(root.right, list);
        
        return list;
    }
}