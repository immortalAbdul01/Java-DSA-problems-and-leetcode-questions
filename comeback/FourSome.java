package comeback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSome {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;


        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1,r=n-1;
                while(l<r){
                    if(target<Integer.MIN_VALUE || target>Integer.MAX_VALUE) return new ArrayList<>();

                    long sum = 1L * nums[i] + nums[j] + nums[l] + nums[r];


                    if(sum==target){
                        System.out.println( nums[i]+" "+nums[j]+" "+nums[l]+" "+nums[r]);
                        List<Integer> l1 = new ArrayList(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        if(!list.contains(l1))
                            list.add(l1);
                    }

                    if(sum<target){
                        l++;
                    }else{
                        r--;
                    }

                }
            }
        }

        return list;
    }
    public static void main(String[] args) {
    int [] arr = {1000000000,1000000000,1000000000,1000000000};
fourSum(arr,-294967296);
    }
}
