package Two_Sum_II;

public class Solution {
    //这个Two Sum和第一个Two Sum相比，应该更加注重其算法，否则就和第一个想通了
    //使用双指针的思想进行
    //只要数组有序就要考虑到双指针的技巧，数组有序可以实现对于当前数字的加减
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int sum=numbers[left]+numbers[right];
        while(sum!=target){
            if(sum<target)
                left++;
            else if(sum>target)
                right--;
            else
                continue;
            sum=numbers[left]+numbers[right];
        }
        int res[]=new int[2];
        res[1]=right+1;
        res[0]=left+1;
        return res;
    }
}
