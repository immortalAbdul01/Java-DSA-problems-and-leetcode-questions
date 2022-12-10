package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class fourSum {
    public static List<List<Integer>> fourSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();


            list=RecuursionForSubset(nums);



        for(int i = 0 ; i<list.size();i++){
            int sum = 0 ;
            for(int j = 0 ; j<list.get(i).size();j++){
                sum+=list.get(i).get(j);
                if(sum==target){
                    ans.add(list.get(i));
                }

            }

        }
        return ans;
    }
    static List<List<Integer>> RecuursionForSubset(int [] arr ){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr)

        {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if(internal.size()==4) {


                    outer.add(internal);
                }
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int [] arr = {1,0,-1,0,-2,2};
        List<List<Integer>> ans = fourSum2(arr,0);
        for (List<Integer> an:ans
             )
        {
            System.out.println(an);
        }

    }
}
