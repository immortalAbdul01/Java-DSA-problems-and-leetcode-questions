package leetcode;

public class SingleNonDuplicate {

        public static int singleNonDuplicate(int[] nums) {

            // working on this approach later on
            // I didn't got it
            int left = 0, right = nums.length-1;
            while(left < right){
                int mid = (left + right)/2;
                if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                    left = mid + 1;
                else
                    right = mid;
            }
            return nums[left];
        }

    public static void main(String[] args) {
int [] arr ={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
}
