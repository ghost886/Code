package Two_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();//Map用法
  //      ArrayList<Integer> sub_list=new ArrayList<Integer>();//ArrayList用法
        int[] sub_list=new int[2];
        for (int i = 0; i <nums.length ; i++) {
            int left_target=target-nums[i];
            boolean isExist=map.containsKey(left_target);//map是否存在key
            if(isExist){
                sub_list[0]=map.get(left_target);//map获取key对应的value
                sub_list[1]=i;
                break;
            }
            else
                map.put(nums[i],i);
        }
        return sub_list;
    }
}



