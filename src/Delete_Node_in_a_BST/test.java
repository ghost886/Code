package Delete_Node_in_a_BST;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        TreeNode node0=new TreeNode(0);
        TreeNode node3=new TreeNode(3);
        TreeNode node2=new TreeNode(2,null,node3);
        TreeNode node1=new TreeNode(1,node0,node2);
        TreeNode node5=new TreeNode(5);
        TreeNode node8=new TreeNode(8);
        TreeNode node7=new TreeNode(7,null,node8);
        TreeNode node6=new TreeNode(6,node5,node7);
        TreeNode node4=new TreeNode(4,node1,node6);
        Solution solution=new Solution();
        TreeNode node=solution.deleteNode(node4,0);
        System.out.println(node.val);
    }
}
