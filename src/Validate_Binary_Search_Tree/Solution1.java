package Validate_Binary_Search_Tree;
public class Solution1 {
    public boolean isValidBST(TreeNode root){
        return isValidBST(root,null,null);
    }
    boolean isValidBST(TreeNode root,TreeNode min,TreeNode max){
        if(root==null)
            return true;
        if(min!=null&&min.val>=root.val)
            return false;
        if(max!=null&&max.val<=root.val)
            return false;
        return isValidBST(root.left,min,root)&&isValidBST(root.right,root,max);
    }
}
