package Delete_Node_in_a_BST;
//下面这个说明白了为啥传进去了参数，值却没有改变
//https://blog.csdn.net/weixin_44259244/article/details/107009127?utm_medium=distribute.pc_relevant_t0.none-task-blog-searchFromBaidu-1.control&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-searchFromBaidu-1.control
public class Solution {
    //在二叉搜索树中删除一个节点的关键在于维持整棵二叉搜索树的结构，寻找下一个根节点
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode goal=find_node_parent(root,key);
        //这个goal依然只是一个引用，并不是原本的东西
        if(goal!=null){
            if(goal.left!=null&&goal.right!=null){
                TreeNode right_node=goal.left;
                while(right_node!=null) {
                    if(right_node.right==null)
                        break;
                    right_node = right_node.right;
                }
                goal.val=right_node.val;
                right_node=null;
            }
            else if(goal.right!=null||goal.left!=null){
                if(goal.left!=null)
                    goal=goal.left;
                else
                    goal=goal.right;
            }
            else
                goal=null;
        }
        return root;
    }

    public TreeNode find_node_parent(TreeNode node,int key){
        if(node==null)
            return null;
        else if((node.right!=null&&node.right.val==key)&&(node.left!=null&&node.left.val==key))
            return node;
        else{
            if(node.val>key)
                return find_node_parent(node.left,key);
            return find_node_parent(node.right,key);
        }
    }

}
