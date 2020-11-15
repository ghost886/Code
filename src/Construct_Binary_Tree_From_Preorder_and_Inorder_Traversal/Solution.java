package Construct_Binary_Tree_From_Preorder_and_Inorder_Traversal;
/*
这道题目还是学到了很多的
首先，在中序遍历中找到的root与前序遍历中的关系，并不是坐标一样，而是长度一样
 */
public class Solution {
    public TreeNode buildTree(int [] preorder,int[] inprder){
        return recursion(preorder,inprder,0,preorder.length-1,0, inprder.length-1);
    }

    public TreeNode recursion(int[] preorder,int[] inorder,int l1,int r1,int l2,int r2){
        if(l1==r1)
            return new TreeNode(preorder[l1]);
        if(l1>r1)
            return null;
        TreeNode treeNode=new TreeNode(preorder[l1]);
        int root=findroot(preorder[l1],inorder,l2,r2);
        int left_length= root-l2;

        treeNode.left=recursion(preorder,inorder,l1+1,l1+left_length,l2,root-1);
        treeNode.right=recursion(preorder,inorder,l1+left_length+1,r1,root+1,r2);
        return treeNode;
    }
    public int findroot(int root,int[] inorder,int l2,int r2){
        for (int i = l2; i <= r2; i++) {//我真特么坑，这个值是取得的
            if (inorder[i]==root)
                return i;
        }
        return 0;
    }
}
