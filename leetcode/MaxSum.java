package leetcode;

import java.util.ArrayList;

public class MaxSum
{
    public static void main(String[] args) {
int [] arr = {10,12,19,14};
        System.out.println(maximumSum(arr));
    }
    public static int maximumSum(int[] nums) {
        int sum = 0 ;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sum=sumOfDigits(nums[i]);

            for (int j = i+1; j < nums.length; j++) {
            if(sum==sumOfDigits(nums[j])){
                list.add(nums[i]+nums[j]);
            }

            }


        }
        if(list.size()<1){
            return -1;
        }
        int max =0 ;
        for (int i = 0; i < list.size(); i++) {
            if(max<list.get(i)) {
                max = list.get(i);
            }
        }
        return max;

    }

    private static int sumOfDigits(int num) {
        int sum = 0 ;
        while(num!=0){
            int rem = num % 10;
            sum+=rem;
            num /= 10;
        }
        return sum;


    }
}
