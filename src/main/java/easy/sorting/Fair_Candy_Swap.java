package easy.sorting;

import java.util.HashMap;
import java.util.HashSet;

public class Fair_Candy_Swap {
    public static void main(String[] args) {

    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0, sum2 = 0, diff = 0;
        HashSet<Integer> nums = new HashSet<>();
        for(int i = 0; i < aliceSizes.length; i++) {
            sum1 += aliceSizes[i];
            nums.add(aliceSizes[i]);
        }
        for(int i = 0; i < bobSizes.length; i++)
            sum2 += bobSizes[i];
        diff = (sum1 - sum2) / 2;
        for(int i = 0; i < bobSizes.length; i++){
            int target = diff + bobSizes[i];
            if(nums.contains(target))
                return new int[]{target, bobSizes[i]};
        }
        return null;
    }
}
