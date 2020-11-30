package Convert_BST_to_Greater_Tree;
class Solution {
    //这道题目仔细想想是有难度的
    //通过后序遍历，可以实现
    //仅仅加上右子树的值时没有用的
    //所以中序遍历吧
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }
    void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.right);
        sum+=root.val;
        root.val=sum;
        traverse(root.left);
    }
}
