package Leetcode_winter;

public class Twosum {
    public static int[]  twoSum(int[] nums, int target) {
        for(int i =0 ; i <nums.length;i++){
            for(int j = i+1; j<nums.length;j++){




                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {0,0};
    }

    public static void main(String[] args) {
        int [ ] arr ={ 3,2,4};

    twoSum(arr,6);
    }
}
