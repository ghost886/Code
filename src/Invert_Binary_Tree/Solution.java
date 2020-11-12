package Invert_Binary_Tree;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        else{
            TreeNode temp=root.left;
            root.left=invertTree(root.right);
            root.right=invertTree(temp);
            return root;
        }
    }
}