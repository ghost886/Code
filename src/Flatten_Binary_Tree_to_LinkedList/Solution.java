package Flatten_Binary_Tree_to_LinkedList;
import java.util.Stack;

//这题的思路很简单，就是一个前序遍历
public class Solution {
    public void flatten(TreeNode root){
        TreeNode next=new TreeNode();
        TreeNode head=new TreeNode(0,null,next);//链表有一个head是很重要的
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode temp=stack.peek();
            stack.pop();//这个应该在哪里，得记住，要是放在if_null里面，那不就是无限循环了吗
            if(temp!=null){//前序遍历，放进取的顺序是很重要的
                stack.push(temp.right);
                stack.push(temp.left);

                next.right=temp;//这两步是传递的，一定要注意是否为空
                next.left=null;
                next=next.right;
            }
        }
        root=head.right;
    }
}
