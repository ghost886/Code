package Construct_Binary_Tree_From_Preorder_and_Inorder_Traversal;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        Solution solution=new Solution();
        int[] preorder={1,3,8,12,7,9,6,21,10};
        int[] inorder={12,8,3,7,1,6,21,9,10};
        TreeNode treeNode=solution.buildTree(preorder,inorder);
    }
}
