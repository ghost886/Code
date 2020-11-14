package Maximun_Binary_Tree;

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null)
            return null;
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[max]<=nums[i])
                max=i;
        }
        TreeNode root=new TreeNode(nums[max]);
        int nums1[];
        if(max==0)
            nums1=null;
        else{
            nums1=new int[max];
            for (int i = 0; i < max; i++)
                nums1[i] = nums[i];
        }
        root.left=constructMaximumBinaryTree(nums1);

        int nums2[];
        if(nums.length-max-1==0)
            nums2=null;
        else {
            nums2=new int[nums.length-1-max];
            for (int i = 0; i < nums2.length; i++)
                nums2[i] = nums[i + max + 1];
            root.right = constructMaximumBinaryTree(nums2);
        }


        return root;
    }
}