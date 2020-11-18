package Maximun_Depth_of_Binary_Tree;

import java.util.Map;
//递归，很自然的想法
public class Solution {
    public int maxDepth(TreeNode root) {
        return MaxD(root);
    }
    public int MaxD(TreeNode node){
        if(node==null)
            return 0;
        else{
            return 1+Math.max(MaxD(node.left),MaxD(node.right));
        }
    }
}
