package leetcode;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        // this is the bese logic ever 
        if(nums.length==0||nums.length==1){
            return nums.length;
        }
        int j = 0 ;
        for(int i =0 ; i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i];
            }

        }
        nums[j++]=nums[nums.length-1];
        return j ;
    }
    public static void main(String[] args) {
        int ar [] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(ar));
    }
}
