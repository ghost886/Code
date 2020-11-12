package Invert_Binary_Tree;

import org.junit.Test;

public class test {
    @Test
    public void test1(){
        Solution solution=new Solution();
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        TreeNode right =new TreeNode(3);
        TreeNode left1=new TreeNode(4);
        TreeNode right1=new TreeNode(5);
        TreeNode left2=new TreeNode(6);
        root.left=left;
        root.right=right;
        left.left=left1;
        right.right=right1;
        left1.right=left2;
        TreeNode root1=solution.invertTree(root);
        System.out.println("计算完成");
    }
}
