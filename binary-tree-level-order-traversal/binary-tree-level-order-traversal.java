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
        while(!queue.isEmpty()){
            List<Integer> currLevel = new ArrayList<>();
            for(int i = queue.size();i>0;i--){
                TreeNode c = queue.remove();
                currLevel.add(c.val);
                if(c.left!=null)
                    queue.add(c.left);
                if(c.right!=null)
                    queue.add(c.right);
            }
            res.add(currLevel);
        }
        return res;
    }
    
}