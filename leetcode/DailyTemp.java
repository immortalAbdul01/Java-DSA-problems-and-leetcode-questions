package leetcode;

import java.util.Arrays;

public class DailyTemp {
    public static void main(String[] args) {
        int [] ans = {30,40,50,60};
        System.out.println(Arrays.toString(DailyTemperatures(ans)));
    }
    static int [] DailyTemperatures(int [] temperatures){
        int [] ans = new int [ temperatures.length];
        int count = 1;
        for(int i = 0 ; i<temperatures.length-1;i++){
            for(int j = i+1 ; j < temperatures.length;j++){
                if(temperatures[i]>temperatures[j]){
                  count++;





                }
                else {
                 break;
                }
            }

            ans[i]=count;
            count=1;

        }
        return ans ;
    }
}
