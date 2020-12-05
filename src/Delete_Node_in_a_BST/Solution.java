package Delete_Node_in_a_BST;

public class Solution {
    TreeNode parent;
    //在二叉搜索树中删除一个节点的关键在于维持整棵二叉搜索树的结构，寻找下一个根节点
    public TreeNode deleteNode(TreeNode root, int key) {
        if((root!=null&&isleaf(root)&&root.val==key)||root==null)
            return null;
        //这个goal依然只是一个引用，并不是原本的东西
        TreeNode goal=find_node(root,key);
        //这里处理的只有目标节点不是叶节点的情况
        if(goal!=null){
            change_node_to_leaf(goal);
            if (parent.right != null && parent.right.val == key)
                parent.right = null;
            else
                parent.left = null;
        }
        return root;
    }
    //将目标节点移到叶节点，并记录其父节点
    public void change_node_to_leaf(TreeNode goal){
        while(!isleaf(goal)){
            int a=goal.val;
            if(goal.right!=null){
                parent=goal;
                TreeNode noder=findSmallest(goal.right);
                goal.val=noder.val;
                goal=noder;
                goal.val=a;
            }
            else{
                parent=goal;
                TreeNode nodel=findLargest(goal.left);
                goal.val=nodel.val;
                goal=nodel;
                goal.val=a;
            }
        }
    }
    //寻找右子树中最小值，并记录parent
    public TreeNode findSmallest(TreeNode goal){
        while(goal.left!=null) {
            parent=goal;
            goal = goal.left;
        }
        return goal;
    }
    public TreeNode findLargest(TreeNode goal){
        while(goal.right!=null) {
            parent=goal;
            goal = goal.right;
        }
        return goal;
    }

    public TreeNode find_node(TreeNode node,int key){
        //对应树中没有这个值的情况
        if(node==null)
            return null;
        //对应树中有这个值，且该节点不是叶节点
        else if(node.val ==key){
            return node;
        }
        else{
            if(node.val>key) {
                //如果树中存在该节点，且为叶节点，直接处理了
                if(node.left!=null&&node.left.val==key&&isleaf(node.left)){
                    node.left=null;
                    return null;
                }
                return find_node(node.left, key);
            }
            if(node.right!=null&&node.right.val==key&&isleaf(node.right)){
                node.right=null;
                return null;
            }
            return find_node(node.right,key);
        }
    }
    public boolean isleaf(TreeNode node){
        if(node.right==null&&node.left==null)
            return true;
        return false;
    }
}
