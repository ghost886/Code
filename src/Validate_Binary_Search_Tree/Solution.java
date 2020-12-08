package Validate_Binary_Search_Tree;
public class Solution {
    public boolean first_time=true;
    public int before;
    boolean res=true;
    public boolean isValidBST(TreeNode root) {
        mid(root);
        return res;
    }
    public void mid(TreeNode root){
        if(root==null)
            return;
        else{
            mid(root.left);
            if(first_time) {
                first_time=false;
                before = root.val;
            }
            else{
                if(before>=root.val)
                    res=false;
                before=root.val;
            }
            mid(root.right);
        }
    }
}
