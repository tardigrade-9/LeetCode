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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root==null)
            return res;
        queue.add(root);
        while(queue.size()!=0){
            List<TreeNode> currentLevel = new ArrayList<>();
            List<Integer> currVal = new ArrayList<>();
            while(queue.size()!=0){
                currentLevel.add(queue.remove());
            }
            for(TreeNode node:currentLevel){
                currVal.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            res.add(currVal);
        }
        return res;
    }
    
}