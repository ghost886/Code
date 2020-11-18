package Find_Duplicate_subTrees;
import java.util.*;

//寻找一个数据结构中某个元素出现的次数，肯定要用hashmap,第一道的简单题就是这些
//另外就是如何遍历map,entryset的方法，还是foreach方法
//另外HashMap中存储时，存的时一个地址，而不是对象
class Solution {
    //这道题目的关键是将node序列化，获得每个节点的内容标志
    Map<String,Integer> map=new HashMap<>();
    List<TreeNode> list =new LinkedList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root){
        recursion(root);
        return list;
    }
    public String recursion(TreeNode root){
        if(root==null)
            return "$";
        String str=root.val+",left:"+recursion(root.left)+",right:"+recursion(root.right);
        if(map.containsKey(str)) {
            if (map.get(str) == 1)
                list.add(root);
            map.put(str,map.get(str)+1);
        }
        else
            map.put(str,1);
        return str;
    }
//    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
//        Map<String,Integer> map=new HashMap<>();
//        Stack<TreeNode> stack=new Stack<>();
//        stack.push(root);
//        List<TreeNode> list=new LinkedList<>();
//        while(!stack.isEmpty()){
//            TreeNode top=stack.pop();
//            if(top!=null) {
//                if(!map.containsKey(top.toString())){
//                    System.out.println("---此时还没有"+top.toString());
//                    map.put(top.toString(),1);
//                }
//                else {
////                    map.put(top, map.get(top) + 1);
//                    if(map.get(top.toString())==1)
//                        list.add(top);
//                    map.put(top.toString(),map.get(top.toString())+1);
//                    System.out.println("此时已经有了"+top.val);
//                }
//                stack.push(top.right);
//                stack.push(top.left);
//            }
//        }
//
//        return list;
//    }
}