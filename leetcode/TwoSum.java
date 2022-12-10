package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
int [] arr = {2,3,4};
        System.out.println(Arrays.toString(twosum2(arr,6)));
    }
        static int[] twosum ( int[] numbers, int target){
// brute force solution

        for (int i = 0; i < numbers.length; i++) {

            for (int  j = 0; j < numbers.length; j++) {

                if(i!=j) {


                     if (numbers[i] + numbers[j] == target) {

                        return new int[]{i + 1, j + 1};

                    } else if (numbers[i] + numbers[j] > target) {
                        break;
                    }
                }
            }
        }
        return new int[]{0, 0};

}
static int[] twosum2 ( int[] numbers, int target) {
//two pointer faster approch
    int s = 0 ;
    int e = numbers.length-1;
    while (numbers[s]+numbers[e]!=target){
        if(numbers[s]+numbers[e]>target){
            e--;
        }
        else s++;
    }
    return new int[]{s+1,e+1};
}
}

