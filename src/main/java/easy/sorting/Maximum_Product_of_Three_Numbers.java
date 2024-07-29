package easy.sorting;

import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-1, -2, -3}));
    }

    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = max1, max3 = max1, min1 = Integer.MAX_VALUE, min2 = min1;
        for(int x : nums){
            if(x > max3){
                max1 = max2;
                max2 = max3;
                max3 = x;
            }else if(x > max2){
                max1 = max2;
                max2 = x;
            }else if(x > max1)
                max1 = x;
            if(x < min1){
                min2 = min1;
                min1 = x;
            }else if(x < min2)
                min2 = x;
        }
        return Math.max((max1 * max2 * max3), (max3 * min1 * min2));
    }
}

//O(nlogn) solution
//Arrays.sort(nums);
//        int a = 0 , b = 0, n = nums.length;
//a = nums[0] * nums[1] * nums[n - 1];
//b = nums[n - 3] * nums[n - 2] * nums[ n - 1];
//        return Math.max(a, b);