package Kth_Smallest_Element_in_a_BST;

public class Solution {
    //BST  左小右大
    //如果二叉搜索树的结构中有size那么就可以通过size进行推断第k个元素了
    int rank=0;
    int res;
    public int kthSmallest(TreeNode root,int k){
        mid(root,k);
        return res;
    }
    public void mid(TreeNode node,int k){
        if(node==null)
            return;
        mid(node.left,k);
        rank++;
        if(rank==k){
            res=node.val;
            return;
        }
        mid(node.right,k);
    }
}
