package Find_Duplicate_subTrees;

import com.sun.deploy.security.SelectableSecurityManager;
import org.junit.Test;

import java.util.List;

public class test1 {
    @Test
    public void test(){
        TreeNode node9=new TreeNode(4);
        TreeNode node5=new TreeNode(2,node9,null);
        TreeNode node6=new TreeNode(4);
        TreeNode node4=new TreeNode(4);
        TreeNode node2=new TreeNode(2,node4,null);
        TreeNode node3=new TreeNode(3,node5,node6);
        TreeNode node1=new TreeNode(1,node2,node3);
        //这里可以体现“==”与equals的区别
        Solution solution = new Solution();
        //toString 说的是地址
        List<TreeNode> list=solution.findDuplicateSubtrees(node1);
    }
}
