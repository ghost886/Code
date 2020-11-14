package Populating_Next_Right_Pointers_in_Each_Node;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    //这道题目的思路也挺简单的，就是层次遍历，然后某些特定节点的地方不需要连接
    public Node connect(Node root) {
        Queue<Node> myQueue=new LinkedList<>();
        myQueue.add(root);
        int i=0,n=1;
        while(!myQueue.isEmpty()){
            i++;
            Node temp=myQueue.poll();
            if(temp!=null){
                myQueue.add(temp.left);
                myQueue.add(temp.right);
                if(i==Math.pow(2,n)-1){//因为是完美二叉树，所以可以这样写
                    n++;
                    temp.next=null;
                }
                else
                    temp.next= myQueue.peek();
                System.out.println(temp.val+" ");
            }
        }
        return root;
    }
}
