package Convert_BST_to_Greater_Tree;
class Solution {
    //这道题目仔细想想是有难度的
    //通过后序遍历，可以实现
    public TreeNode convertBST(TreeNode root) {
        right_val(0,root,false);
        return root;
    }
    public int right_val(int parent_val,TreeNode node,boolean right){
        //返回以node的那棵树的所有数相加
        if(node==null)
            return 0;
        if(right)
            node.val=node.val+right_val(0,node.right,true);
        else
            node.val=parent_val+node.val+right_val(0,node.right,true);
        right_val(node.val, node.left,false);
        return node.val;
    }
}
