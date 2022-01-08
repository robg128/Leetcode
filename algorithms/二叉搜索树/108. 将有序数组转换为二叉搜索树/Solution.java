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

        return helperBST(0, nums.length - 1, nums);
    }

    public TreeNode helperBST(int low, int high, int[] nums) {

        if (low > high) return null;

        int middle;
        if((high - low) % 2 == 0) {
            middle = low + (high-low)/2 ;
        } else{
            middle = low + (high-low)/2 + 1;
        }
        

        TreeNode root = new TreeNode(nums[middle]);

        root.left = helperBST(low, middle-1, nums);

        root.right = helperBST(middle + 1, high, nums);

        return root;

    }
}