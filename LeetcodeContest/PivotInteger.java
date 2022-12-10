package LeetcodeContest;

import java.util.ArrayList;
import java.util.List;

public class PivotInteger {
    public static void main(String[] args) {
        int [] arr ={3,2,1,4,5};
        System.out.println(countSubarrays(arr,4));
    }
    static  int pivot(int n ){
        int ans = 0 ;
        int left =0 ;
        int j = n ;
        for(int i = 0 ; i<=n;i++){
            ans+=i;

            left+=n;
            n--;
            if(ans==left){
                return i ;
            }


        }
        return -1;
    }
    static int countSubarrays(int[] nums, int k) {
        List<List<Integer>> list =subsetUsingIteration(nums);
        int count = 0 ;
        for (int i = 1 ; i<list.size();i++){
            int [] arr = new int[list.get(i).size()];
            for (int j = 0; j < list.get(i).size(); j++) {
                arr[j]=list.get(i).get(j);

            }
            int mid = arr.length/2;
            if(arr[mid]==k){
                count++;
            }
        }
        return count;
    }
    static List<List<Integer>> subsetUsingIteration(int []arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: arr)

        {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;

    }
}
