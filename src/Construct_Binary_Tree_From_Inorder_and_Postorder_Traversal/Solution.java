package Construct_Binary_Tree_From_Inorder_and_Postorder_Traversal;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return recursion(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    public TreeNode recursion(int[] inorder,int[]postorder,int l1,int r1,int l2,int r2){
        if(l2==r2)
            return new TreeNode(postorder[r2]);
        if(l2>r2)
            return null;
        TreeNode treeNode=new TreeNode(postorder[r2]);
        int root=findroot(inorder,postorder[r2],l1,r1);
        int left_length=root-l1;
        treeNode.left=recursion(inorder,postorder,l1,root-1,l2,l2+left_length-1);
        treeNode.right=recursion(inorder,postorder,root+1,r1,l2+left_length,r2-1);
        return treeNode;
    }
    public int findroot(int [] inorder,int root,int left,int right){
        for (int i = left; i <= right ; i++) {
            if(inorder[i]==root)
                return i;
        }
        return 0;
    }
}
