package Recurrsion;

import java.util.ArrayList;
import java.util.List;

public class SubsetIterative {
    public static void main(String[] args) {
        int [] arr ={6,71,1};
        List<List<Integer>> ans = subset2(arr);
        for (List<Integer> an : ans) {
            System.out.println(an);

        }

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
    // Iterative approch for getting all possible subsets of an array of integer
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for (int k : arr) {

            int n = ans.size();

            for (int j = 0; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(ans.get(j));
                internal.add(k);
                ans.add(internal);

            }
        }
        return ans;
    }
    // one more time
    static List<List<Integer>> subset2(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);

            }

        }
        return outer;
    }
}
