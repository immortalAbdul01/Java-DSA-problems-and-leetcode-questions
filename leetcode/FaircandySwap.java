package leetcode;

import java.util.Arrays;

public class FaircandySwap {
    public static void main(String[] args) {
        int [] a = {1,1,};
        int [] b = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(a,b)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumAlice += aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            sumBob += bobSizes[i];
        }
        int diff = (sumAlice - sumBob) / 2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == diff) {
                    return new int[]{aliceSizes[i], bobSizes[j]};

                }
            }
        }
        return new int[]{aliceSizes[0], bobSizes[0]};
    }

}

