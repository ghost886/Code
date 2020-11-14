package Maximun_Binary_Tree;

public class Solution1 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return recursion(nums,0,nums.length-1);
    }
    public TreeNode recursion(int[] nums,int l,int r){
        if(l>r)
            return null;
        int max=Maxi(nums,l,r);
        TreeNode treeNode=new TreeNode(nums[max]);
        treeNode.left=recursion(nums,l,max-1);
        treeNode.right=recursion(nums,max+1,r);
        return treeNode;
    }
    public int Maxi(int[] nums,int l,int r){
        int max=l;
        for (int i = l; i <= r; i++) {
            if(nums[max]<nums[i])
                max=i;
        }
        return max;
    }
}
