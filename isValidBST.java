/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null,null);
    }
    
    public static boolean isValidBST(TreeNode node, Integer min, Integer max) {
        if(node==null)
            return true;														// single node is always a BST (Base case)
            
        if((min!=null && node.val <= min ) || (max!=null && node.val >= max))
            return false;														// Duplicate values not allowed
        
        if(!(isValidBST(node.left, min, node.val)) || !(isValidBST(node.right, node.val, max)))
            return false;
        
        return true;
    }
}
