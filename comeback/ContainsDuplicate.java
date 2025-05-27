package comeback;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        int count=0;
        for(int i = 0 ; i<nums.length;i++){
            for(int j = 0 ; j<nums.length;j++){

                if(i!=j&&nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));



    }
}
