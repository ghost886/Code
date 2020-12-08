package Insert_into_a_Binary_Search_Tree;

public class Solution {
    //将某个值传入，前提是要找到插入点
    public TreeNode insertIntoBST(TreeNode root,int val){
        if(root==null)
            return new TreeNode(val);
        else if(root.val>val)
            root.left=insertIntoBST(root.left,val);
        else
            root.right=insertIntoBST(root.right,val);
        return root;
    }
}
