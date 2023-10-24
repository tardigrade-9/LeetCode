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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums,0,nums.length-1);
    }
    
    private TreeNode buildBST(int[] nums, int left, int right){
        if(left>right)
            return null;
        int m = (left+right)/2;
        return new TreeNode(nums[m],buildBST(nums,left,m-1),buildBST(nums,m+1,right));
    }
}