package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int count =0 ;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums.length;j++) {
                if(nums[i]==nums[j]){
                    count++;
                }

            }

            if(count>nums.length/3&&!list.contains(nums[i])){
                list.add(nums[i]);
            }
            count =0;
        }
        return list;
    }
}

